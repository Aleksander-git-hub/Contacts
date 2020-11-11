package edu.javacourse.contact;

import edu.javacourse.contact.control.ContactManager;
import edu.javacourse.contact.entity.Contact;

import java.util.List;

public class ContactTest
{
    public static void main(String[] args) {
        ContactManager contactManager = new ContactManager();

        Contact contact1 = new Contact("Виктория", "Морозова",
                "+79506164953", "email1");
        Contact contact2 = new Contact("Светлана", "Милосердова",
                "+79524646045", "email2");
        Contact contact3 = new Contact("Александр", "Чугунов",
                "+79524561237", "email3");

        System.out.println("\tADD CONTACTS==============");
        Long contactID1 = contactManager.addContact(contact1);
        Long contactID2 = contactManager.addContact(contact2);
        Long contactID3 = contactManager.addContact(contact3);
        List<Contact> result1 = contactManager.findContacts();
        for (Contact contact : result1) {
            System.out.println(contact);
        }

        System.out.println("\tUPDATE CONTACTS==============");
        Contact changeContact = new Contact(contactID1, "Виктория", "Чугунова",
                "+79506164953", "email1" );
        contactManager.updateContact(changeContact);
        List<Contact> result2 = contactManager.findContacts();
        for (Contact contact : result2) {
            System.out.println(contact);
        }

        System.out.println("\tDELETE CONTACTS==============");
        contactManager.deleteContact(contactID3);
        List<Contact> result3 = contactManager.findContacts();
        for (Contact contact : result3) {
            System.out.println(contact);
        }

        System.out.println("\tGET CONTACTS==============");
        Contact contact = contactManager.getContact(contactID1);
        System.out.println(contact);
    }
}
