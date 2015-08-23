package tests;

import core.BaseTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.booking.elements.DatePicker;
import pages.booking.form.NewBooking;

import org.junit.Test;

import pages.*;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertTrue;


/**
 * @author imy@ciklum.com
 */
public class RoomBookingOptionsTest extends BaseTest {

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
    public void testChecksThatRoomForSelectedLocationIsPresented() {
        //Test data
        String login = "imy";
        String password = "5IJzWNRz";
        String expectedItem = "CPH Video Conference Room";


        //Test steps
        LoginPage loginPage = new LoginPage();
        loginPage.inputLogin(login);
        loginPage.inputPassword(password);
        MainPage mainPage = loginPage.clickSubmit();
        RoomBookingPage bookingPage = mainPage.clickRoomBooking();
        NewBooking newBooking = bookingPage.clickNewBooking();


        //Assertion
        assertEquals(expectedItem, newBooking.selectInBookItem());

    }


    @Test

    public void testChecksThatDatePickerIsPresented() {
        //Test data
        String login = "imy";
        String password = "5IJzWNRz";

        //Test steps
        LoginPage loginPage = new LoginPage();
        loginPage.inputLogin(login);
        loginPage.inputPassword(password);
        MainPage mainPage = loginPage.clickSubmit();
        RoomBookingPage bookingPage = mainPage.clickRoomBooking();
        NewBooking newBooking = bookingPage.clickNewBooking();
        DatePicker datePicker = newBooking.openDatePicker();


        //Assertion
        assertEquals("August", NewBooking.openDatePicker());

    }

        @Test
    public void testChecksCancelBooking() {
        //Test data
        String login = "imy";
        String password = "5IJzWNRz";

        //Test steps
        LoginPage loginPage = new LoginPage();
        loginPage.inputLogin(login);
        loginPage.inputPassword(password);
        MainPage mainPage = loginPage.clickSubmit();
        RoomBookingPage bookingPage = mainPage.clickRoomBooking();
        NewBooking newBooking = bookingPage.clickNewBooking();

        //Assertion
        assertEquals("Cancel", newBooking.cancelNewBooking());
    }

}
