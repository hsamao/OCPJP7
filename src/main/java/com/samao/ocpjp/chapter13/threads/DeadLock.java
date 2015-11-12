package com.samao.ocpjp.chapter13.threads;

/**
 * Created by hsamao on 11/11/15.
 */
public class DeadLock {

    public static void main(String args[]) throws InterruptedException {
        CounterRunBall c = new CounterRunBall();
// create two threads and start them at the same time
        Thread t1 = new Thread(c);
        Thread t2 = new Thread(c);
        t1.start();
        t2.start();
        System.out.println("Waiting for threads to complete execution. . .");
        t2.join();
        t2.join();
        System.out.println("Done.");
    }
}
