package com.samao.ocpjp.chapter06.generics.and.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by hsamao on 11/2/15.
 */
public class TestIterator {
    public static void main (String [] args) {
        List<Integer> numList = new ArrayList<>();

        for (int i = 0; i < 10; i++)
            numList.add(i);


        System.out.println("Original numList : " + numList);

        // retrieving data list
        for(Integer num : numList) {
            System.out.println(num);
        }

        // retrieving data list
        for (Iterator<Integer> itemIter = numList.iterator(); itemIter.hasNext();){
            System.out.println(itemIter.next());
        }

        // removing list elements
        Iterator<Integer> iterator = numList.iterator();
       do {
            iterator.next();
            iterator.remove();
        }  while (iterator.hasNext());

        System.out.println("numlist after removing elements");

    }
}
