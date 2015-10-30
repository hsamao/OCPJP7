package com.samao.ocpjp.chapter04.advanced.class_design;

import org.springframework.stereotype.Component;

/**
 * Created by hsamao on 10/30/15.
 */

@Component
 abstract public class Shape {

    public double getArea (double side) {
        return 0;
    }

    public abstract void description ();



    /*final public void setParentShape () {

    }

    public Shape getParentShape () {
        return null;
    }*/


}
