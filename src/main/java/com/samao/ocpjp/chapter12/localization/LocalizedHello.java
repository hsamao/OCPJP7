package com.samao.ocpjp.chapter12.localization;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by hsamao on 11/10/15.
 */
public class LocalizedHello {
    public static void main (String [] args){
//        Locale.setDefault(Locale.ITALIAN);
        Locale currentLocale = Locale.getDefault();
        System.out.println(currentLocale);
        ResourceBundle resourceBundle = ResourceBundle.getBundle("ResourceBundle", currentLocale);
        System.out.println(resourceBundle.getString("Greeting"));
    }
}
