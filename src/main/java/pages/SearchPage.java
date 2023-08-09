package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage extends BasePage {
    // Locators
    private By searchInputLocator = By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div[2]/input");
    private By searchButtonLocator = By.xpath("//*[@id=\"search\"]/div[2]/button");

    // Constructor
    public SearchPage(WebDriver driver) {
        super(driver);
    }

    // Methods
    public void enterText(String text) {
        enterText(searchInputLocator, text);
    }

    public void clickSearchButton() {
        clickElement(searchButtonLocator);
    }
}
