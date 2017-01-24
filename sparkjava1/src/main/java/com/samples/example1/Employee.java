package com.samples.example1;

/**
 * Created by edara on 9/28/16.
 */
public class Employee {
    private String firstName;
    private String lastName;
    private String dept;

    Employee(String first, String last, String dept){
        this.firstName= first;
        this.lastName = last;
        this.dept = dept;
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

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }
}
