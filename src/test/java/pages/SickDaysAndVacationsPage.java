package pages;

import core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



/**
 * @author imy@ciklum.com
 */
public class SickDaysAndVacationsPage extends BasePage {


    public void clickOnCalendar() {
    clickOn(Locators.CALENDAR);
    }

    public void selectFutureDay() {
        clickOn(Locators.FUTURE_DAY);
    }

    public void clickShowButton() {
        clickOn(Locators.SHOW);
    }

    public static int getVacationDays() {
        return Integer.parseInt(String.valueOf(Locators.CURRENT_VACATIONS));
    }

    interface Locators {
        By CURRENT_VACATIONS = By.xpath("//table[contains(@class, 'employeeData')]/tbody/tr[11]/td[5]");
        By CALENDAR = By.cssSelector("#f-calendar-trigger-2 > img[alt=\"Calendar\"]");
        By FUTURE_DAY = By.xpath("//div[3]/table/tbody/tr[5]/td[6]");
        By SHOW = By.xpath("//input[@value='Show']");

    }
}