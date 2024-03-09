package org.tp24.entity;

import java.time.LocalDate;

public class Customer {
    private String document;
    private String name;
    private String lastname;
    private LocalDate birthdate;
    private String address;
    private double maxQuota;

    public Customer(String document, String name, String Lastname, LocalDate birthdate, String address, double maxQuota) {
        this.document = document;
        this.name = name;
        this.lastname = Lastname;
        this.birthdate = birthdate;
        this.address = address;
        this.maxQuota = maxQuota;
    }


    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getMaxQuota() {
        return maxQuota;
    }

    public void setMaxQuota(double maxQuota) {
        this.maxQuota = maxQuota;
    }
}
