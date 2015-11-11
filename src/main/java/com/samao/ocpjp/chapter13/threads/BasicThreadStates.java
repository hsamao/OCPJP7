package com.samao.ocpjp.chapter13.threads;

/**
 * Created by hsamao on 11/11/15.
 */
public class BasicThreadStates extends Thread {

    public static void main(String[] args) throws InterruptedException {

        Thread thread = new Thread(new BasicThreadStates());

        System.out.println("Just after creating a thread\n" + "The thread state is " + thread.getState());

        thread.start();
        System.out.println("Just after calling start method\n" + "The thread state is " + thread.getState());

        thread.join();
        System.out.println("Just after calling join method\n" + "The thread state is " + thread.getState());
    }
}
