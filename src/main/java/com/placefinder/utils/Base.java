package com.placefinder.utils;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {
    private final long TIMEOUT =5;
    public static AppiumDriver driver;

    protected void waitUntilElementIsVisible(WebElement element){
        try {
            WebDriverWait driverWait = new WebDriverWait(driver, TIMEOUT);
            driverWait.until(ExpectedConditions.visibilityOf(element));
        } catch (Exception e) {
            System.out.println("Exception: No such element "+ e.getMessage());
        }

    }

    public AppiumDriver getDriver() {
        return driver;
    }
}

