package com.samao.ocpjp.chapter13.threads;

/**
 * Created by hsamao on 11/12/15.
 */
public class ThreadStateProblem {

    public static void main (String [] args){
        Thread thread = new Thread();
        thread.start();
        thread.start();
    }
}
