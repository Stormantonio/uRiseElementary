package com.company.Lesson9;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Anton on 22.11.2016.
 * Выведите сумму заработанных денег;
 */
public class Salary {
    public static void main(String[] args) {
        double salary;
        double sum = 0;

        String text = "Коля заработал 10000 рублей, Миша - 17563 рубля, а Катя - 50000 рублей";
        Pattern p = Pattern.compile("\\d+");
        Matcher m = p.matcher(text);
        while (m.find()) {
            salary = Double.parseDouble(m.group(0));
            sum += salary;
        }
        System.out.println("Сумма зарплат всех работников: " + sum + " рублей.");
    }
}
