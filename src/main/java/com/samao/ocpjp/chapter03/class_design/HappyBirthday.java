package com.samao.ocpjp.chapter03.class_design;

import org.springframework.stereotype.Component;

/**
 * Created by hsamao on 10/29/15.
 */

@Component
public class HappyBirthday {

    public  void wish(String name) {
        System.out.println("Happy birthday " + name + "!");
    }

    // overloaded wish method with no arguments; this method in turn invokes wish(String) method
    public void wish() {
        wish("to you");
    }

  }
