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

    public void add(PersonType person) {
        this.personList.add(person);
    }

    public void remove(PersonType person) {
        this.personList.remove(person);
    }

    public void clear() {
        this.personList.clear();
    }

    public void addAll(Iterable<PersonType> addedList) {
        for (PersonType personType : addedList) {
            add(personType);
        }
    }

    public int size() {
        return personList.size();
    }

    public PersonType findById(Long id) {
        for (PersonType personType : this.personList) {
            if (personType.getId().equals(id)) {
                return personType;
            }
        }
        return null;
    }

    public List<PersonType> findAll() {
        return personList;
    }

}
