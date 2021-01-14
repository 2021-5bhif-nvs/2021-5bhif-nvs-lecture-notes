package at.htl.hobby.entity;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Hobby {

    private String descr;
    private List<Person> persons;

    //region constructors
    public Hobby() {
        setPersons(new LinkedList<>());
    }

    public Hobby(String descr) {
        this();
        this.setDescr(descr);
    }
    //endregion

    //region getter and setter

    public String getDescr() {
        return descr;
    }

    public void setDescr(String descr) {
        this.descr = descr;
    }

    public List<Person> getPersons() {
        return Collections.unmodifiableList(persons);
    }

    public void setPersons(List<Person> persons) {
        this.persons = persons;
    }
    //endregion

    public void addPerson(Person newPerson) {
        persons.add(newPerson);
    }

    public void removePerson(Person person) {
        persons.remove(person);
    }


}
