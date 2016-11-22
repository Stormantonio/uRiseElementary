package com.company.Lesson17.pets.list;

import com.company.Lesson17.pets.Pet;
import com.company.Lesson17.pets.interfaces.GiveMilk;

import java.io.IOException;

/**
 * Created by Anton on 14.11.2016.
 */
public class Cow extends Pet implements GiveMilk {
    public Cow() throws IOException {
        setWeight(initWeight());
    }

    @Override
    public void voice() {
        super.voice();
        System.out.println("Muuuuu-Muuuuu");
    }

    @Override
    protected void sleep() {

    }

    @Override
    public void giveMilk() {
        System.out.println("Дает молоко");
    }
}
