package com.samao.ocpjp.chapter07.processing.string;

import org.springframework.stereotype.Component;

/**
 * Created by hsamao on 11/4/15.
 */

@Component
public class FormattedTable {

    public void line() {
        System.out.println("----------------------------------------------------");
    }

    public void printHeader() {
        System.out.printf("%-15s \t %s \t %s \t %s\n", "Player", "Matches", "Goals", "Goals per match");
    }

    public void printRow(String player, int matches, int goals) {
        String str = String.format("%-15s \t %5d \t\t %d \t\t %.1f\n", player, matches, goals, ((float) goals / (float) matches));
        System.out.printf(str);
    }
}
