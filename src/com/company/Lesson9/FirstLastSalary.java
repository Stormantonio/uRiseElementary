package com.company.Lesson9;

/**
 * Created by Anton on 22.11.2016.
 * Используя только substring, indexOf, lastIndexOf, вывести сумму заработка последнего и первого человека.
 */
public class FirstLastSalary {
    public static void main(String[] args) {

        String text = "Коля заработал 12000 рублей, Миша - 17563 рубля, а Катя - 50000 рублей";
        int firstMoney = text.indexOf(" рубл");
        int lastMoney = text.lastIndexOf(" рубл");
        double firstSalary = Double.parseDouble(text.substring(text.lastIndexOf(" ", firstMoney - 1), firstMoney));
        double lastSalary = Double.parseDouble(text.substring(text.lastIndexOf(" ", lastMoney - 1), lastMoney));
        System.out.println(text);
        System.out.println("Сумма заработка первого и последнего человека: " + (firstSalary + lastSalary));
    }
}
