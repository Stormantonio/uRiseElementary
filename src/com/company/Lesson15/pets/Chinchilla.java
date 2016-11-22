package com.company.Lesson15.pets;

import com.company.Lesson15.Pet;

/**
 * Created by Anton on 09.11.2016.
 */
public class Chinchilla extends Pet {
    public Chinchilla() {
        setWeight(300 + Math.random() * 200);
    }

    @Override
    public void voice() {
        super.voice();
        System.out.println("piu-piu-piu");
    }

    @Override
    public String status() {
        return "Chinchilla";
    }

    @Override
    protected void sleep() {
        System.out.println("fiu-fiu-fiu");
    }
}
