package com.company.Lesson15;

import com.company.Lesson15.pets.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * Created by Anton on 22.11.2016.
 * Создать побольше  домашних животных, отсортировать по весу и вывести на экран
 */
public class Main {
    public static void main(String[] args) {
        // write your code here
        Random r = new Random();

        /*Pet cat = new Cat();
        Pet dog = new Dog();
        System.out.println(cat.compareTo(dog));*/

        ArrayList<Pet> pets = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            int random = r.nextInt(7);
            if (random == 0)
                pets.add(new Cat());
            else if (random == 1)
                pets.add(new Dog());
            else if (random == 2)
                pets.add(new Chinchilla());
            else if (random == 3)
                pets.add(new Fish());
            else if (random == 4)
                pets.add(new Hamster());
            else if (random == 5)
                pets.add(new Parrot());
            else if (random == 6)
                pets.add(new Rabbit());
            else
                pets.add(new Rat());
        }
        Collections.sort(pets);
        for (Pet pet : pets) {
            pet.voice();
            System.out.println(pet.status() + " weights " + pet.getWeight());
            System.out.println();
        }
    }
}
