package com.example.tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import com.example.utils.testDataUtil;

import com.example.browserInitialization.browserInitialize;
import com.example.pageObjects.HomePage;
import com.example.pageObjects.ResultsPage;

public class TC_Verify_ResultsPage extends browserInitialize {
    private HomePage homePage;
    private ResultsPage resultsPage;

    @Before
    public void setUpTest() {
        setUp();  // initialize browser
        homePage = new HomePage(driver);
        resultsPage = new ResultsPage(driver);
    }

    @Test
    public void testSearch() throws InterruptedException {
        homePage.open();
        homePage.verifyPageURL(testDataUtil.get("homePage.homepageURL"));
        homePage.verifyPageHeader(testDataUtil.get("homePage.homepageHeader"));
        homePage.verifyPageLogo();
        homePage.verifyLoginLink();
        homePage.verifyRegisterLink();
        homePage.enterInput(testDataUtil.get("homePage.enterInputValue"));
        homePage.clickSubmitButton();
        resultsPage.verifyOutputValue(testDataUtil.get("resultsPage.outputValue"));
        resultsPage.clickOnBackToHomeBtn();
        homePage.verifyPageURL(testDataUtil.get("homePage.homepageURL"));
    }

    @After
    public void tearDownTest() {
        tearDown();  // close browser
    }
}
