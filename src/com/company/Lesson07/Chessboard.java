package com.company.Lesson07;

/**
 * Created by Anton on 22.11.2016.
 * Вывести в консоль шахматную доску, в виде специальных character.
 */
public class Chessboard {
    public static void main(String[] args) {
        int whiteCell = 9989;
        int blackCell = 9724;
        int rows = 8;
        int columns = 8;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if ((j + i) % 2 == 0) {
                    System.out.print((char) (whiteCell) + " ");
                } else {
                    System.out.print((char) (blackCell) + " ");
                }
            }
            System.out.println();
        }

        /* // мое решение, но громоздко
        int whiteCell = 9989;
        int blackCell = 9724;
        int rows = 8;
        int columns = 8;

        for (int j = 0; j < rows / 2; j++) {
            for (int i = 0; i < columns; i++) {
                if (i % 2 == 0) {
                    System.out.print((char) whiteCell + " ");
                } else {
                    System.out.print((char) blackCell + " ");
                }
            }
            System.out.println();
            for (int i = 0; i < columns; i++) {
                if (i % 2 == 0) {
                    System.out.print((char) blackCell + " ");
                } else {
                    System.out.print((char) whiteCell + " ");
                }
            }
            System.out.println();
        }*/
    }
}
