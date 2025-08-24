package com.example.demo.classes;

import com.example.demo.interfaces.Learner;

public class Student extends Person implements Learner {

    private double totalStudyTime;

    public Student() {
        super.name = "";
        this.totalStudyTime = 0.0;
    }

    public Student(double totalStudyTime) {
        this.totalStudyTime = totalStudyTime;
    }

    public Student(String name, double totalStudyTime) {
        super.name = name;
        this.totalStudyTime = totalStudyTime;
    }

    public void learn(double numberOfHours) {
        this.totalStudyTime += numberOfHours;
    }

    public double getTotalStudyTime() {
        return totalStudyTime;
    }

}
