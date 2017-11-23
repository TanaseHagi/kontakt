package com.github.tanasehagi.kontaktjavacli;

import java.util.ArrayList;

//enum SortBy {
//    NAME, SURNAME, PHONENUMBER,
//}

public class Contacts {
    private ArrayList<Contact> contacts;

    public Contacts() {
        this.contacts = new ArrayList<>();
    }

    public Contacts(ArrayList<Contact> contacts) {
        this.contacts = contacts;
    }

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public void display(String text) {
        contacts.stream()
                .filter(c -> c.getName() == text || c.getSurname() == text || c.getPhoneNumber() == text)
                .forEach(c -> c.display());
    }

    public void display() {
        System.out.println("Name\tSurname\tPhone Number\n");
        contacts.forEach(c -> c.display());
//        contacts.forEach(Contact::display);
    }
}
