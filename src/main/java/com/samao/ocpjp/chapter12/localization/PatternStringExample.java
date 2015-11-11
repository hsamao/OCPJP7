package com.samao.ocpjp.chapter12.localization;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by hsamao on 11/11/15.
 */
public class PatternStringExample {
    public static void main(String[] args) {
        String pattern = "dd-MM-yy";
        SimpleDateFormat formatter = new SimpleDateFormat(pattern);
        System.out.println(formatter.format(new Date()));

    }
}
