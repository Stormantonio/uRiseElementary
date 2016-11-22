package com.company.Lesson17.pets.list;

import com.company.Lesson17.pets.Pet;
import com.company.Lesson17.pets.interfaces.Cobweb;

import java.io.IOException;

/**
 * Created by Anton on 14.11.2016.
 */
public class Spider extends Pet implements Cobweb {
    public Spider() throws IOException {
        setWeight(initWeight());
    }

    @Override
    public void voice() {
        super.voice();
        System.out.println("Трескает лапками по паутине");
    }

    @Override
    protected void sleep() {

    }

    @Override
    public void cobweb() {

    }
}
