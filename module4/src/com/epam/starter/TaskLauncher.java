package com.epam.starter;

import com.epam.entity.Student;
import com.epam.entity.Test1;
import com.epam.entity.Test2;
import com.epam.entity.Train;
import com.epam.logic.StudentWorker;
import com.epam.util.init.ArrayInitializer;
import com.epam.logic.TrainWorker;

import java.util.Arrays;


public class TaskLauncher {

    private static int FIRST_VARIABLE = 7;
    private static int SECOND_VARIABLE = 3;
    private static int LOWER_BOUNDARY_OF_GRADES = 9;

    public static void main(String[] args) {

        //task 1
        Test1 test1 = new Test1(FIRST_VARIABLE, SECOND_VARIABLE);
        test1.printVariables();
        System.out.println(test1.calculateSum());
        test1.setFirstVariable(LOWER_BOUNDARY_OF_GRADES);
        System.out.println(test1.findHighestVariable());

        //task 2
        Test2 test2 = new Test2();
        System.out.println(test2.getFirstVariable());
        System.out.println(test2.getSecondVariable());

        Test2 test21 = new Test2(FIRST_VARIABLE, SECOND_VARIABLE);
        System.out.println(test21.getFirstVariable());
        System.out.println(test21.getSecondVariable());

        //task 3
        Student[] students = ArrayInitializer.createStudents();
        for (Student student : students) {
            if (StudentWorker.isTopStudent(LOWER_BOUNDARY_OF_GRADES, student))
                System.out.println(student);
        }

        //task4
        Train[] trains = ArrayInitializer.createTrains();
        TrainWorker.selectTrainNumber(trains);
        System.out.println(Arrays.toString(TrainWorker.sortTrainNumber(trains)));

    }
}