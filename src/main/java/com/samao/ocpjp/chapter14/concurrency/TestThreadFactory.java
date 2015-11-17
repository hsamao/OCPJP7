package com.samao.ocpjp.chapter14.concurrency;

import java.util.concurrent.ThreadFactory;

/**
 * Created by hsamao on 11/17/15.
 */
public class TestThreadFactory {

    public static void main (String [] args){

        ThreadFactory threadFactory = new MaxPriorityThreadFactory();
        Thread thread = threadFactory.newThread(new ARunnable());

        System.out.println("The name of the thread is " + thread.getName());
        System.out.println("The priority of the thread is " + thread.getPriority());
    }
}
