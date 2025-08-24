package com.example.demo.classes;

import java.util.List;

public class Instructors extends People<Instructor> {

    public Instructors(List<Instructor> instructorList) {
        super(instructorList);
    }

    public Instructors(int numOfInstructors) {
        super(numOfInstructors);
    }
}
