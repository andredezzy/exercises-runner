package me.andredezzy.exercisesrunner.exercises.oop.learning;

import me.andredezzy.exercisesrunner.exercises.Exercise;
import me.andredezzy.exercisesrunner.exercises.oop.learning.models.Secretary;

import java.util.ArrayList;
import java.util.Arrays;

public class Main implements Exercise {

    @Override
    public void run(String[] args) {
        ArrayList<Secretary> secretaries = new ArrayList<>();

        Secretary secretary1 = new Secretary(1);
        secretary1.setName("Ana");

        secretaries.add(secretary1);

        System.out.println("Lista de secretárias:");
        System.out.println(Arrays.toString(secretaries.toArray()));
    }
}
