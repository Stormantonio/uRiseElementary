package com.company.webinar5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Anton on 22.11.2016.
 * Написать программу, которая будет выдавать имя владельца автомобиля по его номеру.
 * Программа должна быть умной: если у неё в памяти номера нет, она должна попросить ввести его имя и запомнить.
 */
public class CarOwners {
    public static void main(String[] args) throws IOException {
        TreeMap<String, String> cars = new TreeMap<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (; ; ) {
            System.out.println("Введите номер автомобиля или команду: LIST - посмотреть всю базу номеров автомобилей | HELP - справка | EXIT - выход");
            String command = reader.readLine().toUpperCase().trim();
            if (command.equals("LIST")) {
                if (cars.isEmpty()) {
                    System.out.println("В базе нет ни одного автомобиля!");
                } else {
                    for (String s : cars.keySet()) {
                        System.out.println(cars.get(s) + " владелец автомобиля с номером " + s);
                    }
                    System.out.println();
                }
            } else if (command.equals("EXIT")) {
                break;
            } else if (command.equals("HELP")) {
                System.out.println("Примеры ввода номеров:\n - с 1995 года: РР-ццц-ццСС\n - с 2004 года: ККццццСС, где:");
                System.out.println("РР - код региона по образцу 1995 года;\nц - цифры;\nСС - серия;\nКК - код региона по образцу 2004 года.");
                System.out.println("Можно еще добавить номера 1992 года :)");
                System.out.println();
            } else if (isCarNumber(command)) {
                String s = cars.get(command);
                if (s != null) {
                    System.out.println(cars.get(command) + " владелец автомобиля с номером " + command);
                    System.out.println();
                } else {
                    System.out.println("Введите имя владельца:");
                    String owner = reader.readLine().trim();
                    cars.put(command, owner);
                    System.out.println("Владелец " + cars.get(command) + " с номером автомобиля " + command + " добавлен в базу!");
                    System.out.println();
                }
            } else
                System.out.println("Неверный ввод!");
        }
    }

    private static Pattern pattern = Pattern.compile("^([АВЕІКМНОРСТХABCEIKHMOPTX]{2}[\\d]{4}|([012]\\d\\-\\d\\d\\d\\-\\d\\d))[АВЕІКМНОРСТХABCEIKHMOPTX]{2}$");

    private static boolean isCarNumber(String num) {
        Matcher matcher = pattern.matcher(num);
        return matcher.matches();
    }
}
