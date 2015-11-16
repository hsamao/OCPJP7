package com.samao.ocpjp.chapter14.concurrency;

import java.util.concurrent.PriorityBlockingQueue;

/**
 * Created by hsamao on 11/16/15.
 */
public class PriorityBlockingQueueExample {

    public static void main(String[] args) {
        final PriorityBlockingQueue<Integer> priorityBlockingQueue = new PriorityBlockingQueue<>();

        new Thread() {
            public void run() {
                try {
                    System.out.println("The removed element is: "
                            + priorityBlockingQueue.take());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }.start();

        new Thread() {
            public void run() {
                priorityBlockingQueue.add(10);
                System.out.println("Successfully added an element to the queue ");
            }
        }.start();
    }


}
