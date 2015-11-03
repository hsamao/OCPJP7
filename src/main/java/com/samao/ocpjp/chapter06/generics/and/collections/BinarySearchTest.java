package com.samao.ocpjp.chapter06.generics.and.collections;

import java.util.Arrays;

/**
 * Created by hsamao on 11/3/15.
 */
public class BinarySearchTest {

    public static void main(String[] args) {
        String[] strArr = {"21", "22", "11", "12", "13"};
        System.out.println("\n \tThe given strArr is: " + Arrays.toString(strArr));

        Arrays.sort(strArr);
        System.out.println("\n \tstrArr after sorting is " + Arrays.toString(strArr));

        int index = Arrays.binarySearch(strArr, "22");
        System.out.println("\n \tThe index value is: " + index);
    }
}
