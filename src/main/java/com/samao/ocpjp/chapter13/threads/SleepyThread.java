package com.samao.ocpjp.chapter13.threads;

/**
 * Created by hsamao on 11/12/15.
 */
public class SleepyThread extends Thread {

    public void run() {
        synchronized (SleepyThread.class) {
            try {
                Thread.sleep(10000);
                System.out.println(Thread.currentThread().getName() + " released the lock");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
