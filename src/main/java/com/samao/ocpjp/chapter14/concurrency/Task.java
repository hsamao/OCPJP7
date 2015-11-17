package com.samao.ocpjp.chapter14.concurrency;

/**
 * Created by hsamao on 11/17/15.
 */
public class Task implements Runnable {

    @Override
    public void run() {
        System.out.println("Calling Task.run() \n");
    }
}
