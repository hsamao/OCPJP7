package com.samao.ocpjp.chapter05.oodesign.principles.and.patterns;

/**
 * Created by hsamao on 11/1/15.
 */
public class RectangleFactoryDesignPattern implements ShapeFactoryDesignPattern {

    int length, height;

    public RectangleFactoryDesignPattern() {
    }

    public RectangleFactoryDesignPattern(int length, int height) {
        this.length = length;
        this.height = height;
    }

    public void draw() {
        System.out.println("draw rectangle");
    }

    public void fillColor() {
        System.out.println("fill rectangle");
    }
}
