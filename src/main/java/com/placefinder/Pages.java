package com.placefinder;

import com.placefinder.placefinder.PlaceFinderPage;
import com.placefinder.searchresult.SearchResultPage;
import com.placefinder.utils.Base;

public class Pages {
    private static <T extends Base> T getPage(Class<T> pageType)  {
        T page;
        try {
            page = pageType.newInstance();
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }

        return page;
    }

    public static PlaceFinderPage HomePage() {return getPage(PlaceFinderPage.class);}
    public static SearchResultPage SearchResultPage() {return getPage(SearchResultPage.class);}
}
