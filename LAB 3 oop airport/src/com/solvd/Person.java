package com.solvd;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    Person(String fName, String lName, int years) {
        this.firstName = fName;
        this.lastName = lName;
        this.age = years;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "First Name: " + firstName +
                " Last Name: " + lastName +
                " age: " + age;

    }
}
