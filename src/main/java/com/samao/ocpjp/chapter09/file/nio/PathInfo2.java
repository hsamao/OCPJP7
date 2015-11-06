package com.samao.ocpjp.chapter09.file.nio;

import java.io.IOException;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by hsamao on 11/5/15.
 */
public class PathInfo2 {
    public static void main (String [] args) throws IOException {
        Path path = Paths.get("./Test");
        System.out.println("File Details\n");
        System.out.println("File Name : " + path.getFileName());
        System.out.println("Its URI is " + path.toUri());
        System.out.println("Its absolute path is " + path.toAbsolutePath());
        System.out.println("Its normalized path is " + path.normalize());

        Path pathNormalized = Paths.get(path.normalize().toString());

        System.out.println("It's normalized absolute path " + pathNormalized.toAbsolutePath());

        System.out.println("It's normalized real path is : " + pathNormalized.toRealPath(LinkOption.NOFOLLOW_LINKS));

    }
}
