package com.samao.ocpjp.chapter12.localization;

import java.util.Currency;
import java.util.Locale;

/**
 * Created by hsamao on 11/10/15.
 */
public class CurrencyDetails {

    public static void main (String [] args){

        Locale locale = Locale.getDefault();
        Currency currencyInstance = Currency.getInstance(locale);

        System.out.println("The currency code for locale "+ locale + " is :" + currencyInstance.getCurrencyCode());
    }
}
