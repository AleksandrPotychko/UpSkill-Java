public class TaskLauncher {

    private static int FIRST_VARIABLE = 7;
    private static int SECOND_VARIABLE = 3;


    public static void main(String[] args) {

        //task 1
        System.out.println(Test1.calculateSum(FIRST_VARIABLE, SECOND_VARIABLE));
        Test1.printVariables(FIRST_VARIABLE, SECOND_VARIABLE);
        System.out.println(Test1.findHighestVariable(FIRST_VARIABLE, SECOND_VARIABLE));
        System.out.println(Test1.replaceVariable(FIRST_VARIABLE, SECOND_VARIABLE));

        //task 2
        Test2 defaultConstructor = new Test2();
        System.out.println(defaultConstructor.getFirstVariable());
        System.out.println(defaultConstructor.getSecondVariable());

        Test2 assignOurVariables = new Test2(FIRST_VARIABLE, SECOND_VARIABLE);
        int firstVariable = assignOurVariables.getFirstVariable();
        int secondVariable = assignOurVariables.getSecondVariable();
        System.out.println(firstVariable);
        System.out.println(secondVariable);
    }
}
