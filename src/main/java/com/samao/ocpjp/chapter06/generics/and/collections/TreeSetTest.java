package com.samao.ocpjp.chapter06.generics.and.collections;

import java.util.Set;
import java.util.TreeSet;

/**
 * Created by hsamao on 11/3/15.
 */
public class TreeSetTest {

    public static void main(String[] args) {

        String pangrm = "the quick brown fox jumps over the lazy dog";

        Set<Character> pgrm = new TreeSet<>();

        for (char achar : pangrm.toCharArray()) {
            pgrm.add(achar);
        }

        System.out.println("original sentence before sorting : " + pangrm);
        System.out.println("same sentence after sorting : " + pgrm);
    }
}
