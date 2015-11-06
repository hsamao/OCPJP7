package com.samao.ocpjp.chapter09.file.nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by hsamao on 11/6/15.
 */
public class PathCompare2 {
    public static void main (String [] args) {
        Path path1 = Paths.get("Test");
        Path path2 = Paths.get("/Users/hsamao/Assignments/ocpjp/Test");

        try {
            System.out.println("Files.isSameFile(path1,path2) is "+ Files.isSameFile(path1, path2));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
