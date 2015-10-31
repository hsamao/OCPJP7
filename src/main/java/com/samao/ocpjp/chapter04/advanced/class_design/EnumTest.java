package com.samao.ocpjp.chapter04.advanced.class_design;

import org.springframework.stereotype.Component;

/**
 * Created by hsamao on 10/30/15.
 */

@Component
public class EnumTest {

    PrinterType printerType;

    public EnumTest() {
    }

    public EnumTest(PrinterType printerType) {
        this.printerType = printerType;
    }

    public void feature() {
        switch (printerType) {
            case DOTMATRIX:
                System.out.println("Dot-matrix printers are economical and almost obsolete");
                break;
            case INKJET:
                System.out.println("Inkjet printers provide decent quality prints");
                break;
            case LASER:
                System.out.println("Laser printers provide best quality prints");
                break;
        }
        System.out.println("Print page capacity per minute: " + printerType.getPagePrintCapacity());
    }
}
