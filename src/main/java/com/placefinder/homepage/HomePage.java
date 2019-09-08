package com.placefinder.homepage;

import com.placefinder.searchresult.SearchResultPage;
import com.placefinder.utils.Base;

public class HomePage extends Base {
    private static HomePageObjectRepository homePageObjectRepository;

    public HomePage() {
        homePageObjectRepository = new HomePageObjectRepository(driver);
    }
    SearchResultPage searchResult = new SearchResultPage();

    public boolean isPlaceFinderAppLoaded() {
        waitUntilElementIsVisible(homePageObjectRepository.homeScreenTitle);
        return homePageObjectRepository.homeScreenTitle.isDisplayed();
    }

    public boolean isSearchFieldDisplayed() {
        waitUntilElementIsVisible(homePageObjectRepository.searchField);
        return  homePageObjectRepository.searchField.isDisplayed();
    }

    public boolean isSearchButtonDisplayed() {
        waitUntilElementIsVisible(homePageObjectRepository.searchButton);
        return homePageObjectRepository.searchButton.isDisplayed();
    }

    public boolean search() {
        waitUntilElementIsVisible(homePageObjectRepository.searchField);
        homePageObjectRepository.searchField.sendKeys("daytonatec");
        waitUntilElementIsVisible(homePageObjectRepository.searchButton);
        homePageObjectRepository.searchButton.click();
        return searchResult.isSearchResultPageDisplayed();
    }







}
