package com.example.pageObjects;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ResultsPage {
    private WebDriver driver;

    public ResultsPage(WebDriver driver) {
        this.driver = driver;
    }

    // Locators
    private By outputValue = By.name("output");
    private By backToHomeButton = By.name("backtohome");

    // Actions
    public void verifyOutputValue(String value) {
        String actualText = driver.findElement(outputValue).getText();
        Assert.assertTrue(actualText.contains(value));
    }
    public void clickOnBackToHomeBtn() {
        driver.findElement(backToHomeButton).click();
    }
}
