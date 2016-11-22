package com.company.Lesson13;

/**
 * Created by Anton on 22.11.2016.
 */
public class Cat extends Pet {
    public void voice() {
        super.voice();
        System.out.println("Meow");
    }

    public void weight() {
        super.weight();
        System.out.println("cat?");
        System.out.println("1.5 kg");
    }

    public void color() {
        super.color();
        System.out.println("cat?");
        System.out.println("Black");
    }

    public void size() {
        super.size();
        System.out.println("cat?");
        System.out.println("40 cm");
    }

    public void sex() {
        super.sex();
        System.out.println("girl");
    }
}
