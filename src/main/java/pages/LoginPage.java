package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    // Locators
    private By emailInputLocator = By.id("input-email");
    private By passwordInputLocator = By.id("input-password");
    private By loginButtonLocator = By.xpath("//*[@id=\"content\"]/div/div[2]/div/div/form/input");
    private By logoutButtonLocator = By.xpath("//*[@id=\"column-right\"]/div/a[14]");
    private By forgottenPasswordLinkLocator = By.linkText("Forgotten Password");
    private By logoutLinkLocator = By.linkText("Logout");

    // Constructor
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    // Methods
    public void enterEmail(String email) {
        enterText(emailInputLocator, email);
    }

    public void enterPassword(String password) {
        enterText(passwordInputLocator, password);
    }

    public void clickLoginButton() {
        clickElement(loginButtonLocator);
    }

    public void clickLogoutButton() {
        clickElement(logoutButtonLocator);
    }

    public void clickForgottenPasswordLink() {
        clickElement(forgottenPasswordLinkLocator);
    }

    public boolean checkForgotPwdLink() {
        return findElement(forgottenPasswordLinkLocator).isDisplayed();
    }

    public boolean checkLogoutLink() {
        return findElement(logoutLinkLocator).isDisplayed();
    }

    public void login(String email, String password) {
        enterEmail(email);
        enterPassword(password);
        clickLoginButton();
    }

    public String getForgotPwdPageUrl() {
        return driver.getCurrentUrl();
    }
}
