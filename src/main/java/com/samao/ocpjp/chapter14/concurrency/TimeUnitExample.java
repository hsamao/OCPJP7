package com.samao.ocpjp.chapter14.concurrency;

import java.util.concurrent.TimeUnit;

/**
 * Created by hsamao on 11/17/15.
 */
public class TimeUnitExample {

    public static void main (String [] args) throws InterruptedException {
        System.out.println("Calling sleep() method on main thread for 2 seconds");
        Thread.sleep(TimeUnit.SECONDS.toMillis(2));
        System.out.println("Main thread wakes up from sleep");
    }
}
