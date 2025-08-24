package com.example.demo;

import com.example.demo.classes.Person;
import com.example.demo.classes.Student;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StudentTests {

    @Test
    public void testNullConstructor() {
        Student test = new Student();
        assertNotNull(test);
        assertEquals(0L, test.getId());
    }

    @Test
    public void test1NonNullConstructor() {
        Student test = new Student(2.2);
        assertNotNull(test);
    }

    @Test
    public void test2NonNullConstructor() {
        Student test = new Student("Jane Doe", 3.5);
        assertNotNull(test);
    }

    @Test
    public void testInstanceOfPerson() {
        Student test = new Student();
        assertInstanceOf(Person.class, test);
    }

    @Test
    public void testGetId() {
        Student test = new Student();
        Long expected = 0L;
        assertEquals(expected, test.getId());
    }

    @Test
    public void testGetSetName() {
        Student test = new Student();
        assertEquals("", test.getName());
        String expected = "Jane Doe";
        test.setName(expected);
        assertEquals("Jane Doe", test.getName());
    }

    @Test
    public void testLearn() {
        Student test = new Student(0.5);
        assertEquals(0.5, test.getTotalStudyTime());
        double addedHours = 2.5;
        double expected = 3.0;
        test.learn(addedHours);
        assertEquals(expected, test.getTotalStudyTime());
    }

}
