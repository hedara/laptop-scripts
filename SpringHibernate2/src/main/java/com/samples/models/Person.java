package com.samples.models;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by edara on 9/2/16.
 */
@Entity(name = "person" )
public class Person {

    @Id
    private int ssn;
    @Column(name = "firstname")
    private String firstName;
    @Column(name="lastname")
    private String lastName;

    @OneToMany(cascade = {CascadeType.ALL}, orphanRemoval = true )
    private Set<Phone> phones = new HashSet<Phone>();

    public Person(int ssn,String first, String last){
        this.ssn = ssn;
        this.firstName =first;
        this.lastName = last;
    }
    public Person(){}

    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstname) {
        this.firstName = firstname;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastname) {

        this.lastName = lastName;
        System.out.println(this.lastName);
    }
    public String toString() {
        return "SSN : "+ssn+"   "+"FirstName: "+firstName+"    "+"LastName: "+ getLastName();
    }

    public Set<Phone> getPhones() {
        return phones;
    }

    public void setPhones(Set<Phone> phones) {
        this.phones = phones;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null || !(obj instanceof Person)){
            return false;
        }
        if(((Person)obj).getSsn() == this.ssn){
            return true;
        }
        return false;
    }
}
