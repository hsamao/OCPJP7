package com.samao.ocpjp.chapter08.io.fundamentals;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;

/**
 * Created by hsamao on 11/5/15.
 */
public class ClassFileMagicNumberChecker {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Pass the file name as an argument");
            System.exit(-1);
        }
        String fileName = args[0];
        byte[] magicNumber = {(byte) 0xCA, (byte) 0xFE, (byte) 0xBA, (byte) 0xBE};
        try (FileInputStream fis = new FileInputStream(fileName)) {
            byte[] u4Buffer = new byte[4];
            if (fis.read(u4Buffer) != -1) {
                if (Arrays.equals(magicNumber, u4Buffer)) {
                    System.out.printf("The magic number for passed file %s " +
                            "matches that of a .class file", fileName);
                } else {
                    System.out.printf("The magic number for passed file %s does" +
                            " not match that of a .class file", fileName);
                }
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Error: file was not found");

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
