package me.andredezzy.exercisesrunner.exercises.oop.exercise.models;

public class Administrator extends Employee {

    public Administrator(int id, String name, String maritalStatus, String sex) {
        super(id, name, maritalStatus, sex);
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + this.aidCosts;
    }

    @Override
    public String toString() {
        return "Administrator{" +
                "departmentCode=" + departmentCode +
                ", grossSalary=" + grossSalary +
                ", aidCosts=" + aidCosts +
                ", tax=" + tax +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", maritalStatus='" + maritalStatus + '\'' +
                ", sex='" + sex + '\'' +
                ", salary='" + this.calculateSalary() + '\'' +
                '}';
    }
}
