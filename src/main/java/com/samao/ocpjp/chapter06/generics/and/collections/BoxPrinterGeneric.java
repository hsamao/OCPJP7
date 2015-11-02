package com.samao.ocpjp.chapter06.generics.and.collections;

import org.springframework.stereotype.Component;

/**
 * Created by hsamao on 11/2/15.
 */

@Component
public class BoxPrinterGeneric <T> {

    private T value;

    public BoxPrinterGeneric() {
    }

    public BoxPrinterGeneric(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "[" + value +
                ']';
    }
}
