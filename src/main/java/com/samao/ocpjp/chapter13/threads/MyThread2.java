package com.samao.ocpjp.chapter13.threads;

import org.springframework.stereotype.Component;

/**
 * Created by hsamao on 11/11/15.
 */

@Component
public class MyThread2 implements Runnable {

    public MyThread2() {
    }

    @Override
    public void run() {
        System.out.println("In run method; thread name is: " + Thread.currentThread().getName());
    }
}
