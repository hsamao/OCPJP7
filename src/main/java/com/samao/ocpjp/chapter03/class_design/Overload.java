package com.samao.ocpjp.chapter03.class_design;

import org.springframework.stereotype.Component;

/**
 * Created by hsamao on 10/29/15.
 */

@Component
public class Overload {

    public void aMethod(int val) {
        System.out.println("int");
    }

    public void aMethod(short val) {
        System.out.println("short");
    }

    public void aMethod(Object val) {
        System.out.println("Object");
    }

    public void aMethod(String val) {
        System.out.println("String");

    }
}
