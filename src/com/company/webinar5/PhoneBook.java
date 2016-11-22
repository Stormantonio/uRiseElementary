package com.company.webinar5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Anton on 22.11.2016.
 * Написать умный эмулятор телефонной книги. Если в неё ввести новое имя,
 * она должна запросить номер телефона. Если в неё ввести новый номер телефона,
 * должна запросить имя. Если введённое имя или номер телефона найдены, должна вывести
 * дополнительную информацию: номер или имя, соответственно. Команда LIST должна выводить
 * всех абонентов в алфавитном порядке с номерами телефонов.
 */

public class PhoneBook {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, String> numbers = new TreeMap<>();
        help();
        for (; ; ) {
            String command = reader.readLine();
            if (command.toUpperCase().equals("LIST")) {
                if (numbers.isEmpty()) {
                    System.out.println("Телефонная книга пуста!");
                } else {
                    System.out.println("Список контактов:");
                    for (String s : numbers.keySet()) {
                        System.out.println(numbers.get(s) + " : " + s);
                    }
                    System.out.println();
                }
            } else if (command.toUpperCase().equals("EXIT")) {
                break;
            } else if (command.toUpperCase().equals("HELP")) {
                help();
            } else if (numbers.containsKey(command)) {
                System.out.println("Найден контакт: " + numbers.get(command) + " : " + command);
            } else if (numbers.containsValue(command)) {
                processMap(numbers, command);
            } else {
                Matcher matcher = pattern.matcher(command);
                if (matcher.matches()) {
                    System.out.println("Был введен номер. Введите имя контакта:");
                    String name = reader.readLine();
                    yesNo(numbers, command, name);
                } else {
                    String name = command;
                    System.out.println("Введено возможное новое имя. Введите номер телефона:");
                    command = reader.readLine();
                    matcher = pattern.matcher(command);
                    if (matcher.matches()) {
                        if (!numbers.containsKey(command)) {
                            yesNo(numbers, command, name);
                        } else {
                            System.out.println("Такой номер уже есть в телефонной книге! Введите другой номер:");
                        }
                    } else
                        System.out.println("Неверно введен номер телефона! Повторите ввод номера");
                }
            }
        }
    }

    private static Pattern pattern = Pattern.compile("^[0-9]{10,}");

    private static void help() {
        System.out.println("Введите номер телефона или имя контакта, или выберите команду: LIST - вывести весь список контактов | HELP - справка | EXIT - выход");
    }

    private static boolean yesNo(Map<String, String> map, String key, String value) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Новый контакт " + value + " " + key + ". Сохранить? (YES/NO)");
        String s = reader.readLine();
        if (s.toUpperCase().equals("YES")) {
            map.put(key, value);
            System.out.println(map.get(key) + " " + key + " успешно сохранен в телефонной книге!");
            return true;
        } else if (s.toUpperCase().equals("NO")) {
            System.out.println("Контакт не был сохранен.");
            return true;
        } else
            System.out.println("Неверный выбор");
        return yesNo(map, key, value);
    }

    private static void processMap(Map<String, String> mp, String v) {
        for (Map.Entry<String, String> pair : mp.entrySet()) {
            String key = pair.getKey();
            String value = pair.getValue();
            if (v.equals(value)) {
                System.out.println("Информация о контакте: " + value + " : " + key);
            }
        }
    }
}
