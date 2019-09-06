package com.placefinder.utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.URL;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public class InitiateDriver {
    private AppiumDriver driver;
    private HashMap<String, String> getProperties;

    public InitiateDriver() {
        try
        {
            getProperties = PropertyReader.getPropValues("config.properties");
            String runOn = getProperties.get("runOn");
            driver = new AndroidDriver(new URL(getProperties.get("appiumURL")), getCapabilities(runOn));
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }

    public AppiumDriver getAppiumDriver()
    {
        if(driver==null)
            throw new RuntimeException("Driver has not been instantiated");

        return driver;
    }

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
                capabilities.setCapability("app", getProperties.get("app"));
                capabilities.setCapability("appPackage", getProperties.get("appPackage"));
                capabilities.setCapability("appActivity", getProperties.get("appActivity"));
            }
            else if (runOn.equalsIgnoreCase("IOS"))
            {
                capabilities=new DesiredCapabilities();
                capabilities.setCapability("deviceName", getProperties.get("deviceName"));
                capabilities.setCapability("platformName", "iOS");
                capabilities.setCapability("platformVersion", getProperties.get("platformVersion"));
                capabilities.setCapability("udid", getProperties.get("udid"));
                capabilities.setCapability("app", getProperties.get("app"));
                capabilities.setCapability("appPackage", getProperties.get("appPackage"));
                capabilities.setCapability("appActivity", getProperties.get("appActivity"));
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

        return capabilities;
    }
}
