package pages;

import core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author imy@ciklum.com
 */
public class MainPage extends BasePage {

    public SickDaysAndVacationsPage clickSickDaysAndVacations() {
        waitPageLoaded(Locators.SICK_DAYS_AND_VACATIONS_BUTTON,1000, "Sick days and vacations button not");
        clickOn(Locators.SICK_DAYS_AND_VACATIONS_BUTTON);
        return new SickDaysAndVacationsPage();
    }

    public RoomBookingPage clickRoomBooking() {
        clickOn(Locators.ROOM_BOOKING);
        return new RoomBookingPage();
    }

    /*public void navigateToPage(String linkText){
        By LINK = (By.xpath(String.format(Locators.GENERAL_LINK_DIRECTORY_NAVIGATE_XPATH, linkText)));
        clickOn(LINK);

    }*/

    public SickDaysAndVacationsPage navigateToPage  (String linkText){
        By LINK = (By.xpath(String.format(Locators.GENERAL_LINK_DIRECTORY_NAVIGATE_XPATH, linkText)));
        clickOn(LINK);
        return new SickDaysAndVacationsPage();

    }
/*    WebDriver driver = new FirefoxDriver();
    driver.get("http://somedomain/url_that_delays_loading");
    WebElement myDynamicElement = (new WebDriverWait(driver, 10))
            .until(ExpectedConditions.presenceOfElementLocated(By.id("myDynamicElement")));*/

        interface Locators {
        By SICK_DAYS_AND_VACATIONS_BUTTON = By.linkText("Sick Days & Vacations");
        By ROOM_BOOKING = By.xpath("//a[2]/span");
        String GENERAL_LINK_DIRECTORY_NAVIGATE_XPATH = "//span[@class='ui-button-text'][text()='%s']";
    }
}
//div[@id='body']/a/span