package pages;

import core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author imy@ciklum.com
 */
public class LoginPage extends BasePage {

    public LoginPage() {
        waitPageLoaded(Locators.LOGIN_FIELD, 5, "Login BasePage");
    }

    public void inputLogin(String login) {
        inputText(Locators.LOGIN_FIELD, login);
    }

    public void inputPassword(String password) {
       inputText(Locators.PASSWORD_FIELD, password);
    }

    public MainPage clickSubmit() {
        clickOn(Locators.SUBMIT_BUTTON);
        return new MainPage();
    }

    interface Locators {
        By LOGIN_FIELD = By.cssSelector("#mod_login_username");
        By PASSWORD_FIELD = By.cssSelector("#mod_login_password");
        By SUBMIT_BUTTON = By.xpath("//input[@name='Submit']");
        // By GENERAL_LINK_XPATH = By.xpath("//div[contains(text(), '%s')]");

    }
}
