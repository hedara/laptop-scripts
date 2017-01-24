package com.samples.hibernate.ex2;

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * Created by edara on 8/15/16.
 */
@Embeddable
public class Address {
    @Column(name="STREET")
    private String st;
    @Column(name="CITY")
    private String city;
    @Column(name="ZIP")
    private String zip;

    public String getSt() {
        return st;
    }

    public void setSt(String st) {
        this.st = st;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }
}
