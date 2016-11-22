package com.company.Lesson17.pets;

import com.company.Lesson17.pets.list.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Anton on 22.11.2016.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        // write your code here

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Pet> pets = new ArrayList<>();
        for (; ; ) {
            System.out.println("Choose a pet to create:");
            String[] petsArray = new String[]{"Cat", "Dog", "Parrot", "Tuna", "Piton", "Cow", "Cuckoo", "Spider", "Platypus"};
            int count = 0;
            int counter = 0;
            for (; ; ) {
                for (int i = 0 + count; i < petsArray.length; i++) {
                    System.out.print(petsArray[i] + " | ");
                    count++;
                    counter++;
                    if (counter > 4) {
                        counter = 0;
                        System.out.println();
                        continue;
                    } else if (count == petsArray.length) {
                        System.out.println();
                        break;
                    }
                }
                System.out.println("or commands: getAll | exit");
                break;
            }

            String[] params = reader.readLine().trim().toLowerCase().split(" ");
            if (params.length < 1 || params.length > 2) {
                System.out.println("Wrong command!");
                continue;
            }
            switch (params[0]) {
                case "cat":
                    pets.add(new Cat());
                    break;
                case "dog":
                    pets.add(new Dog());
                    break;
                case "parrot":
                    pets.add(new Parrot());
                    break;
                case "tuna":
                    pets.add(new Tuna());
                    break;
                case "piton":
                    pets.add(new Piton());
                    break;
                case "cow":
                    pets.add(new Cow());
                    break;
                case "cuckoo":
                    pets.add(new Cuckoo());
                    break;
                case "spider":
                    pets.add(new Spider());
                    break;
                case "platypus":
                    pets.add(new Platypus());
                    break;
                case "exit":
                    return;
                case "getall":
                    if (pets.size() == 0) {
                        System.out.println("List doesn't has any pet!");
                        break;
                    }
                    Collections.sort(pets);
                    for (Pet pet : pets) {
                        pet.voice();
                        System.out.println(pet.getWeight());
                    }
                    break;
                default:
                    System.out.println("Wrong command!");
                    break;
            }
        }

        // поправте ситуацию с абстракцией так, чтобы вес обязательно определял программист, создавая какое-то
        // домашнее животное, поиграйтесь с абстракцией так, чтобы было побольше домашних животных
        // с разными возможностями (методами)
    }
}
