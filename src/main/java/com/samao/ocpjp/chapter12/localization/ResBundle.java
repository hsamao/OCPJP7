package com.samao.ocpjp.chapter12.localization;

import java.util.ListResourceBundle;

/**
 * Created by hsamao on 11/10/15.
 */
public class ResBundle extends ListResourceBundle {

    @Override
    protected Object[][] getContents() {
        return contents;
    }

    static final Object[][] contents = {{"MovieName", "Avatar"}, {"GrossRevenue", (Long) 2782275172L}, {"Year", (Integer) 2009}};
}
