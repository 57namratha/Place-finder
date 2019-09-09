package com.placefinder.utils;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//Base class of all the page classes in the POM. It contain common methods which is used throughout the application.

public class Base {
    private final long TIMEOUT =5;
    public static AppiumDriver driver;

    //wait until the element is visible on the screen before throwing an exception
    protected void waitUntilElementIsVisible(WebElement element){
        try {
            WebDriverWait driverWait = new WebDriverWait(driver, TIMEOUT);
            driverWait.until(ExpectedConditions.visibilityOf(element));
        } catch (Exception e) {
            System.out.println("Exception: No such element "+ e.getMessage());
        }

    }

}

