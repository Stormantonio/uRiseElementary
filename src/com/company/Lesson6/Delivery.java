package com.company.Lesson6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Anton on 21.11.2016.
 * Вы доставляете провизию на марс в виде ящиков одинакового размера. У вас есть космические корабли и контейнеры.
 * В каждый корабль влезает максимум 11 контейнеров. В каждый контейнер ­ не более 34 ящиков. Ящики, контейнеры и корабли пронумерованы.
 * Напишите программу, которая будет распределять ящики по контейнерам и кораблям  в зависимости от их количества, а также напечатает,
 * сколько всего нужно кораблей и контейнеров. На вход программы через консоль должно подаваться число ящиков.
 * На выходе результат должен выглядеть следующим образом:

 Корабль 1:

 Контейнер 1:

 Контейнер 2

 Ящик 1

 Ящик 2

 Ящик 3

 ...

 Ящик 28

 Ящик 29
 */

public class Delivery {
    public static void main(String[] args) throws IOException {
    /*int boxes = 3000;
        int boxesInContainer = 34;
        int containersInShip = 11;

        int containers = boxes / boxesInContainer;
        int boxesBalance = boxes % boxesInContainer;
        int ships = containers / containersInShip;
        int containerBalance = containers % containersInShip;

        if (containerBalance != 0) {
            System.out.println("Need ships: " + ++ships);
            ships--;
        } else {
            System.out.println("Need ships: " + ships);
        }
        if (boxesBalance != 0) {
            System.out.println("Need containers: " + ++containers);
            containers--;
        } else {
            System.out.println("Need containers: " + containers);
        }

        for (int i = 1; i <= ships; i++) {
            System.out.println();
            System.out.println("Ship: " + i);
            for (int j = 1; j <= containersInShip; j++) {
                System.out.println("Container: " + j);
                for (int k = 1; k <= boxesInContainer; k++) {
                    System.out.println("Box: " + k);
                }
            }
        }

        if (containerBalance != 0) {
            System.out.println();
            System.out.println("Ship: " + ++ships);
            for (int i = 1; i <= containerBalance; i++) {
                System.out.println("Container: " + i);
                for (int j = 1; j <= boxesInContainer; j++) {
                    System.out.println("Box: " + j);
                }
            }
        }

        if (boxesBalance != 0) {
            System.out.println("Container: " + ++containerBalance);
            for (int i = 1; i <= boxesBalance; i++) {
                System.out.println("Box: " + i);
            }
        }*/


        /*// хорошее решение
        int container = 11;
        int box = 34;

        double countShip = 0;
        double countContainer = 0;
        double countBox = 0;
        double shipContainerBox = container * box;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        countBox = Double.parseDouble(reader.readLine());

        countContainer = Math.ceil(countBox / box);
        countShip = Math.ceil(countBox / shipContainerBox);

        System.out.println("Общее кол-во контейнеров: " + countContainer);
        System.out.println("Кол-во кораблей: " + countShip);
        System.out.println("----------------------------------------");

        for (int i = 0; i < countShip; i++) {
            System.out.println("Корабль " + (i + 1));
            for (int j = 0; j < container; j++) {
                if (countContainer == 0)
                    continue;
                countContainer--;
                System.out.println("Контейнер " + (j + 1));
                for (int k = 0; k < box; k++) {
                    if (countBox == 0)
                        continue;
                    countBox--;
                    System.out.println("Ящик " + (k + 1));
                }
            }
        }*/

        // решение Стаса
        System.out.println("Введите, пожалуйста, количество ящиков с провизией для высадки на Марс....");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int countBoxes = Integer.parseInt(reader.readLine());
        int countTrucks = 0;
        int countContainers = 0;
        int boxesInContainer = 27;
        int containersInTruck = 12;

        for (int i = 0; i < countBoxes; i++) {
            if (i % (containersInTruck * boxesInContainer) == 0) {
                System.out.println("Грузовик " + (countTrucks + 1));
                countTrucks++;
            }
            if (i % boxesInContainer == 0) {
                System.out.println("Контейнер " + (countContainers + 1));
                countContainers++;
            }
            System.out.println("Ящик " + (i +1));
        }
        System.out.println("Всего грузовиков: " + countTrucks);
        System.out.println("Всего контейнеров: " + countContainers);
    }
}

