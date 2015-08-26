package tests;

import core.BaseTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.MainPage;
import pages.SickDaysAndVacationsPage;
import static org.testng.AssertJUnit.assertEquals;
import static org.testng.internal.junit.ArrayAsserts.assertArrayEquals;

/**
 * @author imy@ciklum.com
 */
public class VacationsTest extends BaseTest {

    @BeforeClass
    public void setUpClass () {
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
        int expectedVacationDays = 4;

        // Test steps
        LoginPage loginPage = new LoginPage();
        loginPage.inputLogin(login);
        loginPage.inputPassword(password);
        MainPage mainPage;
        mainPage = loginPage.clickSubmit();
        SickDaysAndVacationsPage sickDaysAndVacationsPage;
        sickDaysAndVacationsPage = mainPage.clickSickDaysAndVacations();

        // Assertion
        assertEquals("Wrong expected vacations days number!", expectedVacationDays, sickDaysAndVacationsPage.getVacationDays());

    }

    @Test
    public void testChecksThatNumberOfVacationsInFutureChanged() {
        // Test data
        String login = "imy";
        String password = "***";
        int expectedVacationDays = 4;

        // Test steps
        LoginPage loginPage = new LoginPage();
        loginPage.inputLogin(login);
        loginPage.inputPassword(password);
        MainPage mainPage = loginPage.clickSubmit();
        SickDaysAndVacationsPage vacationsDays;
        vacationsDays = mainPage.clickSickDaysAndVacations();
        vacationsDays.clickOnCalendar();
        vacationsDays.selectFutureDay();
        vacationsDays.clickShowButton();

        assert(SickDaysAndVacationsPage.getVacationDays() != expectedVacationDays);
    }



}
