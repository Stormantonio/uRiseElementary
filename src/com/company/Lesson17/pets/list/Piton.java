package com.company.Lesson17.pets.list;

import com.company.Lesson17.pets.Pet;
import com.company.Lesson17.pets.interfaces.Crawl;

import java.io.IOException;

/**
 * Created by Anton on 14.11.2016.
 */
public class Piton extends Pet implements Crawl {
    public Piton() throws IOException {
        setWeight(initWeight());
    }

    @Override
    public void voice() {
        super.voice();
        System.out.println("Shhhhhh");
    }

    @Override
    protected void sleep() {

    }

    @Override
    public void crawl() {
        System.out.println("Ползает");
    }
}
