package com.samao.ocpjp.chapter08.io.fundamentals;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by hsamao on 11/5/15.
 */
public class Type {

    public static void main (String [] files){

        if(files.length == 0){
            System.err.println("pass the name of file (s) as argument\n");
            System.exit(-1);
        }

        for (String file : files){
            try (FileReader inputFile = new FileReader(file)){
                int ch = 0;
                while ((ch = inputFile.read()) != -1) {
                    System.out.println((char) ch);
                }

            }
            catch (FileNotFoundException ex){
                System.err.printf("Cannot open the file %s", file);
            }

            catch (IOException ex){
                System.err.printf("Error when processing file %s... skipping it", file);
            }
        }
    }
}
