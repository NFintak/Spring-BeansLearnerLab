package com.example.demo.classes;

import java.util.List;

public class Students extends People<Student> {

    public Students(List<Student> studentList) {
        super(studentList);
    }

}
