package com.example.demo.classes;

import com.example.demo.classes.Instructors;
import com.example.demo.classes.Instructor;
import com.example.demo.classes.Students;

public class Classroom {

    private Instructors instructors;
    private Students students;

    public Classroom(Instructors instructors, Students students) {
        this.instructors = instructors;
        this.students = students;
    }

    public Instructors getInstructors() {
        return instructors;
    }

    public Students getStudents() {
        return students;
    }

    public void hostLecture(Instructor instructor, double numberOfHours) {
        instructor.lecture(students.personList, numberOfHours);
    }

}
