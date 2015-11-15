package com.samao.ocpjp.chapter14.concurrency;

import java.util.concurrent.CountDownLatch;

/**
 * Created by hsamao on 11/15/15.
 */
public class Runner extends Thread {

    private CountDownLatch timer;

    public Runner(CountDownLatch timer, String name) {
        this.timer = timer;
        this.setName(name);
        System.out.println(getName() + " is ready and waiting for countdown to start");
        start();
    }

    public void run() {
        try {
            timer.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(this.getName() + " started running");
    }

}
