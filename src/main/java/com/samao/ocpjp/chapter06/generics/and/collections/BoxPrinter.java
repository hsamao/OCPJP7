package com.samao.ocpjp.chapter06.generics.and.collections;

import org.springframework.stereotype.Component;

/**
 * Created by hsamao on 11/2/15.
 */

@Component
public class BoxPrinter {

    private Object object;

    public BoxPrinter() {
    }

    public BoxPrinter(Object object) {
        this.object = object;
    }

    public Object getObject() {
        return object;
    }

    @Override
    public String toString() {
        return "[" + object +
                ']';
    }
}
