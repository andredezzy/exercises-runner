package me.andredezzy.exercisesrunner.exercises.oop.exercise.models;

public abstract class Person {

    protected final int id;
    protected final String name;
    protected String maritalStatus;
    protected String sex;

    public Person(int id, String name, String maritalStatus, String sex) {
        this.id = id;
        this.name = name;
        this.maritalStatus = maritalStatus;
        this.sex = sex;
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

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", maritalStatus='" + maritalStatus + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
