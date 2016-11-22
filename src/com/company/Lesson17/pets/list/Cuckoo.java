package com.company.Lesson17.pets.list;

import com.company.Lesson17.pets.Pet;
import com.company.Lesson17.pets.interfaces.Fly;
import com.company.Lesson17.pets.interfaces.LeaveEggs;

import java.io.IOException;

/**
 * Created by Anton on 14.11.2016.
 */
public class Cuckoo extends Pet implements Fly, LeaveEggs {
    public Cuckoo() throws IOException {
        setWeight(initWeight());
    }

    @Override
    public void voice() {
        super.voice();
        System.out.println("Cuckoo");
    }

    @Override
    protected void sleep() {

    }

    @Override
    public void fly() {

    }

    @Override
    public void leaveEggs() {
        System.out.println("Подкидывает свои яйца в чужие гнезда");
    }
}
