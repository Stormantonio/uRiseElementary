package com.company.Lesson03;

/**
 * Created by Anton on 21.11.2016.
 * Вывести в консоль количество негритят оставшихся за столом от 10, и уменьшающееся в цикле.
 */

public class BlackChildren {
    public static void main(String[] args) {
        int count = 10;
        for (int i = 1; i <= count; i++) {
            System.out.println(i + " негритят из-за стола вышло. " + (count - i) + " негритят за столом осталось");
        }
    }
}
