package com.github.tanasehagi.kontaktjavacli;

import java.util.ArrayList;
import java.util.Scanner;

public class MainCLI {
    private static Scanner scanner = new Scanner(System.in);
    private Contacts contacts;

    public MainCLI() {
        contacts = new Contacts(getInitialList());
        while (true) {
            displayOptions(true);
            switch (scanner.nextInt()) {
                case 1 :
                    contacts.display();
                    break;
                case 2:
                    createContact();
                    break;
                case 0 :
                    return;
                default:
                    displayOptions(false);
                    break;
            }
        }
    }

    private void displayOptions(boolean correct) {
        System.out.println("\n" +
            "Please choose " + (correct ? "an " : "a correct ") + "option\n" +
            "\t1\t-\tDisplay Contacts\n" +
            "\t2\t-\tAdd contact\n" +
            "\t0\t-\tExit\n" +
            "");
    }

    private void createContact() {
        Contact contact = new Contact();
        System.out.println("Name:");
        contact.setName(scanner.next());
        System.out.println("Surname:");
        contact.setSurname(scanner.next());
        System.out.println("Phone Number:");
        contact.setPhoneNumber(scanner.next());
        System.out.println("Are you sure you want to add contact:");
        contact.display();
        if (confirm()) {
            contacts.addContact(contact);
            System.out.println("New contact was added!");
            contact.display();
            return;
        }
        System.out.println("New contact was discarded!");
    }

    private boolean confirm() {
        System.out.println("1 - Yes, 2 - No");
        switch (scanner.nextInt()) {
            case 1 :
                return true;
            case 2 :
                return false;
            default:
                confirm();
        }
        return false;
    }

    private ArrayList<Contact> getInitialList() {
        ArrayList<Contact> contacts = new ArrayList<>();
        contacts.add(new Contact("Vasile", "Ionescu", "07277356127"));
        contacts.add(new Contact("Ion", "Vasilescu", "07277765904"));
        contacts.add(new Contact("Rodica", "Popescu", "07277635456"));
        return contacts;
    }
}
