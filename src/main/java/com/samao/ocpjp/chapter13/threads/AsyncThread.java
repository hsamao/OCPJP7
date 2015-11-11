package com.samao.ocpjp.chapter13.threads;

/**
 * Created by hsamao on 11/11/15.
 */
public class AsyncThread extends Thread {

    @Override
    public void run() {
        System.out.println("Starting the thread " + getName());

        for (int i = 0; i < 3; i++) {
            System.out.println("In thread " + getName() + "; iteration " + i);
            try {
                sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main (String [] args){
        AsyncThread thread1 = new AsyncThread();
        AsyncThread thread2 = new AsyncThread();

        thread1.start();
        thread2.start();
    }
}
