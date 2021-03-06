package com.samao.ocpjp.chapter04.advanced.class_design;

import org.springframework.stereotype.Component;

/**
 * Created by hsamao on 10/30/15.
 */

public enum PrinterType {

    DOTMATRIX(5), INKJET(10), LASER(50);

    private int pagePrintCapacity;

    PrinterType(int pagePrintCapacity) {
        this.pagePrintCapacity = pagePrintCapacity;
    }

    public int getPagePrintCapacity() {
        return pagePrintCapacity;
    }
}
