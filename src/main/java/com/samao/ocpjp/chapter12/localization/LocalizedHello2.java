package com.samao.ocpjp.chapter12.localization;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by hsamao on 11/10/15.
 */
public class LocalizedHello2 {

    public static void printMovieDetails(ResourceBundle resourceBundle) {
        String movieName = resourceBundle.getString("MovieName");
        Long revenue = (Long) resourceBundle.getObject("GrossRevenue");
        Integer year = (Integer) resourceBundle.getObject("Year");

        System.out.println("Movie " + movieName + "(" + year + ")" + " grossed "
                + revenue);
    }

    public static void main(String[] args) {

        Locale locale = Locale.getDefault();
        printMovieDetails(ResourceBundle.getBundle("ResBundle", locale));
// print the largest box-office hit movie for Italian locale
        locale = new Locale("it", "IT", "");
        printMovieDetails(ResourceBundle.getBundle("ResBundle", locale));
    }
}
