package com.placefinder.placefinder;

import com.placefinder.searchresult.SearchResultPage;
import com.placefinder.utils.Base;

//Contains the methods which operate on the Placefinder page elements

public class PlaceFinderPage extends Base {
    private static PlaceFinderPageObjectRepository placeFinderPageObjectRepository;

    public PlaceFinderPage() {
        placeFinderPageObjectRepository = new PlaceFinderPageObjectRepository(driver);
    }
    SearchResultPage searchResult = new SearchResultPage();

    //Verify Place finder screen is displayed on launch
    public boolean isPlaceFinderAppLoaded() {
        waitUntilElementIsVisible(placeFinderPageObjectRepository.homeScreenTitle);
        return placeFinderPageObjectRepository.homeScreenTitle.isDisplayed();
    }

    //Verify search text field is displayed
    public boolean isSearchFieldDisplayed() {
        waitUntilElementIsVisible(placeFinderPageObjectRepository.searchField);
        return  placeFinderPageObjectRepository.searchField.isDisplayed();
    }

    //Verify search button is displayed
    public boolean isSearchButtonDisplayed() {
        waitUntilElementIsVisible(placeFinderPageObjectRepository.searchButton);
        return placeFinderPageObjectRepository.searchButton.isDisplayed();
    }

    //Verify on search user is navigated to search result page
    public boolean search() {
        waitUntilElementIsVisible(placeFinderPageObjectRepository.searchField);
        placeFinderPageObjectRepository.searchField.sendKeys("daytonatec");
        waitUntilElementIsVisible(placeFinderPageObjectRepository.searchButton);
        placeFinderPageObjectRepository.searchButton.click();
        return searchResult.isSearchResultPageDisplayed();
    }







}
