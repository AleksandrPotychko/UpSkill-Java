package com.epam.simplclassesandobjects.starter;

import com.epam.entity.*;
import com.epam.simplclassesandobjects.entity.*;
import com.epam.logic.*;
import com.epam.simplclassesandobjects.init.*;
import com.epam.simplclassesandobjects.logic.*;
import com.epam.simplclassesandobjects.util.init.*;
import com.epam.util.init.*;

import java.util.ArrayList;
import java.util.Arrays;


public class TaskLauncher {

    private static int FIRST_VARIABLE = 7;
    private static int SECOND_VARIABLE = 3;
    private static int LOWER_BOUNDARY_OF_GRADES = 9;
    private static final boolean IS_RANDOM = true;
    private static int REPETITION_COUNT = 10;
    private static int MIN_VALUE = 1;
    private static int MAX_VALUE = 100;
    private static int HOURS = 20;
    private static int MINUTES = 33;
    private static int SECONDS = 17;
    private static int INCREASING_NUMBER = 5;
    private static String AUTHOR = "Frank Herbert";
    private static String PUBLISHER = "Macmillan and Co";
    private static int LOWER_LIMIT_PUBLICATION_YEAR = 1900;
    private static String DESTINATION_POINT = "Dubai";
    private static String WEEK_DAY = "Monday";
    private static double DEPARTURE_TIME = 11.15;


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

        //task 4
        Train[] trains = ArrayInitializer.createTrains();
        Arrays.sort(trains, new TrainByDestinationNameComparator());
        Arrays.sort(trains, new TrainByNumberComparator());
        System.out.println(Arrays.toString(trains));
        System.out.println(TrainWorker.getTrainByNumber(trains,1));

        //task 5
        Counter counter = new Counter(false, MIN_VALUE,MAX_VALUE);
        System.out.println(counter.toString());
        for (int i = 0; i < REPETITION_COUNT + 1; i++) {
            CounterWorker.increase(counter);
            System.out.println(counter.toString());
        }

        //task 6
        Time time = new Time(HOURS,MINUTES,SECONDS);
        System.out.println(time);

        //task 7
        Triangle triangle = TriangleInitializer.createTriangle(1,1,3,1,2,2);
        System.out.println(TriangleWorker.calculatePerimeter(triangle));
        System.out.println(TriangleWorker.calculateSquare(triangle));
        System.out.println(TriangleWorker.findIntersectionPointOfTheMedians(triangle));

        //task 8
        Customer[] customers = CustomerInit.createCustomer(6);
        Arrays.sort(customers);
        System.out.println(Arrays.toString(customers));
        System.out.println(CustomerWorker.findBuyersWhoseCreditCardInTheRange(customers, 0, 10));

        //task 9
        Book[] books = BookAggregator.createBook(5);
        System.out.println(BookWorker.findAuthorsBooks(books, new String[]{AUTHOR}));
        System.out.println(BookWorker.findPublisherBooks(books, PUBLISHER));
        System.out.println(BookWorker.findBooksPublishedAfterYear(books, LOWER_LIMIT_PUBLICATION_YEAR));

        //task 10
        Airline[] airlines = AirlineAggregator.createAirline(7);
        System.out.println(AirlineWorker.findPlanesForDestination(airlines,DESTINATION_POINT));
        System.out.println(AirlineWorker.findPlanesForWeekDay(airlines,WEEK_DAY));
        System.out.println(AirlineWorker.findPlanesForDepartureTime((ArrayList<Airline>) AirlineWorker.
                    findPlanesForWeekDay(airlines, WEEK_DAY), DEPARTURE_TIME));
    }
}
