package com.samao.ocpjp.chapter14.concurrency;

import java.util.PriorityQueue;

/**
 * Created by hsamao on 11/16/15.
 */
public class PriorityQueueExample {

    public static void main(String[] args) {
        final PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        new Thread() {
            public void run() {
                System.out.println("The removed element is: " + priorityQueue.remove());
            }
        }.start();

        new Thread() {
            public void run() {
                priorityQueue.add(10);
                System.out.println("Successfully added an element to the queue ");
            }
        }.start();
    }
}
