package com.placefinder.utils;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import java.io.File;

public class TestListener extends Base implements ITestListener {
    public void onTestStart(ITestResult var1){

    }

    public void onTestSuccess(ITestResult var1){

    }

    //Take screenshot on test method failure
    public void onTestFailure(ITestResult result){
        String methodName = result.getName();
        screenShot(methodName,driver);
    }


    //Take screenshot
    public void screenShot(String methodName, AppiumDriver driver){
        String filePath = "./src/test/resources/";
        File src = driver.getScreenshotAs(OutputType.FILE);
        try {
            FileHandler.copy(src, new File(filePath+methodName + ".png"));
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    public void onTestSkipped(ITestResult var1){

    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult var1){

    }

    public void onStart(ITestContext var1){

    }

    public void onFinish(ITestContext var1){

    }

}
