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
    public void testNonNullConstructor() {
        Student test = new Student(2.2);
        assertNotNull(test);
    }

    @Test
    public void testInstanceOfPerson() {
        Student test = new Student();
        assertInstanceOf(Person.class, test);
    }



}
