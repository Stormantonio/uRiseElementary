package com.company.Lesson15.pets;

import com.company.Lesson15.Pet;

/**
 * Created by Anton on 09.11.2016.
 */
public class Dog extends Pet {
    public Dog() {
        setWeight(1500 + Math.random() * 5000);
    }

    public void voice() {
        super.voice();
        System.out.println("Uff");
    }

    @Override
    public String status() {
        return "Dog";
    }

    @Override
    protected void sleep() {
        System.out.println("Rrrr");
    }
}
