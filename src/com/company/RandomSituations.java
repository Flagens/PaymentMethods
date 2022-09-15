package com.company;

import java.util.Random;

public class RandomSituations {
    static boolean randomsituation(int x) {
        int min = 1;
        int max = 100;
        int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
        System.out.println(random_int);
        if(random_int < x) {
            return false;
        } else {
            return true;

        }

    }
}
