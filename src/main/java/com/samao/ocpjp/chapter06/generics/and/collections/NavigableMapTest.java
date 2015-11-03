package com.samao.ocpjp.chapter06.generics.and.collections;

import java.util.NavigableMap;
import java.util.TreeMap;

/**
 * Created by hsamao on 11/3/15.
 */
public class NavigableMapTest {

    public static void main (String [] args){

        NavigableMap<Integer, String> examScore = new TreeMap<>();

        examScore.put(10, "Bob");
        examScore.put(67, "John");
        examScore.put(90, "Susan");
        examScore.put(100, "Scott");

        System.out.println("The data in the map is :" + examScore);
        System.out.println("The data descending order is : " + examScore.descendingMap());
        System.out.println("The details of those who passed the exam : " + examScore.tailMap(40) );
        System.out.println("The lowest mark is : " + examScore.firstEntry());
    }
}
