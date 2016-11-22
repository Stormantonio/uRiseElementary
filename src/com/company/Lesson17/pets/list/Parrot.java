package com.company.Lesson17.pets.list;

import com.company.Lesson17.pets.Pet;
import com.company.Lesson17.pets.interfaces.Fly;

import java.io.IOException;

/**
 * Created by Anton on 14.11.2016.
 */
public class Parrot extends Pet implements Fly {
    public Parrot() throws IOException {
        setWeight(initWeight());
    }

    @Override
    public void voice() {
        super.voice();
        System.out.println("Кеша хороший");
    }

    @Override
    protected void sleep() {

    }

    @Override
    public void fly() {
        System.out.println("Крыльями машет");
    }
}
