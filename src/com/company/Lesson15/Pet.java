package com.company.Lesson15;

/**
 * Created by Anton on 22.11.2016.
 */
public abstract class Pet implements Comparable<Pet> {
    private double weight;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
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

    abstract public String status();

    abstract protected void sleep();

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
