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

    @Test
    public void testInstanceOfPeople() {
        Instructors test = new Instructors(instructorList);
        assertInstanceOf(People.class, test);
    }

    @Test
    public void testAdd() {
        Instructors test = new Instructors(instructorList);
        test.add(new Instructor());
        assertEquals(1, test.size());
    }

    @Test
    public void testRemove() {
        Instructors test = new Instructors(instructorList);
        Instructor instructor1 = new Instructor(), instructor2 = new Instructor();
        test.add(instructor1); test.add(instructor2);
        assertEquals(2, test.size());
        test.remove(instructor1);
        assertEquals(1, test.size());
    }

    @Test
    public void testClear() {
        Instructors test = new Instructors(instructorList);
        Instructor instructor1 = new Instructor(), instructor2 = new Instructor();
        test.add(instructor1); test.add(instructor2);
        assertEquals(2, test.size());
        test.clear();
        assertEquals(0, test.size());
    }

    @Test
    public void testAddAll() {
        Instructors test = new Instructors(instructorList);
        Instructor instructor1 = new Instructor(), instructor2 = new Instructor();
        test.add(instructor1); test.add(instructor2);
        assertEquals(2, test.size());
        Instructor instructor3 = new Instructor(), instructor4 = new Instructor();
        addedList.add(instructor3); addedList.add(instructor4);
        test.addAll(addedList);
        assertEquals(4, test.size());
    }

}
