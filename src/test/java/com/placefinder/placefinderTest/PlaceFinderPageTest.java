package com.placefinder.placefinderTest;

import com.placefinder.Pages;
import com.placefinder.utils.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PlaceFinderPageTest extends TestBase {

    @Test(priority = 1, groups={"UI"})
    public void isPlaceFinderScreenDisplayed() {
        Assert.assertTrue(Pages.HomePage().isPlaceFinderAppLoaded(), "Failed to load Place Finder screen");
    }

    @Test(priority = 2, groups={"UI"})
    public void isSearchFieldDisplayed() {
        Assert.assertTrue(Pages.HomePage().isSearchFieldDisplayed(), "Search text field is not displayed");
    }

    @Test(priority = 3, groups={"UI"})
    public void isSearchButtonDisplayed() {
        Assert.assertTrue(Pages.HomePage().isSearchButtonDisplayed(), "Search button is not displayed");
    }

    @Test(priority = 4, groups={"Functional"})
    public void isNavigatedToSearchScreen() {
        Assert.assertTrue(Pages.HomePage().search(), "Failed to navigate to search page");
    }

}
