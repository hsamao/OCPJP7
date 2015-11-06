package com.samao.ocpjp.chapter09.file.nio;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by hsamao on 11/5/15.
 */
public class PathInfo1 {

    public static void main (String [] args){
        Path path = Paths.get("/Users/hsamao/extfile.txt");

        System.out.println("File path details\n");
        System.out.println("\t File name : \t" + path.getFileName());
        System.out.println("\t Root File : \t" + path.getRoot());
        System.out.println("\t File parent : \t" + path.getParent());
        System.out.println("\n**** File Elements ****\n");
        for (Path path1 : path){
            System.out.println("\t Path element : " + path1);
        }
    }
}
