package pages.booking.form;

import core.BasePage;
import pages.booking.elements.BookItemDropDown;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author imy@ciklum.com
 */
public class BookingForm extends BasePage {
    private WebDriver driver;

    public BookingForm (WebDriver driver) {
        this.driver = driver;
    }

    public BookingForm clickNewBooking() {
        driver.findElement(Locators.NEW_BOOKING).click();
        return new BookingForm(driver);
    }

    public BookItemDropDown clickBookItem() {
        driver.findElement(Locators.BOOK_ITEM).click();
        return new BookItemDropDown(driver);
    }

    interface Locators {
        By NEW_BOOKING = By.xpath("//a[contains(text(),'New Booking')]");
        By BOOK_ITEM = By.xpath("//table[contains(text(), 'CPH Video Conference Room')]");
    }
}
