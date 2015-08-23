package pages;

import core.BasePage;
import pages.booking.form.NewBooking;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author imy@ciklum.com
 */
public class RoomBookingPage extends BasePage {


    public NewBooking clickNewBooking() {
        clickOn(Locators.NEW_BOOKING);
        return new NewBooking();
    }

interface Locators {
    By NEW_BOOKING = By.xpath("//a[contains(.,'New Booking')]");
}
}

