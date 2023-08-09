package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {
    protected WebDriver driver;

    // Constructor
    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    // Common methods
    protected WebElement findElement(By locator) {
        return driver.findElement(locator);
    }

    protected void clickElement(By locator) {
        WebElement element = findElement(locator);
        element.click();
    }

    protected void enterText(By locator, String text) {
        WebElement input = findElement(locator);
        input.sendKeys(text);
    }
}
