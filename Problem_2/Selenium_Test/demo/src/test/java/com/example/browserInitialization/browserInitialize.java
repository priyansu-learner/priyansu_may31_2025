package com.example.browserInitialization;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browserInitialize {
     protected WebDriver driver;

    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\bin\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
