package com.samao.ocpjp.chapter14.concurrency;

/**
 * Created by hsamao on 11/17/15.
 */
public class BlockerQueueTest1 {

    public static void main (String [] args){
        final BlockerQueue blockerQueue = new BlockerQueue(2);

        new Thread(){
            public void run (){
                System.out.println("Thread1: attempting to remove an item from the queue ");
                Object o = blockerQueue.remove();
            }
        }.start();

        new Thread(){
            public void run (){
                System.out.println("Thread2: attempting to insert an item to the queue");
                blockerQueue.insert("one");
            }
        }.start();
    }
}
