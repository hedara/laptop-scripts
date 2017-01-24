package com.samples.hibernate.ex2;

import javax.persistence.*;

/**
 * Created by edara on 8/15/16.
 */
@Entity
@Table(name="EMPLOYEE")
public class Employee {
    @Id @GeneratedValue
    private int id;
    @Column(name="NAME")
    private String Name;
    @Embedded
    private Address address;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
