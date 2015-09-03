package tests;

import core.BasePage;
import core.BaseTest;
import jdk.internal.org.xml.sax.Locator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MainPage;
import pages.SickDaysAndVacationsPage;

import java.util.concurrent.TimeUnit;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.internal.junit.ArrayAsserts.assertArrayEquals;

/**
 * @author imy@ciklum.com
 */
public class VacationsTest extends BaseTest {

    @BeforeClass
    public void setUpClass() {
        openBrowser();
        openPage("http://level2.ciklum.net/index.php");
    }

    @AfterClass
    public void tearDownClass() {
        closeBrowser();
    }

    @Test
    public void testCheckHowManyVacationsAvailableNow() {
        // Test data
        String login = "imy";
        String password = "***";
        int expectedVacationDays = 7;

        // Test steps
        LoginPage loginPage = new LoginPage();
        loginPage.inputLogin(login);
        loginPage.inputPassword(password);
        MainPage mainPage;
        mainPage = loginPage.clickSubmit();
//        MainPage.sleep(1000);
        mainPage.navigateToPage("Sick Days & Vacations");
        SickDaysAndVacationsPage vacationsDays = new SickDaysAndVacationsPage();
        /*SickDaysAndVacationsPage sickDaysAndVacationsPage;
        sickDaysAndVacationsPage = mainPage.clickSickDaysAndVacations();*/

        // Assertion
        assertEquals("Wrong expected vacations days number!", expectedVacationDays, vacationsDays.getVacationDays());

    }

    @Test
    public void testChecksThatNumberOfVacationsInFutureChanged() {
        // Test data
        String login = "imy";
        String password = "***";
        int expectedVacationDays = 7;

        // Test steps
        LoginPage loginPage = new LoginPage();
        loginPage.inputLogin(login);
        loginPage.inputPassword(password);
        MainPage mainPage = loginPage.clickSubmit();
        mainPage.navigateToPage("Sick Days & Vacations");
        SickDaysAndVacationsPage vacationsDays = new SickDaysAndVacationsPage();
        // vacationsDays =
        vacationsDays.clickOnCalendar();
        vacationsDays.selectFutureDay();
        vacationsDays.clickShowButton();

        assert (SickDaysAndVacationsPage.getVacationDays() != expectedVacationDays);
    }


}

