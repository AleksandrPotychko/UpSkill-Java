package com.epam.entity;

public class Test1 {
    private int firstVariable;
    private int secondVariable;

    public Test1(int firstVariable, int secondVariable) {
        this.firstVariable = firstVariable;
        this.secondVariable = secondVariable;
    }

    public int getFirstVariable() {
        return firstVariable;
    }

    public int getSecondVariable() {
        return secondVariable;
    }

    public void setFirstVariable(int firstVariable) {
        this.firstVariable = firstVariable;
    }

    public void setSecondVariable(int secondVariable) {
        this.secondVariable = secondVariable;
    }

    public int calculateSum() {
        return firstVariable + secondVariable;
    }

    public int findHighestVariable() {
        return Math.max(firstVariable, secondVariable);
    }

    public void printVariables() {
        System.out.println("First number is = " + firstVariable);
        System.out.println("Second number is = " + secondVariable);
    }
}
