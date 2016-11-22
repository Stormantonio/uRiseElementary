package com.company.Lesson03;

/**
 * Created by Anton on 21.11.2016.
 * Выяснить возраст всех 4-х братьев, сумма 3 - х  из которых поочередно,  - 30, 32, 32, 35.
 *
 * Была семья, в ней жило 4 брата. Известны 4 суммы возрастов любых трех из них (то есть если сложить возраст:
 * 1-го, 2-го и 3-го, то получится 30;
 * 2-го, 3-го и 4-го, то получится 32;
 * 3-го, 4-го, 1-го, то получится 32;
 * 1-го, 2-го 4-го, то получится 35.
 * Нужно установить, сколько кому лет?
 */
public class WhatAge {
    public static void main(String[] args) {
        int[] ages = {30, 32, 32, 35};
        int min = 5;
        int max = 15;
        int sum123 = 0, sum234 = 0, sum341 = 0, sum412 = 0;

        for (int i = min; i < max; i++) {
            for (int j = min; j < max; j++) {
                for (int k = min; k < max; k++) {
                    for (int l = min; l < max; l++) {
                        sum123 = i + j + k;
                        sum234 = j + k + l;
                        sum341 = k + l + i;
                        sum412 = l + i + j;
                        if (sum123 == ages[0] && sum234 == ages[1] && sum341 == ages[2] && sum412 == ages[3]) {
                            System.out.println("Возраст первого брата " + i);
                            System.out.println("Возраст второго брата " + j);
                            System.out.println("Возраст третьего брата " + k);
                            System.out.println("Возраст четвертого брата " + l);
                        }
                    }
                }
            }
        }
    }
}
