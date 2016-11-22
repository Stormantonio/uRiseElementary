package com.company.Lesson17.pets.list;

import com.company.Lesson17.pets.Pet;

import java.io.IOException;

/**
 * Created by Anton on 14.11.2016.
 */
public class Cat extends Pet {
    public Cat() throws IOException {
        setWeight(initWeight());
    }

    public void voice() {
        super.voice();
        System.out.println("Meow");
    }

    @Override
    protected void sleep() {
        System.out.println("Mur");
    }
}
