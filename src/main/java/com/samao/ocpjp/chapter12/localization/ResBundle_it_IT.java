package com.samao.ocpjp.chapter12.localization;

import java.util.ListResourceBundle;

/**
 * Created by hsamao on 11/10/15.
 */
public class ResBundle_it_IT extends ListResourceBundle {

    public Object[][] getContents() {
        return contents;
    }

    static final Object[][] contents = {
            {"MovieName", "Che Bella Giornata"},
            {"GrossRevenue", (Long) 43000000L}, // in euros
            {"Year", (Integer) 2011}
    };
}
