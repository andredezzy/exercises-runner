package me.andredezzy.exercisesrunner.exercises.two.one;

import com.google.common.base.Strings;

public class Date {
    private int year;
    private int month;
    private int day;

    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public String format() {
        return String.format("%02d/%02d/%d", this.day, this.month, this.year);
    }
}
