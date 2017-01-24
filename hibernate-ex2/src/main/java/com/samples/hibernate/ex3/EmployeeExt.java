package com.samples.hibernate.ex3;

/**
 * Created by edara on 8/20/16.
 */
public class EmployeeExt {
    private int id;
    private String name;
    private String position;
    private AddressExt addressExt;

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

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public AddressExt getAddressExt() {
        return addressExt;
    }

    public void setAddressExt(AddressExt addressExt) {
        this.addressExt = addressExt;
    }
    public String toString() {
        return id+"-"+name+"-"+position+"-"+addressExt.getAddr_st()+"-"+addressExt.getAddr_city()+"-"+addressExt.getAddr_state();
    }

}
