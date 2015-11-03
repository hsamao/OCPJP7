package com.samao.ocpjp.chapter06.generics.and.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by hsamao on 11/3/15.
 */
public class ArrayAsList {

    public static void main (String [] args) {

        Double [] weeklyTemperature = {31.1, 30.0, 32.5, 34.9, 33.7, 27.8};

        // Converting Native array (Double []) to Container (List)
        List <Double> temperature = Arrays.asList(weeklyTemperature);

        System.out.println("Maximum temperature recorded was " +  Collections.max(temperature));

        System.out.println("Minimum temperature recorded was " + Collections.min(temperature));
    }
}
