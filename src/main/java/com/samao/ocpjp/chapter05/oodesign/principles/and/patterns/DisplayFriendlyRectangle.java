package com.samao.ocpjp.chapter05.oodesign.principles.and.patterns;

/**
 * Created by hsamao on 11/1/15.
 */
public class DisplayFriendlyRectangle implements DisplayFriendlyShape {

    int length, height;

    public DisplayFriendlyRectangle() {
    }

    public DisplayFriendlyRectangle(int length, int height) {
        this.length = length;
        this.height = height;

        System.out.println("Display Friendly Rectangle constructor");
    }

    public void draw() {
        System.out.println("Display Friendly Rectangle draw ()");
    }
}
