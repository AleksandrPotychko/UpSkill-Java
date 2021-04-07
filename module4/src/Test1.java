public class Test1 {

    public static void printVariables(int firstVariable, int secondVariable) {
        System.out.println("First number is = " + firstVariable);
        System.out.println("Second number is = " + secondVariable);
    }

    public static int replaceVariable(int replaceableVariable, int replacingVariable) {
        return replacingVariable;
    }

    public static int calculateSum(int firstVariable, int secondVariable) {
        return firstVariable + secondVariable;
    }

    public static int findHighestVariable(int firstVariable, int secondVariable) {
        return Math.max(firstVariable, secondVariable);
    }
}
