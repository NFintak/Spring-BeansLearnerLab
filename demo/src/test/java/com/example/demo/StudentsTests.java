package com.example.demo;

import com.example.demo.classes.Student;
import com.example.demo.classes.Students;
import com.example.demo.classes.People;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

public class StudentsTests {

    ArrayList<Student> studentList = new ArrayList<>();
    ArrayList<Student> addedList = new ArrayList<>();

    @Test
    public void testListConstructor() {
        Students test = new Students(studentList);
        assertNotNull(test);
    }

    @Test
    public void testIntConstructor() {
        Students test = new Students(15);
    }

    @Test
    public void testInstanceOfPeople() {
        Students test = new Students(5);
        assertInstanceOf(People.class, test);
    }

    @Test
    public void testAdd() {
        Students test = new Students(studentList);
        test.add(new Student());
        assertEquals(1, test.size());
    }

    @Test
    public void testRemove() {
        Students test = new Students(studentList);
        Student student1 = new Student(), student2 = new Student();
        test.add(student1); test.add(student2);
        assertEquals(2, test.size());
        test.remove(student1);
        assertEquals(1, test.size());
    }

    @Test
    public void testClear() {
        Students test = new Students(studentList);
        Student student1 = new Student(), student2 = new Student(), student3 = new Student();
        test.add(student1); test.add(student2); test.add(student3);
        assertEquals(3, test.size());
        test.clear();
        assertEquals(0, test.size());
    }

    @Test
    public void testAddAll() {
        Students test = new Students(studentList);
        Student student1 = new Student(), student2 = new Student(), student3 = new Student();
        test.add(student1); test.add(student2); test.add(student3);
        assertEquals(3, test.size());
        Student student4 = new Student(), student5 = new Student();
        addedList.add(student4); addedList.add(student5);
        test.addAll(addedList);
        assertEquals(5, test.size());
    }

    @Test
    public void testFindById() {
        Students test = new Students(studentList);
        Student student1 = new Student(), student2 = new Student(), student3 = new Student();
        test.add(student1); test.add(student2); test.add(student3);
        //assertEquals(student3, test.findById(2L)); //revisit how id is generated in Person class
        assertNull(test.findById(4L));
    }

    @Test
    public void testFindAll() {
        Students test = new Students(studentList);
        Student student1 = new Student(), student2 = new Student(), student3 = new Student();
        test.add(student1); test.add(student2); test.add(student3);
        ArrayList<Student> expected = new ArrayList<>(studentList);
        assertEquals(expected, test.findAll());
    }

}
