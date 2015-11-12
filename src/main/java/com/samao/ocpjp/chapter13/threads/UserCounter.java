package com.samao.ocpjp.chapter13.threads;

/**
 * Created by hsamao on 11/11/15.
 */
public class UserCounter implements Runnable {

    public static void increment() {

            Counter.count++;
            System.out.print(Counter.count + " ");
    }

    @Override
    public void run() {
        increment();
        increment();
        increment();
    }
}
