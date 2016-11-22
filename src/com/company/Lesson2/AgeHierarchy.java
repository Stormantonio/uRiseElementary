package com.company.Lesson2;

/**
 * Created by Anton on 21.11.2016.
 * Правильно определить возрасты людей не смотря на то, что они могут меняться
 */

public class AgeHierarchy {
    public static void main(String[] args) {
        Integer dimaAge = 21;
        Integer mishaAge = 25;
        Integer vasyaAge = 17;

        Integer oldest = 0;
        Integer youngest = 0;
        Integer middle = 0;

        if (dimaAge <= mishaAge && dimaAge <= vasyaAge) {
            youngest = dimaAge;
            if (mishaAge <= vasyaAge) {
                middle = mishaAge;
                oldest = vasyaAge;
            } else {
                middle = vasyaAge;
                oldest = mishaAge;
            }
        }
        if (mishaAge <= dimaAge && mishaAge <= vasyaAge) {
            youngest = mishaAge;
            if (dimaAge <= vasyaAge) {
                middle = dimaAge;
                oldest = vasyaAge;
            } else {
                middle = vasyaAge;
                oldest = dimaAge;
            }
        }
        if (vasyaAge <= dimaAge && vasyaAge <= mishaAge) {
            youngest = vasyaAge;
            if (dimaAge <= mishaAge) {
                middle = dimaAge;
                oldest = mishaAge;
            } else {
                middle = mishaAge;
                oldest = dimaAge;
            }
        }
        System.out.println("Oldest man - " + oldest);
        System.out.println("Middle age man - " + middle);
        System.out.println("Most young man - " + youngest);
    }
}
