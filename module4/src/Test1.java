public class Test1 {
    int firstVariable;
    int secondVariable;

    public Test1(int firstVariable, int secondVariable) {
        this.firstVariable = firstVariable;
        this.secondVariable = secondVariable;
    }

    public int getFirstVariable()
    {
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

    public static int calculateSum(int firstVariable, int secondVariable) {
        return firstVariable + secondVariable;
    }

    public static int findHighestVariable(int firstVariable, int secondVariable) {
        return Math.max(firstVariable, secondVariable);
    }

    public static void printVariables(int firstVariable, int secondVariable) {
        System.out.println("First number is = " + firstVariable);
        System.out.println("Second number is = " + secondVariable);
    }
}
