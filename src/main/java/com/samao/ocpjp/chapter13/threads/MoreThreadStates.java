package com.samao.ocpjp.chapter13.threads;

/**
 * Created by hsamao on 11/12/15.
 */
public class MoreThreadStates {

    public static void main(String [] args){
        SleepyThread thread1 = new SleepyThread();
        SleepyThread thread2 = new SleepyThread();

        thread1.start();
        thread2.start();

        System.out.println(thread1.getName() + ": I'm in state " + thread1.getState());
        System.out.println(thread2.getName() + ": I'm in state " + thread2.getState());
    }
}
