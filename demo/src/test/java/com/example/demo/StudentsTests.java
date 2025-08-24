package com.example.demo;

import com.example.demo.classes.Student;
import com.example.demo.classes.Students;
import com.example.demo.classes.People;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import java.util.ArrayList;

public class StudentsTests {

    @Test
    public void testListConstructor() {
        List<Student> studentList = new ArrayList<>();
        Students test = new Students(studentList);
        assertNotNull(test);
    }

    @Test
    public void testIntConstructor() {
        Students test = new Students(15);
    }


}
