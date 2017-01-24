package com.samples.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by edara on 9/3/16.
 */
@Entity
@Table(name="phone")
public class Phone {
    @Id
    @Column(name="phone_number")
    private int ph_no;
    @Column(name="phone_type")
    private String ph_type;

    public Phone(int ph_no, String ph_type) {
        this.ph_no = ph_no;
        this.ph_type = ph_type;
    }
    public Phone(){}
    public int getPh_no() {
        return ph_no;
    }

    public void setPh_no(int ph_no) {
        this.ph_no = ph_no;
    }

    public String getPh_type() {
        return ph_type;
    }

    public void setPh_type(String ph_type) {
        this.ph_type = ph_type;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null || !(obj instanceof Phone)){
            return false;
        }
        if(((Phone)obj).getPh_no() == this.ph_no){
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.ph_no;
    }

    @Override
    public String toString() {
        return "Phone No: "+this.ph_no+" -- "+"Phone Type: "+this.ph_type;
    }
}
