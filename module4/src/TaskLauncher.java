import java.util.Random;

public class TaskLauncher {

    private static int FIRST_VARIABLE = 7;
    private static int SECOND_VARIABLE = 3;
    private static int STUDENT_POPULATION = 10;
    private static int FIRST_GRADE_BORDER = 9;
    private static int LAST_GRADE_BORDER = 10;

    public static void main(String[] args) {

        //task 1
        System.out.println(Test1.calculateSum(FIRST_VARIABLE, SECOND_VARIABLE));
        Test1.printVariables(FIRST_VARIABLE, SECOND_VARIABLE);
        System.out.println(Test1.findHighestVariable(FIRST_VARIABLE, SECOND_VARIABLE));

        //task 2
        Test2 defaultConstructor = new Test2();
        System.out.println(defaultConstructor.getFirstVariable());
        System.out.println(defaultConstructor.getSecondVariable());

        Test2 assignOurVariables = new Test2(FIRST_VARIABLE, SECOND_VARIABLE);
        int firstVariable = assignOurVariables.getFirstVariable();
        int secondVariable = assignOurVariables.getSecondVariable();
        System.out.println(firstVariable);
        System.out.println(secondVariable);

        //task 3
        Student[] students = new Student[STUDENT_POPULATION];
        students[0] = new Student("Potychko", "A.A.", 1);
        students[1] = new Student("Sietova", "D.E.", 1);
        students[2] = new Student("Ivanov", "A.S..", 1);
        students[3] = new Student("Malfoy", "R.T.", 2);
        students[4] = new Student("Silkina", "U.M.", 2);
        students[5] = new Student("Drobysh", "A.M.", 3);
        students[6] = new Student("Kvaigon", "D.D.", 3);
        students[7] = new Student("Skywoker", "L.D.", 4);
        students[8] = new Student("Organa", "L.T.", 5);
        students[9] = new Student("Poter", "G.S.", 5);

        for (int i = 0; i < STUDENT_POPULATION; ++i) {
            students[i].addGrade((int) (Math.random() * 10));
        }
        System.out.println("Top students: ");
        for (int i = 0; i < STUDENT_POPULATION; ++i) {
            if (students[i].isTopStudent(FIRST_GRADE_BORDER, LAST_GRADE_BORDER))
                students[i].printTopStudent();
        }
    }
}