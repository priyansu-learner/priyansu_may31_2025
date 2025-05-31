package com.example.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.junit.Assert;

public class HomePage {
     private WebDriver driver;

    // Constructor to initialize driver
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    private By inputfield = By.name("inputField");
    private By submitButton = By.name("subBtn");
    private By pageHeader = By.id("pageheader");
    private By logo = By.id("pageLogo");
    private By loginLink = By.id("login");
    private By registerLink = By.id("register");

    // Actions
    public void open() {
        driver.get("https://www.agrichain.com");
    }

    public void verifyPageURL(String URL) {
        Assert.assertTrue(driver.getCurrentUrl().contains(URL));
    }
    public void verifyPageHeader(String header) {
        String actualText = driver.findElement(pageHeader).getText();
        Assert.assertEquals(header, actualText);
    }

    public void verifyPageLogo () {
        driver.findElement(logo).isDisplayed();
    }

    public void verifyLoginLink () {
        driver.findElement(loginLink).isDisplayed();
    }

    public void verifyRegisterLink () {
        driver.findElement(registerLink).isDisplayed();
    }

    public void enterInput(String input) {
        driver.findElement(inputfield).sendKeys(input);
    }

    public void clickSubmitButton() {
        driver.findElement(submitButton).isEnabled();
        driver.findElement(submitButton).click();
    }

    
}
