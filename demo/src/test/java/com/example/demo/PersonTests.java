package com.example.demo;

import com.example.demo.classes.Person;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PersonTests {

    @Test
    public void testNullConstructor() {
        Person test = new Person();
        assertNotNull(test);
        assertEquals(0L, test.getId());
    }

    @Test
    public void testNonNullConstructor() {
        Person test = new Person(123L, "Jane Doe");
        assertNotNull(test);
        assertEquals(123L, test.getId());
    }

    @Test
    public void testGetSetName() {
        Person test = new Person();
        assertEquals("", test.getName());
        String expected = "Jane Doe";
        test.setName(expected);
        assertEquals("Jane Doe", test.getName());
    }

}
