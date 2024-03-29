package com.placefinder.utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.URL;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public class InitiateDriver {
    private AppiumDriver driver;
    private HashMap<String, String> getProperties;


    //Driver initialization
    public InitiateDriver() {
        try
        {
            getProperties = PropertyReader.getPropValues("config.properties");
            String runOn = getProperties.get("runOn");
            if(runOn.equalsIgnoreCase("ANDROID")) {
                //Initiate the appium driver for Android
                driver = new AndroidDriver(new URL(getProperties.get("appiumURL")), getCapabilities(runOn));
                driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            } else if(runOn.equalsIgnoreCase("IOS")) {
                //Initiate the appiu driver for iOS
                driver = new IOSDriver(new URL(getProperties.get("appiumURL")), getCapabilities(runOn));
                driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }

    //Return the driver
    public AppiumDriver getAppiumDriver()
    {
        if(driver==null)
            throw new RuntimeException("Driver has not been instantiated");

        return driver;
    }

    //Return the desired capabilites based on the platform used in the config properties
    private DesiredCapabilities getCapabilities(String runOn)
    {
        DesiredCapabilities capabilities = null;

        try
        {
            if (runOn.equalsIgnoreCase("ANDROID"))
            {
                capabilities=new DesiredCapabilities();
                capabilities.setCapability("deviceName", getProperties.get("deviceName"));
                capabilities.setCapability("platformName", "Android");
                capabilities.setCapability("platformVersion", getProperties.get("platformVersion"));
                capabilities.setCapability("app", new File("src\\main\\resources\\"+getProperties.get("app")));
                capabilities.setCapability("appPackage", getProperties.get("appPackage"));
                capabilities.setCapability("appActivity", getProperties.get("appActivity"));
                capabilities.setCapability("automationName", getProperties.get("androidAutomationName"));
                capabilities.setCapability("autoGrantPermissions", true);

            }
            else if (runOn.equalsIgnoreCase("IOS"))
            {
                capabilities=new DesiredCapabilities();
                capabilities.setCapability("deviceName", getProperties.get("deviceName"));
                capabilities.setCapability("platformName", "iOS");
                capabilities.setCapability("platformVersion", getProperties.get("platformVersion"));
                capabilities.setCapability("udid", getProperties.get("udid"));
                capabilities.setCapability("app", new File("src\\main\\resources\\"+getProperties.get("app")));
                capabilities.setCapability("appPackage", getProperties.get("appPackage"));
                capabilities.setCapability("appActivity", getProperties.get("appActivity"));
                capabilities.setCapability("automationName", getProperties.get("iOSAutomationName"));
                capabilities.setCapability("autoGrantPermissions", true);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return capabilities;
    }
}
