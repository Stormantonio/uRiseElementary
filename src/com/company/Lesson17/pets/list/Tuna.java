package com.company.Lesson17.pets.list;

import com.company.Lesson17.pets.Pet;
import com.company.Lesson17.pets.interfaces.Fly;
import com.company.Lesson17.pets.interfaces.Swim;

import java.io.IOException;

/**
 * Created by Anton on 14.11.2016.
 */
public class Tuna extends Pet implements Swim, Fly {
    public Tuna() throws IOException {
        setWeight(initWeight());
    }

    @Override
    public void voice() {
        super.voice();
        System.out.println("Брынчит, как расстроенная гитара");
    }

    @Override
    protected void sleep() {

    }

    @Override
    public void swim() {

    }

    @Override
    public void fly() {

    }
}
