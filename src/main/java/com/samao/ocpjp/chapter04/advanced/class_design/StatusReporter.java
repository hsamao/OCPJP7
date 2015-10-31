package com.samao.ocpjp.chapter04.advanced.class_design;

import org.springframework.stereotype.Component;

/**
 * Created by hsamao on 10/30/15.
 */

@Component
public class StatusReporter {

    public static Shape.Color getDescriptiveColor(final Shape.Color color) {

        return new Shape.Color() {
            @Override
            public String toString() {
                return "You selected a color with RGB values " + color;
            }
        };
    }


}
