package com.placefinder.utils;

import io.appium.java_client.AppiumDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

//Base method of all the test classes

import java.util.concurrent.TimeUnit;

public class TestBase {
    protected AppiumDriver driver;

    //Initialize the driver before all the test methods in the suite will have run
    @BeforeSuite(alwaysRun=true)
    public void setup()
    {
        InitiateDriver initiateDriver = new InitiateDriver();
        driver = initiateDriver.getAppiumDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Base.driver=driver;
    }

    //Quit the app after all the test methods in the test suite are run
    @AfterSuite(alwaysRun = true)
    public void teardown()
    {
        driver.quit();
    }

}
