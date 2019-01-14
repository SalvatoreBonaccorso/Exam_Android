package com.example.salvatorebonaccorso.myapplication2019;

import java.util.ArrayList;
import java.util.List;

public class StudentsSingleton {
    private static StudentsSingleton instance;

    private List<Integer> studentsList;


    public static StudentsSingleton getInstance() {
        if (instance == null)
            instance = new StudentsSingleton();

        return instance;
    }

    private StudentsSingleton() {
        studentsList = new ArrayList<Integer>();
        studentsList.add(R.string.student_1);
        studentsList.add(R.string.student_3);
        studentsList.add(R.string.student_7);
        studentsList.add(R.string.student_9);
        studentsList.add(R.string.student_11);
        studentsList.add(R.string.student_13);
        studentsList.add(R.string.student_15);
        studentsList.add(R.string.student_17);
        studentsList.add(R.string.student_19);
    }

    public List<Integer> getStudentsList() {
        return studentsList;
    }

}

