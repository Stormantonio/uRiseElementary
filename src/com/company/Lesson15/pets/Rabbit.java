package com.company.Lesson15.pets;

import com.company.Lesson15.Pet;

/**
 * Created by Anton on 09.11.2016.
 */
public class Rabbit extends Pet {
    public Rabbit() {
        setWeight(500 + Math.random() * 1000);
    }

    @Override
    public void voice() {
        super.voice();
        System.out.println("fr-fr-fr");
    }

    @Override
    public String status() {
        return "Rabbit";
    }

    @Override
    protected void sleep() {
        System.out.println("ps-ps-ps");
    }
}
