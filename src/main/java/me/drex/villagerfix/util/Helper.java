package me.drex.villagerfix.util;

import java.util.Random;

public class Helper {

    public static boolean chance(double percentage) {
        return percentage >= new Random().nextDouble() * 100;
    }

}
