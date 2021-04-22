package com.epam.entity;

public class Test2 {

    private int firstVariable;
    private int secondVariable;
    final int DEFAULT_FIRST_VARIABLE = 1;
    final int DEFAULT_SECOND_VARIABLE = 3;

    public Test2() {
        this.firstVariable = DEFAULT_FIRST_VARIABLE;
        this.secondVariable = DEFAULT_SECOND_VARIABLE;
    }

    public Test2(int firstVariable, int secondVariable) {
        this.firstVariable = firstVariable;
        this.secondVariable = secondVariable;
    }

    public int getFirstVariable() {
        return firstVariable;
    }

    public void setFirstVariable(int firstVariable) {
        this.firstVariable = firstVariable;
    }

    public int getSecondVariable() {
        return secondVariable;
    }

    public void setSecondVariable(int secondVariable) {
        this.secondVariable = secondVariable;
    }
}
