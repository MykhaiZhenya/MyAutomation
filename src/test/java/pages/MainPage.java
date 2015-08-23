package pages;

import core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author imy@ciklum.com
 */
public class MainPage extends BasePage {

    public SickDaysAndVacationsPage clickSickDaysAndVacations() {
        clickOn(Locators.SICK_DAYS_AND_VACATIONS_BUTTON);
        return new SickDaysAndVacationsPage();
    }

    public RoomBookingPage clickRoomBooking() {
        clickOn(Locators.ROOM_BOOKING);
        return new RoomBookingPage();
    }

    interface Locators {
        By SICK_DAYS_AND_VACATIONS_BUTTON = By.xpath("//div[@id='body']/a/span");
        By ROOM_BOOKING = By.xpath("//a[2]/span");
    }
}
