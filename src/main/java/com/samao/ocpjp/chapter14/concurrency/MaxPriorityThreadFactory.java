package com.samao.ocpjp.chapter14.concurrency;

import java.util.concurrent.ThreadFactory;

/**
 * Created by hsamao on 11/17/15.
 */
public class MaxPriorityThreadFactory implements ThreadFactory {

    private static long count = 0;

    @Override
    public Thread newThread(Runnable r) {
        Thread temp = new Thread(r);
        temp.setName("priorityThread " + count++);
        temp.setPriority(Thread.MAX_PRIORITY);
        return temp;
    }
}
