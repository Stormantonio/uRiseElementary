package com.company.Lesson05;

/**
 * Created by Anton on 21.11.2016.
 */
public class FromWebinar {
    public static void main(String[] args) {
        int boardSize = 8;
        String[] s = {"a", "b", "c", "d", "e", "f", "g", "h"};
        for (int i = 0; i < boardSize; i++) {
            for (int j = 0; j < boardSize; j++) {
                System.out.print(s[j] + (byte) ('a' + (boardSize - i)) + "|");
            }
            System.out.println();
            System.out.println("----------------------------------------");
        }
    }
}
