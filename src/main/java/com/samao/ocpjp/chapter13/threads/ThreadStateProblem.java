package com.samao.ocpjp.chapter13.threads;

/**
 * Created by hsamao on 11/12/15.
 */
public class ThreadStateProblem extends Thread {

    synchronized public void run(){

        try {
            wait(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main (String [] args){

        new ThreadStateProblem().start();
    }
}
