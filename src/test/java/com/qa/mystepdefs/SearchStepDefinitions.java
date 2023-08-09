package com.qa.mystepdefs;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pages.LoginPage;
import pages.SearchPage;

public class SearchStepDefinitions {

    private WebDriver driver;
    private SearchPage searchPage;

    @Before
    public void setup(){
        driver = new ChromeDriver();
    }

    @After
    public void tearDown(){
        if(driver!=null){
            driver.quit();
        }
    }

    @Given("I am on the home page")
    public void i_am_on_the_home_page() {
        driver.get("https://ecommerce-playground.lambdatest.io/");
        searchPage = new SearchPage(driver);
    }

    @Given("I enter {string} in the search field")
    public void i_enter_search_text(String text) {
        searchPage.enterText(text);
    }

    @When("I click on the search button")
    public void i_click_on_the_search_button() {
        searchPage.clickSearchButton();
    }

    @Then("I should see search results")
    public void i_should_see_search_results() {

        By productLocator = By.xpath("//*[@id=\"entry_212469\"]/div");

        int productCount = driver.findElements(productLocator).size();

        Assert.assertTrue(productCount > 0, "Search results are not displayed.");
    }

}
