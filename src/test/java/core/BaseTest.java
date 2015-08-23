package core;

import org.openqa.selenium.WebDriver;

/**
 * @author imy@ciklum.com
 */
public class BaseTest {

    public void openBrowser() {
        String browserName = System.getProperty("browser");
        WebDriver driver = DriverFactory.createInstance(browserName);
        DriverManager.setWebDriver(driver);
    }

    public void closeBrowser() {
        WebDriver driver = DriverManager.getDriver();
        if (driver != null) {
            driver.quit();
        }
    }

    public void openPage(String url) {
        DriverManager.getDriver().get(url);
    }
}
