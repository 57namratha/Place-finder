package com.placefinder.utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.FieldDecorator;
import java.util.concurrent.TimeUnit;

public class ObjectRepository {
    public static long wait = 10;

    public ObjectRepository(AppiumDriver driver){
        FieldDecorator fieldDecorator= new AppiumFieldDecorator(driver, wait, TimeUnit.SECONDS);
        //Page factory method to initialize the UI elements
        PageFactory.initElements(fieldDecorator, this);
    }
}
