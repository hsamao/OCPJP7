package com.samao.ocpjp.chapter09.file.nio;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by hsamao on 11/6/15.
 */
public class PathCompare1 {

   public static void main (String [] args) {

       Path path1 = Paths.get("Test");
       Path path2 = Paths.get("/Users/hsamao/Assignments/ocpjp/Test");

       System.out.println("path1.compareTo(path2) : " + path1.compareTo(path2));

       System.out.println("path1.equals(path2): " + path1.equals(path2));

       System.out.println("path2.equals.(path1.toAbsolutePath()) : " + path2.equals(path1.toAbsolutePath()));
   }


}
