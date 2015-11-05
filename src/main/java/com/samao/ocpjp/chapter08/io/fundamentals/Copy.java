package com.samao.ocpjp.chapter08.io.fundamentals;

import java.io.*;

/**
 * Created by hsamao on 11/5/15.
 */
public class Copy {

    public static void main(String[] files) {
         if(files.length != 2) {
             System.out.println("please pass the source and destination file names\n");
             System.exit(-1);
         }

        String srcFile = files[0];
        String dstFile = files[1];

        try (BufferedReader inputFile = new BufferedReader(new FileReader(srcFile));
             BufferedWriter outputFile = new BufferedWriter(new FileWriter(dstFile))){
            int ch = 0;
            while ((ch = inputFile.read()) != -1){
                outputFile.write((char) ch);

            }
            outputFile.flush();
            outputFile.close();

        } catch (FileNotFoundException ex){
            System.err.println("Files are not exist in the current directory");
        } catch (IOException ex){
            System.err.println(ex.getMessage());
        }

    }
}
