package com.samao.ocpjp.chapter06.generics.and.collections;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by hsamao on 11/3/15.
 */
public class QueueTest {

    public static void main (String [] args) {

        Queue<String> loginSequence = new LinkedList<>();

        loginSequence.add("Harrison");
        loginSequence.add("McCartney");
        loginSequence.add("Starr");
        loginSequence.add("Lennon");

        System.out.println("The login sequence is " + loginSequence);

        while (!loginSequence.isEmpty()){
            System.out.println("Removing .... " + loginSequence.remove());
        }
    }
}
