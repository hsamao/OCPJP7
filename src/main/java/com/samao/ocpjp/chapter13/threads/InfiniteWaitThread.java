package com.samao.ocpjp.chapter13.threads;

/**
 * Created by hsamao on 11/12/15.
 */
public class InfiniteWaitThread extends Thread {

    static boolean okayToRun = false;

    synchronized public void run() {
        while (!okayToRun){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
