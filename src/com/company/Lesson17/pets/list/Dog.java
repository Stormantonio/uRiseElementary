package com.company.Lesson17.pets.list;

import com.company.Lesson17.pets.Pet;
import com.company.Lesson17.pets.interfaces.Swim;

import java.io.IOException;

/**
 * Created by Anton on 14.11.2016.
 */
public class Dog extends Pet implements Swim {
    public Dog() throws IOException {
        setWeight(initWeight());
    }


    public void voice() {
        super.voice();
        System.out.println("Uff");
    }


    @Override
    protected void sleep() {
        System.out.println("RRRr");
    }

    @Override
    public void swim() {

    }
}
