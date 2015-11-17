package com.samao.ocpjp.chapter14.concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by hsamao on 11/17/15.
 */
public class ATMMachine {

    public static void main(String[] args) {

        Lock machine = new ReentrantLock();

        new Client(machine, "Joe");
        new Client(machine, "Tom");
        new Client(machine, "Casper");
        new Client(machine, "David");
        new Client(machine, "Chris");
    }


}
