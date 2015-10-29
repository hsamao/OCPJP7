package com.samao.ocpjp.chapter03.class_design.listing_3_1;

import org.springframework.stereotype.Component;

/**
 * Created by hsamao on 10/29/15.
 */

@Component
public class Square extends Shape {

    private int side;

    public void setSide(int side) {
        this.side = side;
    }

    @Override
    public double area() {
        return (side * side);
    }
}
