package logic;

import java.util.*;
import java.util.Random;
import javafx.util.Pair;

public class Dice {
    private static int d1;
    private static int d2;


    public void DiceCall(int d1, int d2) {
        roll();
    }

    public static void getRoll() {
        roll();
    }

    public static String roll() {
        Random r = new Random();
        d1 = r.ints(1, 1, 7).findFirst().getAsInt();
        d2 = r.ints(1, 1, 7).findFirst().getAsInt();
        String a = String.valueOf(d1);
        String b = String.valueOf(d2);
        if(meyerCheck(d1, d2)) { return "Meyer: " + orderCalc(d1, d2, a, b);  }
        if(lilleMeyerCheck(d1, d2)) {return "Lille Meyer: " + orderCalc(d1,d2, a, b); }
        else {return orderCalc(d1, d2, a, b); }
    }

    public static boolean meyerCheck(int d1, int d2) {
        if(d1 == 1 && d2 == 2 || d1 == 2 && d2 == 1) {
            return true;
        }
        return false;
    }

    public static boolean lilleMeyerCheck(int d1, int d2) {
        if(d1 == 1 && d2 == 3 || d1 == 3 && d2 == 1) {
            return true;
        }
        return false;
    }

    public static String orderCalc(int d1, int d2, String a, String b) {
        if(d1 == d2) { return a + b; }
        else if(d1 > d2) { return a + b; }
        else { return b + a; }
    }
}
