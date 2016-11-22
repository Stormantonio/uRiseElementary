package com.company.Lesson06;

/**
 * Created by Anton on 21.11.2016.
 * Вывести  в консоль все простые числа от встречающиеся от 0 до 10000
 */
public class Primes {
    public static void main(String[] args) {
        int min = 2;
        int max = 10000;
        boolean kr;
        int count = 0;

        for (int i = min; i < max; i++) {
            kr = true;
            for (int j = min; j < (i - 1); j++) {
                if (i % j == 0) {
                    kr = false;
                }
            }
            if (kr) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("Всего простых чисел в диапазоне от " + min + " - " + max + ": " + count);
    }
}

