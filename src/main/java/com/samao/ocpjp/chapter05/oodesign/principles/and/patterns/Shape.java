package com.samao.ocpjp.chapter05.oodesign.principles.and.patterns;

import org.springframework.stereotype.Component;

/**
 * Created by hsamao on 10/31/15.
 */
@Component
public abstract class Shape {

    private Shape parentShape;

    public void setParentShape(Shape parentShape) {
        this.parentShape = parentShape;
    }

    public Shape getParentShape() {
        return parentShape;
    }

    abstract double area();

}
