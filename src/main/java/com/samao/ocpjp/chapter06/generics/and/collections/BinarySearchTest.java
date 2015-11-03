package com.samao.ocpjp.chapter06.generics.and.collections;

import java.util.Arrays;

/**
 * Created by hsamao on 11/3/15.
 */
public class BinarySearchTest {

    public static void main(String[] args) {
        String[] strArr = {"21", "22", "11", "12", "13"};
        System.out.println("The given strArr is: " + Arrays.toString(strArr));

        int index = Arrays.binarySearch(strArr, "22");
        System.out.println("The index value is: " + index);
    }
}
