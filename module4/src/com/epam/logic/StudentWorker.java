package com.epam.logic;

import com.epam.entity.Student;

public class StudentWorker {
    final static int NUMBER_OF_GRADES = 5;
    public static boolean isTopStudent(int lowerBoundaryOfGrades, Student students) {
        int [] academicAchievement = students.getAcademicAchievement();
        for (int i = 0; i < NUMBER_OF_GRADES; i++) {
            if (academicAchievement[i] < lowerBoundaryOfGrades) {
                return false;
            }
        }
        return true;
    }
}