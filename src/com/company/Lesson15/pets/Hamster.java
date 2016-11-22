package com.company.Lesson15.pets;

import com.company.Lesson15.Pet;

/**
 * Created by Anton on 09.11.2016.
 */
public class Hamster extends Pet {
    public Hamster() {
        setWeight(50 + Math.random() * 100);
    }

    @Override
    public void voice() {
        super.voice();
        System.out.println("chik-chirik-chik-chik");
    }

    @Override
    public String status() {
        return "Hamster";
    }

    @Override
    protected void sleep() {
        System.out.println("fr-fr-fr");
    }
}
