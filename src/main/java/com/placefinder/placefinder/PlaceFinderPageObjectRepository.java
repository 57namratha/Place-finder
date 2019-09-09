package com.placefinder.placefinder;

import com.placefinder.utils.ObjectRepository;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSFindBy;

//Contains the locators of Placefinder page's UI elements

public class PlaceFinderPageObjectRepository extends ObjectRepository {
    public PlaceFinderPageObjectRepository(AppiumDriver driver) {
        super(driver);
    }

    @AndroidFindBy(id = "etSearch")
    //Annotation to locate iOS app UI elements
//    @iOSFindBy()
    protected static MobileElement searchField;

    //Annotation to locate Android app UI elements
    @AndroidFindBy(xpath = "//android.widget.Button[@text='Search']")
    protected static MobileElement searchButton;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Place Finder']")
    protected static MobileElement homeScreenTitle;

}
