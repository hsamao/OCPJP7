package com.samao.ocpjp.chapter05.oodesign.principles.and.patterns;

/**
 * Created by hsamao on 11/1/15.
 */
public class LoggerMultiThreaded {

    public static LoggerMultiThreaded myInstance;

    private LoggerMultiThreaded() {

    }

    public static synchronized LoggerMultiThreaded getMyInstance() {
        if (myInstance == null)
            myInstance = new LoggerMultiThreaded();
        return myInstance;
    }

    public void log(String string) {

        //log implementation
        System.err.println(string);
    }
}
