package me.andredezzy.exercisesrunner.runner;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import me.andredezzy.exercisesrunner.Application;
import me.andredezzy.exercisesrunner.exercises.Exercise;
import me.andredezzy.exercisesrunner.runner.manager.RunnerManager;
import me.andredezzy.exercisesrunner.utils.asker.AskerImpl;
import org.reflections.Reflections;

public class RunnerImpl implements Runner {

    public void run(String exercisesPackage, String[] args) {
        String selectedPackage = exercisesPackage;

        List<String> packagesAt = RunnerManager.getPackagesAt(exercisesPackage);
        String delimitedPackagesName = String.join(", ", this.replaceList(packagesAt, exercisesPackage, ""));

        System.out.println(String.format("Select the exercises package: (%s)", delimitedPackagesName));
        System.out.print("> ");
        String exercisePackageName = Application.ASKER.askForString();

        selectedPackage += exercisePackageName;

        Reflections reflections = new Reflections(selectedPackage);
        Set<Class<? extends Exercise>> exerciseClasses = reflections.getSubTypesOf(Exercise.class);
        String delimitedClassesName = String.join(", ", this.getClassesName(exerciseClasses));

        System.out.println(String.format("\nSelect the exercise's class to execute: (%s)", delimitedClassesName));
        System.out.print("> ");
        String exerciseClassName = Application.ASKER.askForString();

        selectedPackage += "." + exerciseClassName;

        System.out.println(String.format("%n-> Selected package: %s", selectedPackage));
        
        System.out.println(String.format("%n------------------------------------------------------------------------%n"));

        try {
            Class<?> selectedExerciseClass = Class.forName(selectedPackage);

            if (Exercise.class.isAssignableFrom(selectedExerciseClass)) {
                Exercise exercise = (Exercise) selectedExerciseClass.newInstance();

                exercise.run(args);
            } else {
                System.out.println("[ERROR] " + selectedPackage + " don't implements Exercise.class");
            }
        } catch (ClassNotFoundException ex) {
            System.out.println("[ERROR] Occurred an error: " + selectedPackage + " not found!");
        } catch (Exception ex) {
            Logger.getLogger(RunnerImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private List<String> replaceList(List<String> packageNames, String target, String replacement) {
        List<String> packagesLastName = new ArrayList<String>();

        for (String packageName : packageNames) {
            packagesLastName.add(packageName.replace(target, replacement));
        }

        return packagesLastName;
    }

    private List<String> getClassesName(Set<Class<? extends Exercise>> classes) {
        List<String> classesName = new ArrayList<String>();

        for (Class clazz : classes) {
            classesName.add(clazz.getSimpleName());
        }

        return classesName;
    }
}
