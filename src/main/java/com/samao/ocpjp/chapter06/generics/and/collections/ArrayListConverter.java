package com.samao.ocpjp.chapter06.generics.and.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by hsamao on 11/3/15.
 */
public class ArrayListConverter {

    public static void main(String[] args) {

        Double[] temperatureArray = {31.1, 30.0, 32.5, 34.9, 33.7, 27.8};
        System.out.println("The original array is: " + Arrays.toString(temperatureArray));

        List<Double> temperatureList = new ArrayList<>(Arrays.asList(temperatureArray));

        System.out.println("The new List with an added element is: " + temperatureList);

    }
}
