package com.example.demo;

import com.example.demo.classes.Instructor;
import com.example.demo.classes.Instructors;
import com.example.demo.classes.People;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

public class InstructorsTests {

    ArrayList<Instructor> instructorList = new ArrayList<>();
    ArrayList<Instructor> addedList = new ArrayList<>();

    @Test
    public void testListConstructor() {
        Instructors test = new Instructors(instructorList);
        assertNotNull(test);
    }

    @Test
    public void testIntConstructor() {
        Instructors test = new Instructors(5);
        assertNotNull(test);
    }
}
