package com.solvd;

abstract class Employee extends Person {
    private int salary;
    private String role;

    abstract void doAssignedTask1();

    abstract void doAssignedTask2();

    Employee(String fName, String lName, int years, int salary, String role) {
        super(fName, lName, years);
        this.salary = salary;
        this.role = role;
    }

    //getter / setter

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
