package com.samao.ocpjp.chapter13.threads;

/**
 * Created by hsamao on 11/11/15.
 */
public class DiceGame {

    public static void main(String[] s) {
        Player player1 = new Player(Gamers.JANE);
        Player player2 = new Player(Gamers.JOE);
// don't forget to set who starts the game
        Dice.setWhoStarts(Gamers.JOE);
        player1.start();
        player2.start();
    }
}
