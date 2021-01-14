package at.htl.hobby.entity;

public class Person {

    private String name;
    private Hobby hobby;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Hobby getHobby() {
        return hobby;
    }

    public void setHobby(Hobby newHobby) {

        // gibt es bereits einen Member?
        if (this.hobby != null) {
            hobby.removePerson(this);
        }

        this.hobby = newHobby;

        // wenn möglich, trage eine neue Person in Hobby ein
        if (newHobby != null) {
            this.hobby.addPerson(this);
        }
    }
}
