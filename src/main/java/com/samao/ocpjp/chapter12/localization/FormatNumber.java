package com.samao.ocpjp.chapter12.localization;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

/**
 * Created by hsamao on 11/10/15.
 */
public class FormatNumber {

    public static void main(String[] args) {

        long tenMillion = 10_000_000l;

        NumberFormat germanFormant = NumberFormat.getCurrencyInstance(Locale.GERMANY);
        String localizedTenMillion = germanFormant.format(tenMillion);

        System.out.println("Ten Million in German local is " + localizedTenMillion);

        try {
            Number parsedAmount = germanFormant.parse(localizedTenMillion);

            if (tenMillion == parsedAmount.longValue()) {
                System.out.println("Successfully parsed the number for the locale");
            }
        } catch (ParseException e) {
            System.err.println("Error: Cannot parse the number for the locale");
        }

    }
}
