package com.samao.ocpjp.chapter13.threads;

import org.springframework.stereotype.Component;

/**
 * Created by hsamao on 11/11/15.
 */

@Component
public class MyThread1 extends Thread {

    public void run (){
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("In run method, thread name is " + getName());
    }
}
