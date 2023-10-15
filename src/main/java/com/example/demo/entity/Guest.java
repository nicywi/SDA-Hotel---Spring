package com.example.demo.entity;

import javax.persistence.*;

@Entity
@Table(name = "GUEST")
public class Guest {
    //CREATE TABLE GUEST(
    //  GUEST_ID BIGSERIAL PRIMARY KEY,
    @Id
    @Column(name = "GUEST_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long guestId;

    //  FIRST_NAME VARCHAR(64),
    @Column(name = "FIRST_NAME")
    private String firstName;
    //  LAST_NAME VARCHAR(64),
    @Column(name = "LAST_NAME")
    private String lastName;
    //  EMAIL_ADDRESS VARCHAR(64),
    @Column(name = "EMAIL_ADDRESS")
    private String emailAddress;
    //  ADDRESS VARCHAR(64),
    @Column(name = "ADDRESS")
    private String address;
    //  COUNTRY VARCHAR(32),
    @Column(name = "COUNTRY")
    private String country;
    //  STATE VARCHAR(12),

    @Column(name = "STATE")
    private String state;
    //  PHONE_NUMBER VARCHAR(24)

    @Column(name = "PHONE_NUMBER")
    private String phoneNumber;

    public long getGuestId() {
        return guestId;
    }

    public void setGuestId(long guestId) {
        this.guestId = guestId;
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

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Guest{" +
                "guestId=" + guestId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", address='" + address + '\'' +
                ", country='" + country + '\'' +
                ", state='" + state + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }
}
