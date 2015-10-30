package com.samao.ocpjp.chapter04.advanced.class_design;

import org.springframework.stereotype.Component;

/**
 * Created by hsamao on 10/30/15.
 */

@Component
public class Counter {

    private int count = 0;

    public Counter() {
        count ++;
    }

    public void numberOfInstances() {
        System.out.println("number of instances so far is :" + count);
    }
}
