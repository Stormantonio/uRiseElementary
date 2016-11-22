package com.company.Lesson15.pets;

import com.company.Lesson15.Pet;
import com.company.Lesson15.interfaces.FishInterface;

/**
 * Created by Anton on 09.11.2016.
 */
public class Fish extends Pet implements FishInterface {
    public Fish() {
        setWeight(100 + Math.random() * 3000);
    }

    @Override
    public void voice() {
        super.voice();
        System.out.println("bul-bul-bul");
    }

    @Override
    public String status() {
        return "Fish";
    }

    @Override
    protected void sleep() {
        System.out.println("bul-bul-bul");
    }

    @Override
    public void swim() {
        System.out.println("Swimming");
    }
}
