package com.samao.ocpjp.chapter06.generics.and.collections;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by hsamao on 11/2/15.
 */
public class ListIteratorTest {

    public static void main(String[] args) {

        String palindrome = "madam";

        List<Character> plmdList = new LinkedList<>();
        for (char aChar : palindrome.toCharArray()) {
            plmdList.add(aChar);
        }

        System.out.println(plmdList);

        ListIterator<Character> listIterator = plmdList.listIterator();
        ListIterator<Character> prvsListIterator = plmdList.listIterator(plmdList.size());

        boolean plm = true;

        while (listIterator.hasNext() && prvsListIterator.hasPrevious()) {
            if (listIterator.next() != prvsListIterator.previous()) {
                plm = false;
                break;
            }
        }

        if (plm) {
            System.out.println(palindrome + " is palindrome");
        } else System.out.println(palindrome + "is not palindrome");
    }
}
