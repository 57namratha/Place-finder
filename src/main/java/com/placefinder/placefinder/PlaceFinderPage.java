package com.placefinder.placefinder;

import com.placefinder.searchresult.SearchResultPage;
import com.placefinder.utils.Base;

public class PlaceFinderPage extends Base {
    private static PlaceFinderPageObjectRepository placeFinderPageObjectRepository;

    public PlaceFinderPage() {
        placeFinderPageObjectRepository = new PlaceFinderPageObjectRepository(driver);
    }
    SearchResultPage searchResult = new SearchResultPage();

    public boolean isPlaceFinderAppLoaded() {
        waitUntilElementIsVisible(placeFinderPageObjectRepository.homeScreenTitle);
        return placeFinderPageObjectRepository.homeScreenTitle.isDisplayed();
    }

    public boolean isSearchFieldDisplayed() {
        waitUntilElementIsVisible(placeFinderPageObjectRepository.searchField);
        return  placeFinderPageObjectRepository.searchField.isDisplayed();
    }

    public boolean isSearchButtonDisplayed() {
        waitUntilElementIsVisible(placeFinderPageObjectRepository.searchButton);
        return placeFinderPageObjectRepository.searchButton.isDisplayed();
    }

    public boolean search() {
        waitUntilElementIsVisible(placeFinderPageObjectRepository.searchField);
        placeFinderPageObjectRepository.searchField.sendKeys("daytonatec");
        waitUntilElementIsVisible(placeFinderPageObjectRepository.searchButton);
        placeFinderPageObjectRepository.searchButton.click();
        return searchResult.isSearchResultPageDisplayed();
    }







}
