package com.example.demo.classes;

import com.example.demo.interfaces.Teacher;
import com.example.demo.interfaces.Learner;

import java.util.ArrayList;

public class Instructor extends Person implements Teacher {

    public Instructor() {

    }

    public void teach(Learner learner, double numberOfHours) {
        learner.learn(numberOfHours);
    }

    public void lecture(Iterable<? extends Learner> learners, double numberOfHours) {
        ArrayList<Learner> learnersArray = new ArrayList<>();
        for (Learner learner : learners) {
            learnersArray.add(learner);
        }
        double hoursPerLearner = numberOfHours / learnersArray.size();
        for (Learner learner : learners) {
            learner.learn(hoursPerLearner);
        }
    }

}
