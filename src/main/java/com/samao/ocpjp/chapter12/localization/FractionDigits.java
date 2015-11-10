package com.samao.ocpjp.chapter12.localization;

import java.text.NumberFormat;
import java.text.ParseException;

/**
 * Created by hsamao on 11/10/15.
 */
public class FractionDigits {

    public static void main (String [] args){
        String [] numbers = {"1.222", "0.12345F"};
        double [] doubles = {1.222, 0.12345F};
        int [] number = {1, 3, 4};

        NumberFormat numberFormat = NumberFormat.getInstance();
        numberFormat.setMaximumFractionDigits(2);

        System.out.println("Using Formant Method: ");
        for (double val : doubles){
            System.out.println(numberFormat.format(val));
        }

        System.out.println("Using Parse Method: ");
        for(String val : numbers){
            try {
                System.out.println(numberFormat.parse(val));
            } catch (ParseException e) {
                e.printStackTrace();
            }
        }
    }
}
