package com.example.demo;

import com.example.demo.classes.Instructor;
import com.example.demo.classes.Student;
import com.example.demo.classes.Person;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

public class InstructorTests {

    @Test
    public void testNullConstructor() {
        Instructor test = new Instructor();
        assertNotNull(test);
    }

    @Test
    public void testInstanceOf() {
        Instructor test = new Instructor();
        assertInstanceOf(Person.class, test);
    }

    @Test
    public void testTeach() {
        Instructor test = new Instructor();
        Student student = new Student();
        assertEquals(0.0, student.getTotalStudyTime());
        test.teach(student, 2.5);
        assertEquals(2.5, student.getTotalStudyTime());
    }

    @Test
    public void testLecture() {
        ArrayList<Student> students = new ArrayList<>();
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        students.add(student1); students.add(student2); students.add(student3);
        assertEquals(0.0, student1.getTotalStudyTime());

        Instructor test = new Instructor();
        test.lecture(students, 6.0);
        assertEquals(2.0, student1.getTotalStudyTime());
    }

}
