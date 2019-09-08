package com.placefinder.searchresult;

import com.placefinder.utils.Base;

public class SearchResultPage extends Base {
    public static SearchResultObjectPageRepository searchResultObjectRepository;

    public SearchResultPage() {
        searchResultObjectRepository = new SearchResultObjectPageRepository(driver);
    }

    public boolean isSearchResultPageDisplayed() {
        waitUntilElementIsVisible(searchResultObjectRepository.moreOptionButton);
        return searchResultObjectRepository.moreOptionButton.isDisplayed();
    }

}
