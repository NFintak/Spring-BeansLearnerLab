package com.example.demo.classes;

import java.util.List;
import java.util.ArrayList;

public abstract class People<PersonType extends Person> {

    List<PersonType> personList;

    public People(List<PersonType> personList) {
        this.personList = personList;
    }

    public People(int number) {
        this.personList = new ArrayList<PersonType>(number);
    }

    public void addPersonType(PersonType person) {
        this.personList.add(person);
    }

}
