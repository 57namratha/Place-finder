package com.placefinder.utils;

import io.appium.java_client.AppiumDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class TestBase {
    protected AppiumDriver driver;

    @BeforeSuite(alwaysRun=true)
    public void setup()
    {
        InitiateDriver initiateDriver = new InitiateDriver();
        driver = initiateDriver.getAppiumDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        Base.driver=driver;
    }

    @AfterSuite(alwaysRun = true)
    public void teardown()
    {
        driver.quit();
    }

}
