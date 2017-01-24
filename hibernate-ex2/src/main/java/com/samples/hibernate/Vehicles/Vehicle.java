package com.samples.hibernate.Vehicles;

/**
 * Created by edara on 8/20/16.
 */
public class Vehicle {
    private String pno;
    private String vtype;
    private int owner_ssn;
    public String getPno() {
        return pno;
    }

    public void setPno(String pno) {
        this.pno = pno;
    }

    public String getVtype() {
        return vtype;
    }

    public void setVtype(String vtype) {
        this.vtype = vtype;
    }

    public int getOwner_ssn() {
        return owner_ssn;
    }

    public void setOwner_ssn(int owner_ssn) {
        this.owner_ssn = owner_ssn;
    }
}
