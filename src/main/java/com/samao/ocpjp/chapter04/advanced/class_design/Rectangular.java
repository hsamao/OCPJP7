package com.samao.ocpjp.chapter04.advanced.class_design;

import org.springframework.stereotype.Component;

/**
 * Created by hsamao on 10/30/15.
 */

@Component
 public class Rectangular extends Shape{


    @Override
    public double getArea(double side) {
        return side * side;
    }

    @Override
    public void description() {
        System.out.print("Rectangular area is: ");
    }

}
