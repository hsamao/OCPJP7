package com.samao.ocpjp.chapter14.concurrency;

import java.util.concurrent.Semaphore;

/**
 * Created by hsamao on 11/15/15.
 */
public class ATMRoom {

    public static void main (String [] args) {
        Semaphore machines = new Semaphore(2);

        new Person(machines, "Mickey");
        new Person(machines, "Tom");
        new Person(machines, "Donald");
        new Person(machines, "Jerry");
        new Person(machines, "Casper");
    }
}
