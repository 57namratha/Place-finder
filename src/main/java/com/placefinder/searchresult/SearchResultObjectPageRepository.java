package com.placefinder.searchresult;

import com.placefinder.utils.ObjectRepository;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class SearchResultObjectPageRepository extends ObjectRepository {
    public SearchResultObjectPageRepository(AppiumDriver driver) {
        super(driver);
    }

    @AndroidFindBy(id = "ivToggleView")
    protected static MobileElement moreOptionButton;

}
