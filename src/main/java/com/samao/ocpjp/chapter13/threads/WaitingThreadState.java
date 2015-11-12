package com.samao.ocpjp.chapter13.threads;

/**
 * Created by hsamao on 11/12/15.
 */
public class WaitingThreadState {

    public static void main (String [] args){
        Thread thread = new InfiniteWaitThread();
        thread.start();
        System.out.println(thread.getName() + ": I'm in state " + thread.getState());
    }
}
