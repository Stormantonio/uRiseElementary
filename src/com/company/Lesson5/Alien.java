package com.company.Lesson5;

/**
 * Created by Anton on 21.11.2016.
 */
public class Alien {
    public static void main(String[] args) {
        Integer counter = 10;
        Integer countSize = counter;
        Integer attempts = 1;
        Double[] height = {1.75, 1.70, 1.50, 1.86, 1.74, 1.63, 1.72, 1.69, 2.01, 2.00};
        String[] ask = {"white", "black", "black", "white", "white", "black", "black", "white", "black", "white"};
        String[] answer = {"white", "black", "black", "white", "white", "black", "white", "white", "white", "white"};

        for (int i = height.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (height[j] > height[j + 1]) {
                    Double temp = height[j];
                    height[j] = height[j + 1];
                    height[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < countSize; i++) {
            for (int j = 0; j < countSize; j++) {
                System.out.print("Человек ростом " + height[j] + " (м)");
                if (ask[j].equals(answer[j])) {
                    System.out.println(" выбрал цвет шапки " + ask[j] + " и угадал!");
                } else if (attempts == 1) {
                    System.out.println(" выбрал цвет шапки " + ask[j] + ", но ошибся! Больше ошибаться нельзя!");
                    attempts++;
                } else {
                    System.out.println(" выбрал цвет шапки " + ask[j] + ", но ошибся! Все кончено!");
                    break;
                }
            }
            break;
        }
    }
}
