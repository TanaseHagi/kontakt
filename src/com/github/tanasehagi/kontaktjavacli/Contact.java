package com.github.tanasehagi.kontaktjavacli;

public class Contact {
    private String name;
    private String surname;
    private String phoneNumber;
    private String address;

    public Contact() {

    }

    public Contact(String name, String surname, String phoneNumber) {
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
    }

    public void display() {
        System.out.println(name + "\t" + surname + "\t" + phoneNumber);
    }

    public void display(int index) {
        System.out.println(index + "\t" + name + "\t" + surname + "\t" + phoneNumber);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
