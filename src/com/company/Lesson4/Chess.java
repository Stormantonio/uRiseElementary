package com.company.Lesson4;

/**
 * Created by Anton on 21.11.2016.
 * Вывести в консоль шахманую доску в текстовом в виде.
 */
public class Chess {
    public static void main(String[] args) {
        String[] rows = {"a", "b", "c", "d", "e", "f", "g", "h"};
        String[] columns = {"1", "2", "3", "4", "5", "6", "7", "8"};
        String[][] chessCells = new String[rows.length][columns.length];
        for (int i = columns.length - 1; i >= 0; i--) {
            for (int j = 0; j < rows.length; j++) {
                chessCells[j][i] = rows[j] + columns[i];
                System.out.print("|" + chessCells[j][i]);
                if (rows[j] == rows[rows.length - 1]) {
                    System.out.println("|");
                    System.out.println("________________________");
                }
            }
        }
    }
}
