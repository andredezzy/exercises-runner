package me.andredezzy.exercisesrunner.exercises.oop.exercise.models;

public class Administrator extends Employee {

    protected double aidCosts;

    public Administrator(int id, String name, String maritalStatus, String sex) {
        super(id, name, maritalStatus, sex);
    }

    public double getAidCosts() {
        return aidCosts;
    }

    public void setAidCosts(double aidCosts) {
        this.aidCosts = aidCosts;
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
