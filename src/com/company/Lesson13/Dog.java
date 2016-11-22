package com.company.Lesson13;

/**
 * Created by Anton on 22.11.2016.
 */
public class Dog extends Pet {
    public void voice() {
        super.voice();
        System.out.println("Uff");
    }

    public void swim() {
        System.out.println("swimming");
    }

    public void weight() {
        super.weight();
        System.out.println("dog?");
        System.out.println("4.5 kg");
    }

    public void color() {
        super.color();
        System.out.println("dog?");
        System.out.println("White");
    }

    public void size() {
        super.size();
        System.out.println("dog?");
        System.out.println("90 cm");
    }

    public void sex() {
        super.sex();
        System.out.println("boy");
    }
}
