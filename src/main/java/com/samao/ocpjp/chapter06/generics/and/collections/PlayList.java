package com.samao.ocpjp.chapter06.generics.and.collections;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by hsamao on 11/3/15.
 */
public class PlayList {

    public static void main (String [] args) {

        List<String> playList = new LinkedList<>();

        playList.add("Rock with you - 1979");
        playList.add("Billie Jean 1983");
        playList.add("Man in the mirror - 1988");
        playList.add("Black or White - 1991");

        System.out.println("The original playlist of MJ's songs");
        System.out.println(playList);

        System.out.println("\n The reversed playlist");
        Collections.reverse(playList);
        System.out.println(playList);

        System.out.println("\n Now after shuffling playlist");
        Collections.shuffle(playList);
        System.out.println(playList);

        System.out.println("\n Sort the songs by their name");
        Collections.sort(playList);
        System.out.println(playList);

        System.out.println("\nIs my favorite song Black or White - 1991 present int the list?");
        String blackOrWhite = "Black or White - 1991";
        int index = Collections.binarySearch(playList, blackOrWhite);

        if (index >= 0 ){
            System.out.printf("Yes, its the %d song \n", (index+ 1));
        } else {
            System.out.println("No, it is not there in the playlist\n");
        }

        System.out.println("\nLet me forward my two songs (rotate the list)");
        Collections.rotate(playList,2);
        System.out.println(playList);
    }
}
