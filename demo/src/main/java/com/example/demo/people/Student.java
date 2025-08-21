package com.example.demo.people;

import com.example.demo.interfaces.Learner;

public class Student extends Person implements Learner {

    private double totalStudyTime;

    public Student(double totalStudyTime) {
        this.totalStudyTime = totalStudyTime;
    }

    public void learn(double numberOfHours) {
        this.totalStudyTime += numberOfHours;
    }

    public double getTotalStudyTime() {
        return totalStudyTime;
    }

}
