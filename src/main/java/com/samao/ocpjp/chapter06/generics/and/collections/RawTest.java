package com.samao.ocpjp.chapter06.generics.and.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by hsamao on 11/2/15.
 */
public class RawTest {

    public static void main (String [] args) {

        List list = new LinkedList();
        list.add("first");
        list.add("second");

        List<String> stringList = list;

        for (Iterator<String> itemIterator = stringList.iterator(); itemIterator.hasNext();)
            System.out.println("Item : " + itemIterator.next());

        List<String> stringList1 = new LinkedList<>();
        stringList1.add("First");
        stringList1.add("Second");

        List list1 = stringList1;
        for (Iterator<String> itemIterator = list1.iterator(); itemIterator.hasNext();)
            System.out.println("Item : " + itemIterator.next());
    }
}
