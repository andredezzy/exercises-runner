package me.andredezzy.exercisesrunner.exercises.oop.learning.models;

public abstract class Person {

    protected final int id;
    protected String name;
    protected String maritalStatus;
    protected String sex;
    protected double height;
    protected double weight;
    protected double salary;

    public Person(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public abstract double calculateReward();

    @Override
    public String toString() {
        return String.format("Person{id=%d, name='%s', maritalStatus='%s', sex='%s', height=%s, weight=%s, salary=%s}", id, name, maritalStatus, sex, height, weight, salary);
    }
}
