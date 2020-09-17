package me.andredezzy.exercisesrunner.exercises.oop.exercise;

import me.andredezzy.exercisesrunner.Application;
import me.andredezzy.exercisesrunner.exercises.Exercise;
import me.andredezzy.exercisesrunner.exercises.oop.exercise.models.Administrator;
import me.andredezzy.exercisesrunner.exercises.oop.exercise.models.Employee;
import me.andredezzy.exercisesrunner.exercises.oop.exercise.models.Person;

import java.util.ArrayList;

public class Main implements Exercise {

    @Override
    public void run(String[] args) {
        ArrayList<Person> people = new ArrayList<>();

        System.out.println("Informe as informações da pessoa a ser cadastrada:\n");

        System.out.print("- Nome: ");
        String name = Application.ASKER.askForString();

        System.out.print("- Estado civil: ");
        String maritalStatus = Application.ASKER.askForString();

        System.out.print("- Sexo: ");
        String sex = Application.ASKER.askForString();

        System.out.print("- Salário bruto: ");
        double grossSalary = Application.ASKER.askForDouble();

        System.out.print("- Ajuda de custos: ");
        double aidCosts = Application.ASKER.askForDouble();

        System.out.print("- É administrador [S/N]? ");
        boolean administrator = Application.ASKER.askForBoolean();

        int personId = people.size() + 1;
        Employee employee;

        if (administrator) {
            employee = new Administrator(personId, name, maritalStatus, sex);
        } else {
            employee = new Employee(personId, name, maritalStatus, sex);
        }

        employee.setGrossSalary(grossSalary);
        employee.setAidCosts(aidCosts);

        System.out.printf("%n%s", employee);

        people.add(employee);
    }
}
