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
import me.andredezzy.exercisesrunner.utils.Formatter;
import me.andredezzy.exercisesrunner.utils.NumberTranslator;
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

        int exercisePackageNameAsInteger = Formatter.isInteger(exercisePackageName, -1);

        if (exercisePackageNameAsInteger != -1) {
            exercisePackageName = NumberTranslator.getTranslationTo(exercisePackageNameAsInteger)
                    .replaceAll(" ", "");
        }

        selectedPackage += exercisePackageName;

        for (String packageName : packagesAt) {
            if (packageName.equalsIgnoreCase(selectedPackage)) {
                selectedPackage = packageName;

                break;
            }
        }

        Reflections reflections = new Reflections(selectedPackage);
        Set<Class<? extends Exercise>> exerciseClasses = reflections.getSubTypesOf(Exercise.class);
        String delimitedClassesName = String.join(", ", this.getClassesName(exerciseClasses));

        System.out.println(String.format("\nSelect the exercise's class to execute: (%s)", delimitedClassesName));
        System.out.print("> ");
        String exerciseClassName = Application.ASKER.askForString();

        int exerciseClassNameAsInteger = Formatter.isInteger(exerciseClassName, -1);

        if (exerciseClassNameAsInteger != -1) {
            exerciseClassName = NumberTranslator.getTranslationTo(exerciseClassNameAsInteger)
                    .replaceAll(" ", "");
        }

        selectedPackage += "." + exerciseClassName;

        for (Class<? extends Exercise> exerciseClass : exerciseClasses) {
            String exerciseClassCanonicalName = exerciseClass.getCanonicalName();

            if (exerciseClassCanonicalName.equalsIgnoreCase(selectedPackage)) {
                selectedPackage = exerciseClassCanonicalName;

                break;
            }
        }

        System.out.println(String.format("%n-> Selected package: %s", selectedPackage));

        System.out.println(String.format("%n------------------------------------------------------------------------%n"));

        boolean foundExerciseClass = false;

        for (Class<? extends Exercise> exerciseClass : exerciseClasses) {
            if (exerciseClass.getCanonicalName().equalsIgnoreCase(selectedPackage)) {
                foundExerciseClass = true;

                try {
                    if (Exercise.class.isAssignableFrom(exerciseClass)) {
                        Exercise exercise = (Exercise) exerciseClass.newInstance();

                        exercise.run(args);
                    } else {
                        System.out.println("[ERRO] '" + selectedPackage + "' não implementa 'Exercise.class'!");
                    }
                } catch (Exception ex) {
                    Logger.getLogger(RunnerImpl.class.getName()).log(Level.SEVERE, null, ex);
                }

                break;
            }
        }

        if (!foundExerciseClass) {
            System.out.println("[ERRO] A classe '" + selectedPackage + "' não foi encontrada!");
        }

        System.out.println();
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
