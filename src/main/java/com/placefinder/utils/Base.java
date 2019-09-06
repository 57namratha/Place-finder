package com.placefinder.utils;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Base {
    public static long wait=60;
    public static AppiumDriver driver;

    public static void waitUntilElementIsVisible(WebElement element){
        WebDriverWait wwait = new WebDriverWait(driver, wait);
        wwait.until(ExpectedConditions.visibilityOf(element));
    }

}
