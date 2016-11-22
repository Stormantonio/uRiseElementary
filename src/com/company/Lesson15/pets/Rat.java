package com.company.Lesson15.pets;

import com.company.Lesson15.Pet;

/**
 * Created by Anton on 09.11.2016.
 */
public class Rat extends Pet {
    public Rat() {
        setWeight(100 + Math.random() * 200);
    }

    @Override
    public void voice() {
        super.voice();
        System.out.println("pipipipi");
    }

    @Override
    public String status() {
        return "Rat";
    }

    @Override
    protected void sleep() {
        System.out.println("pi-pi-pi");
    }
}
