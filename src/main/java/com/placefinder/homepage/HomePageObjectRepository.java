package com.placefinder.homepage;

import com.placefinder.utils.ObjectRepository;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class HomePageObjectRepository extends ObjectRepository {
    public HomePageObjectRepository(AppiumDriver driver) {
        super(driver);
    }

    @AndroidFindBy(id = "etSearch")
    protected static MobileElement searchField;

    @AndroidFindBy(xpath = "//android.widget.Button[@text='Search']")
    protected static MobileElement searchButton;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Place Finder']")
    protected static MobileElement homeScreenTitle;

}
