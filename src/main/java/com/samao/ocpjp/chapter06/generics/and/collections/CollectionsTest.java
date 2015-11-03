package com.samao.ocpjp.chapter06.generics.and.collections;

import java.util.Arrays;

/**
 * Created by hsamao on 11/3/15.
 */
public class CollectionsTest {

    public static void main(String []args) {
        String [] strArr = { "21", "1", "111", "12", "123" };
        Arrays.sort(strArr);
        System.out.println(Arrays.toString(strArr));
        int [] intArr = { 21, 1, 111, 12, 123 };
        Arrays.sort(intArr);
        System.out.println(Arrays.toString(intArr));
    }
}
