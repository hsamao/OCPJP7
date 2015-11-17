package com.samao.ocpjp.chapter14.concurrency;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by hsamao on 11/17/15.
 */
public class AtomicVariableTest {

    private static Integer integer = new Integer(0);
    private static AtomicInteger atomicInteger = new AtomicInteger(0);

    static class IntegerIncrementer extends Thread {
        public void run() {
            System.out.println("Incremented value of integer is: " + ++integer);
        }
    }

    static class AtomicIntegerIncrementer extends Thread {
        public void run() {
            System.out.println("Incremented value of atomic integer is: " + atomicInteger.incrementAndGet());
        }
    }

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            new IntegerIncrementer().start();
            new AtomicIntegerIncrementer().start();

        }
    }
}
