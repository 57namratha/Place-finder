package com.placefinder.searchresult;

import com.placefinder.utils.Base;
//Contains the methods which operate on the search result page elements

public class SearchResultPage extends Base {
    public static SearchResultObjectPageRepository searchResultObjectRepository;

    public SearchResultPage() {
        searchResultObjectRepository = new SearchResultObjectPageRepository(driver);
    }

    //Verify if search result page is displayed
    public boolean isSearchResultPageDisplayed() {
        waitUntilElementIsVisible(searchResultObjectRepository.moreOptionButton);
        return searchResultObjectRepository.moreOptionButton.isDisplayed();
    }

}
