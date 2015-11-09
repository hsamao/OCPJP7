package com.samao.ocpjp.chapter11.exception.and.assertion;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 * Created by hsamao on 11/9/15.
 */
public class ThrowsClause4 implements IntReader {

    @Override
    public int readIntFromFile() throws FileNotFoundException {
        Scanner consoleScanner = new Scanner(new File("integer.txt"));
        return consoleScanner.nextInt();
    }
}
