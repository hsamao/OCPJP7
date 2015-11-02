package com.samao.ocpjp.chapter06.generics.and.collections;

import org.springframework.stereotype.Component;

import java.util.Vector;

/**
 * Created by hsamao on 11/2/15.
 */

@Component
public class OldContainerTest {
    
    Vector flaotValue;

    public Vector getFlaotValue() {
        return flaotValue;
    }

    public void setFlaotValue(Vector flaotValue) {
        this.flaotValue = flaotValue;
    }
}
