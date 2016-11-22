package com.company.Lesson05;

/**
 * Created by Anton on 21.11.2016.
 */
public class Cook {
    public static void main(String[] args) {
        Integer milkAmount = 200; // ml
        Integer powderAmount = 5; // g
        Integer eggsCount = 3; // items
        Integer sugarAmount = 5; // g
        Integer oilAmount = 30; // ml
        Integer appleCount = 8;

        Pancake pancake = new Pancake();
        Pirozhok pirozhok = new Pirozhok();
        Pie pie = new Pie();

        // pancake
        // powder - 400 g, sugar - 10 g, milk - 1 l, oil - 30 ml
        // pirozhok
        // milk - 300 ml, powder - 5 g, eggs - 5
        // pie
        // apples - 3, milk - 100 ml, powder - 300 g, eggs - 4

        if (powderAmount >= pancake.powderPancake && sugarAmount >= pancake.sugarPancake &&
                milkAmount >= pancake.milkPancake && oilAmount >= pancake.oilPancake) {
            System.out.println("Вы можете приготовить блинчики");
        } else {
            System.out.println("Недостаточно ингредиентов для блинчиков");
        }

        if (milkAmount >= pirozhok.milkPirozhok && powderAmount >= pirozhok.powderPirozhok && eggsCount >= pirozhok.eggsPirozhok) {
            System.out.println("Вы можете приготовить пирожки");
        } else {
            System.out.println("Недостаточно ингредиентов для пирожков");
        }

        if (appleCount >= pie.applesPie && milkAmount >= pie.milkPie && powderAmount >= pie.powderPie && eggsCount >= pie.eggsPie) {
            System.out.println("Вы можете приготовить пирог");
        } else {
            System.out.println("Недостаточно ингредиентов для пирога");
        }
    }
}

class Pancake {
    Integer powderPancake = 400;
    Integer sugarPancake = 10;
    Integer milkPancake = 1;
    Integer oilPancake = 30;
}

class Pirozhok {
    Integer milkPirozhok = 100;
    Integer powderPirozhok = 5;
    Integer eggsPirozhok = 3;
}

class Pie {
    Integer applesPie = 3;
    Integer milkPie = 100;
    Integer powderPie = 300;
    Integer eggsPie = 4;
}
