package core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * @author imy@ciklum.com
 */
public class DriverFactory {
    public static WebDriver createInstance(String browserName) {
        WebDriver driver = null;

        if (browserName.equals("firefox") || browserName.equals("ff")) {
            driver = startFirefox();

        } else if (browserName.equals("chrome")) {
            driver = startChrome();

        } else {
            throw new IllegalArgumentException("Unknown browser name: " + browserName + "!");
        }

        return driver;
    }

    private static WebDriver startFirefox() {

        return new FirefoxDriver();
    }

    private static WebDriver startChrome() {

        return new ChromeDriver();
    }
}
