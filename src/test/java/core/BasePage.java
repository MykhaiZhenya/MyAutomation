package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Thread.sleep;

/**
 * @author imy@ciklum.com
 */
public class BasePage {

    public static WebElement $(By locator) {
        return DriverManager.getDriver().findElement(locator);
    }

    public static List<WebElement> $$(By locator) {
        return DriverManager.getDriver().findElements(locator);
    }

    public static void clickOn(By locator) {
        $(locator).click();
    }

    public static void inputText(By locator, String text) {
        WebElement el = $(locator);
        el.clear();
        el.sendKeys(text);
    }

    public static void sleep(int milliseconds) {
        try {
            Thread.currentThread().sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void waitPageLoaded(By locator, int timeout, String assertionMessage) {
        int counter = 0;
        boolean displayed = false;
        while (counter != timeout && displayed == false) {
            try {
                displayed = $(locator).isDisplayed();
            } catch (Exception e) {
                sleep(1000);
                counter += 1;
            }
        }
        if (!displayed) {
            throw new AssertionError("'" + assertionMessage + "' page object was loaded in " + String.valueOf(timeout) + " seconds!");
        }
    }
}
