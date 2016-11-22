package com.company.Lesson4;

/**
 * Created by Anton on 21.11.2016.
 * сделать инверсию массива, (перевернуть массив, первый элемент массива  сделать последним, а послений первым,
 * второй предпоследним и так далее...)
 */
public class ArrayInversion {
    public static void main(String[] args) {
        String[] rainbow = {"Красный", "Оранжевый", "Желтый", "Зеленый", "Голубой", "Синий", "Фиолетовый"};

        for (int i = 0; rainbow.length / 2 > i; i++) {
            String temp = rainbow[i];
            rainbow[i] = rainbow[rainbow.length - 1 - i];
            rainbow[rainbow.length - 1 - i] = temp;
        }

        for (int i = 0; i < rainbow.length; i++) {
            System.out.println(rainbow[i]);
        }
    }
}
