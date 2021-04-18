package com.epam.entity;

import java.util.Arrays;

public class Student {
    private String lastName;
    private String initials;
    private int group;
    private int numberOfGrades = 5;
    private int[] academicAchievement;

    public Student(String lastName, String initials, int group, int[] academicAchievement) {
        this.lastName = lastName;
        this.initials = initials;
        this.group = group;
        this.academicAchievement = academicAchievement;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getInitials() {
        return initials;
    }

    public void setInitials(String initials) {
        this.initials = initials;
    }

    public int getGroup() {
        return group;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public int getNumberOfGrades() {
        return numberOfGrades;
    }

    public void setNumberOfGrades(int numberOfGrades) {
        this.numberOfGrades = numberOfGrades;
    }

    public int[] getAcademicAchievement() {
        return academicAchievement;
    }

    public void setAcademicAchievement(int[] academicAchievement) {
        this.academicAchievement = academicAchievement;
    }

    @Override
    public String toString() {
        return "Student{" +
                "lastName = '" + lastName + '\'' +
                initials + '\'' +
                ", group = " + group +
                ", academicAchievement = " + Arrays.toString(academicAchievement) +
                '}';
    }
}