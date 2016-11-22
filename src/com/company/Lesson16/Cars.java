package com.company.Lesson16;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 * Created by Anton on 22.11.2016.
 * Смоделируйте ситуацию с гаражем на 5 машин, последняя заехавшая выезжает первой,
 * больше 5 машин хранить нельзя, по команде exit выезжает последняя,
 * по команде exitAll выезжают все в обратном порядке.
 */
public class Cars {
    public static void main(String[] args) throws IOException {
        // Мой вариант
        final int counter = 5;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> cars = new ArrayList<>();
        for (; ; ) {
            System.out.println("Введите одну из команд: newCar - новый автомобиль | exit - выезжает последний автомобиль | exitAll - все автомобили выезжают в обратном порядке");
            String select = reader.readLine().trim();
            switch (select) {
                case "newCar":
                    if (cars.size() == counter) {
                        System.out.println("Больше " + counter + " автомобилей хранить нельзя!");
                        break;
                    } else {
                        System.out.print("Введите автомобиль: ");
                        select = reader.readLine().trim();
                        cars.add(select);
                        System.out.println("Автомобиль " + select + " припарковался!");
                    }
                    break;
                case "exit":
                    if (cars.size() == 0) {
                        System.out.println("Гараж пуст!");
                        break;
                    } else {
                        String lastCar = cars.remove(cars.size() - 1);
                        System.out.println("Автомобиль " + lastCar + " выехал!");
                    }
                    break;
                case "exitAll":
                    if (cars.size() == 0) {
                        System.out.println("Гараж пуст!");
                        break;
                    } else {
                        for (int i = cars.size() - 1; i >= 0; i--) {
                            System.out.println("Автомобиль " + cars.remove(i) + " выехал!");
                        }
                        System.out.println("Гараж пуст!");
                    }
                    break;
                default:
                    System.out.println("Неверная команда!");
                    break;
            }
        }

        // Вариант Стаса
        /*final int parkingSize = 5;
        ArrayList<String> flys = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (; ; ) {
            System.out.println("Enter command: ");
            String command = reader.readLine().trim();
            if (command.equals("exitAll")) {
                if (flys.size() > 0) {
                    for (int i = flys.size() - 1; i >= 0; i--) {
                        System.out.println("plane " + flys.remove(i) + " left");
                    }
                } else
                    System.out.println("parking is empty!");
            } else if (command.equals("exitAll")) {
                if (flys.size() > 0)
                    System.out.println("plane " + flys.remove(flys.size() - 1) + " left");
                else
                    System.out.println("last plane is absent, parking is empty!");
            } else if (flys.size() == parkingSize)
                System.out.println("Parking is full!");
            else
                System.out.println("Plane came to parking - " + flys.add(command));
        }*/
    }
}
