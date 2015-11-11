package com.samao.ocpjp.chapter12.localization;

import java.text.DateFormat;
import java.util.Date;

/**
 * Created by hsamao on 11/10/15.
 */
public class DateStyleFormats {

    public static void main(String[] args) {

        Date now = new Date();

        int[] dateStyleFormats = {DateFormat.SHORT, DateFormat.MEDIUM, DateFormat.LONG,
                DateFormat.FULL, DateFormat.DEFAULT};

        System.out.println("Today's date in different styles are: ");

        for (int dateStyleFomat : dateStyleFormats) {
            DateFormat dateFormat = DateFormat.getDateInstance(dateStyleFomat);
            System.out.println(dateFormat.format(now));
        }
    }
}
