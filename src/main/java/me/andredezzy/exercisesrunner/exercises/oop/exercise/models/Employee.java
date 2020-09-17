package me.andredezzy.exercisesrunner.exercises.oop.exercise.models;

import java.util.List;

public class Employee extends Person {

    protected int departmentCode;
    protected double grossSalary;
    protected double aidCosts;

    protected double tax;

    public Employee(int id, String name, String maritalStatus, String sex) {
        super(id, name, maritalStatus, sex);
    }

    public int getDepartmentCode() {
        return departmentCode;
    }

    public void setDepartmentCode(int departmentCode) {
        this.departmentCode = departmentCode;
    }

    public double getGrossSalary() {
        return grossSalary;
    }

    public void setGrossSalary(double grossSalary) {
        this.grossSalary = grossSalary;

        this.tax = this.grossSalary / 100;
    }

    public double getAidCosts() {
        return aidCosts;
    }

    public void setAidCosts(double aidCosts) {
        this.aidCosts = aidCosts;
    }

    public double getTax() {
        return tax;
    }

    public double calculateSalary() {
        return this.grossSalary - this.tax;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "departmentCode=" + departmentCode +
                ", grossSalary=" + grossSalary +
                ", aidCosts=" + aidCosts +
                ", tax=" + tax +
                ", salary=" + this.calculateSalary() +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", maritalStatus='" + maritalStatus + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
