package com.company.Lesson17.pets.list;

import com.company.Lesson17.pets.Pet;
import com.company.Lesson17.pets.interfaces.Swim;

import java.io.IOException;

/**
 * Created by Anton on 14.11.2016.
 */
public class Platypus extends Pet implements Swim {
    public Platypus() throws IOException {
        setWeight(initWeight());
    }

    @Override
    public void voice() {
        super.voice();
        System.out.println("Кркркркркркркрк");
    }

    @Override
    protected void sleep() {

    }

    @Override
    public void swim() {

    }
}
