package com.company.Lesson10_11_12;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

/**
 * Created by Anton on 22.11.2016.
 */
public class Cat {
    private static int catCount = 0;
    private Double originWeight;
    private Double weight;

    private Double minWeight;
    private Double maxWeight;

    private Double feedAmount;
    private Double drinkAmount;

    public Cat() {
        weight = 1500.0 + 3000.0 * Math.random();
        originWeight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;
        catCount++;
    }

    // 3) конструктор, который принимает вес кота
    public Cat(Double weight) {
        this.weight = weight;
        minWeight = 1000.0;
        maxWeight = 9000.0;
        isAlive(weight, minWeight, maxWeight);

    }

    // 2) isAlive(), возвращает, жив ли кот
    public boolean isAlive(Double weight, Double min, Double max) {
        if (weight < min || weight > max) {
            System.out.println("Кот неживой");
        } else {
            System.out.println("Кот жив");
            catCount++;
        }
        return true;
    }

    public static Double catWeightDifference(Cat cat1, Cat cat2) {
        return Math.abs(cat1.getWeight() - cat2.getWeight());
    }

    // 1) метод, возвращающий тип Cat и создающий глубокую копию кота
    public static Cat catClone(Cat cat) {
        Cat clone = cat;
        System.out.println("Кот с весом " + clone.getWeight() + " был успешно клонирован"); // для проверки
        catCount++;
        return clone;
    }


    public static int getCatCount() {
        return catCount;
    }

    public void meow() {
        weight--;
        System.out.println("Meow");
    }

    public void feed(Double amount) {
        weight = weight + amount;
        feedAmount = amount;
    }

    public void drink(Double amount) {
        weight = weight + amount;
        drinkAmount = amount;
    }

    public Double getWeight() {
        return weight;
    }

    public String getStatus() {
        if (weight < minWeight) {
            return "Dead";
        } else if (weight > maxWeight) {
            return "Exploded";
        } else if (weight > originWeight) {
            return "Sleeping";
        } else {
            return "Playing";
        }
    }

    public String getFeedAmount() {
        if (feedAmount != null) {
            DecimalFormatSymbols s = new DecimalFormatSymbols();
            s.setDecimalSeparator('.');
            DecimalFormat f = new DecimalFormat("#,##0.00", s);
            return "Кот съел " + f.format(feedAmount) + " г корма.";
        } else {
            return "Кот еще ничего не ел.";
        }
    }

    public String getDrinkAmount() {
        if (drinkAmount != null) {
            DecimalFormatSymbols s = new DecimalFormatSymbols();
            s.setDecimalSeparator('.');
            DecimalFormat f = new DecimalFormat("#,##0.00", s);
            return "Кот выпил " + f.format(drinkAmount) + " мл воды.";
        } else {
            return "Кот еще ничего не пил.";
        }
    }

    public void goWC() {
        int num = 1 + (int) (Math.random() * 3);
        if (num == 1) {
            System.out.println("Кот покакал!");
            weight -= 20;
        } else {
            System.out.println("Кот пописал!");
            weight -= 5;
        }
    }


    //Вариант с void
    /*public void getFeedAmount() {
        if (feedAmount != null) {
            System.out.print("Кот съел ");
            System.out.printf("%.2f", feedAmount);
            System.out.println(" г корма.");
        } else {
            System.out.println("Кот еще ничего не ел.");
        }
    }*/

    /*public void getDrinkAmount() {
        if (drinkAmount != null) {
            System.out.print("Кот выпил ");
            System.out.printf("%.2f", drinkAmount);
            System.out.println(" мл воды.");
        } else {
            System.out.println("Кот еще ничего не пил.");
        }
    }*/
}
