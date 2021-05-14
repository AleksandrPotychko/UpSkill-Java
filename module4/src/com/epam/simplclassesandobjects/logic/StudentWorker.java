package com.epam.simplclassesandobjects.logic;

import com.epam.simplclassesandobjects.entity.Student;

public class StudentWorker {
    final static int NUMBER_OF_GRADES = 5;
    public static boolean isTopStudent(int lowerBoundaryOfGrades, Student student) {
        int [] academicAchievement = student.getAcademicAchievement();
        for (int i = 0; i < NUMBER_OF_GRADES; i++) {
            if (academicAchievement[i] < lowerBoundaryOfGrades) {
                return false;
            }
        }
        return true;
    }
}
