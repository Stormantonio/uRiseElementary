package com.company.Lesson17.pets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Anton on 22.11.2016.
 */
public abstract class Pet implements Comparable<Pet> {
    private double weight;

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public final void run() {
        System.out.println("running");
    }

    public final void eat() {
        System.out.println("eat");
    }

    public void voice() {
        System.out.println("What say the pet?");
    }

    abstract protected void sleep();


    public double initWeight() throws IOException {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the weight of the " + getClass().getSimpleName().toLowerCase() + ", please (grams):");
            Double weightPet = Double.parseDouble(reader.readLine());
            System.out.println("The " + getClass().getSimpleName().toLowerCase() + " is successfully created!");
            System.out.println();
            return weightPet;
        } catch (NumberFormatException e) {
            System.out.println("Wrong initialization! Try more:");
        }
        return initWeight();
    }

    @Override
    public int compareTo(Pet o) {
        if (this.getWeight() < o.getWeight())
            return -1;
        else if (this.getWeight() > o.getWeight())
            return +1;
        else
            return 0;
    }
}
