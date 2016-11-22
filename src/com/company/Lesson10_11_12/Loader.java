package com.company.Lesson10_11_12;

/**
 * Created by Anton on 22.11.2016.
 * создать метод возвращающий количество съеденной котом еды.
 * создать метод ходить в туалет, который уменьшает вес кота, и печатает что нибудь.
 */
public class Loader {
    public static void main(String[] args) {
        Cat vaska = new Cat();
        Cat murzik = new Cat();
        Cat murka = new Cat(1000.0);

        System.out.println(vaska.getWeight());
        System.out.println(murzik.getWeight());
        System.out.println(murka.getWeight());
        System.out.println(Cat.getCatCount());

        Cat.catClone(vaska);
        System.out.println(Cat.getCatCount());
        Cat.catClone(murka);
        System.out.println(Cat.getCatCount());


        Cat chernushka1 = new Cat(100.0);
        System.out.println(Cat.getCatCount());

        Cat chernushka2 = new Cat(100000.0);
        System.out.println(Cat.getCatCount());
    }
    //- Создать в классе Cat метод, который будет возвращать массу съеденной еды.
    //- Создать в классе Cat метод “сходить в туалет”, который будет уменьшать вес кошки и что-­
    //  нибудь печатать.
    // создайте метод, возвращающий тип Cat и создающий глубокую копию кота.
    // создайте isAlive(), возвращает, жив ли кот
    // создайте конструктор, который принимает вес кота.
}

