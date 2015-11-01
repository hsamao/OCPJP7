package com.samao.ocpjp.chapter05.oodesign.principles.and.patterns;

/**
 * Created by hsamao on 11/1/15.
 */
public class Logger {

    public static Logger myInstance;

    private Logger() {

    }

    public static Logger getMyInstance() {
        if (myInstance == null) {
            myInstance = new Logger();
        }
        return myInstance;
    }

    public void log(String string) {
        System.err.println(string);
    }
}
