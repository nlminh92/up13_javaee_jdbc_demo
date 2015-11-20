package com.thai.model;

import javax.persistence.Embeddable;

@Embeddable
public class Address {

    private String address;

    private int estate;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getEstate() {
        return estate;
    }

    public void setEstate(int estate) {
        this.estate = estate;
    }
}
