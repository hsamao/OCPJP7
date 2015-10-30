package com.samao.ocpjp.chapter03.class_design;

import org.springframework.stereotype.Component;

/**
 * Created by hsamao on 10/29/15.
 */

@Component
public class Overloaded {

    public void aMethod(long val1, int val2) {
        System.out.println("long + int");
    }

    public void aMethod(int val1, long val2) {
        System.out.println("int + long");
    }

}
