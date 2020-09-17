package me.andredezzy.exercisesrunner.exercises.oop.learning.models;

public class Secretary extends Person {
    private String category;

    public Secretary(int id) {
        super(id);
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public double calculateReward() {
        return this.getSalary() * 0.15;
    }

    public double calculateBonus(double percentage) {
        return this.getSalary() * (percentage / 100);
    }

    @Override
    public String toString() {
        return "Secretary{" +
                "category='" + category + '\'' +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", maritalStatus='" + maritalStatus + '\'' +
                ", sex='" + sex + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", salary=" + salary +
                '}';
    }
}
