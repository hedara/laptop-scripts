package com.samples.cxfservice1;

/**
 * Created by edara on 10/8/16.
 */
public class Employee {
    private int id;
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String toString(){
        return "->"+id+"-"+name;
    }
}
