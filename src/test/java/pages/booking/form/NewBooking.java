package pages.booking.form;

import core.BasePage;
import org.openqa.selenium.By;

import pages.RoomBookingPage;
import pages.booking.elements.DatePicker;
import pages.booking.elements.Item;

/**
 * @author imy@ciklum.com
 */
public class NewBooking extends BasePage {

    public Item selectInBookItem() {

        clickOn(Locators.ITEM);
        return new Item();
    }

    public RoomBookingPage cancelNewBooking() {
        $(Locators.CANCEL).getText();
        return new RoomBookingPage();

        }

    public static DatePicker openDatePicker() {
        clickOn(Locators.DATE_PICKER);
        return new DatePicker();
    }

    interface Locators {
        //By SUBMIT_BUTTON = By.xpath(" //button[contains(.,'Submit')]");
        By ITEM = By.xpath("//option[contains(.,'CPH Video Conference Room')]");
        By CANCEL = By.xpath("//button[2]");
        By GENERAL_ELEMENT_XPATH = By.xpath("//span[contains(.,'August')]");
        By DATE_PICKER = By.className("ui-datepicker-month");
    }
}

