package edu.javacourse.contact;

import edu.javacourse.contact.dao.ContactDAO;
import edu.javacourse.contact.entity.Contact;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ContactSimpleDAO implements ContactDAO
{
    private final List<Contact> contacts = new ArrayList<>();

    @Override
    public Long addContact(Contact contact) {
        Long contactId = getContactId();
        contact.setContactId(contactId);
        contacts.add(contact);
        return contactId;
    }

    @Override
    public void updateContact(Contact contact) {
        Contact oldContact = getContact(contact.getContactId());
        if (oldContact != null) {
            oldContact.setFirstName(contact.getFirstName());
            oldContact.setLastName(contact.getLastName());
            oldContact.setPhoneNumber(contact.getPhoneNumber());
            oldContact.setEmail(contact.getEmail());
        }
    }

    @Override
    public void deleteContact(Long contactId) {
        for (Iterator<Contact> contactIterator = contacts.iterator(); contactIterator.hasNext(); ) {
            Contact next = contactIterator.next();
            if (next.getContactId().equals(contactId)) {
                contactIterator.remove();
            }
        }
    }

    @Override
    public Contact getContact(Long contactId) {
        for (Contact contact : contacts) {
            if (contact.getContactId().equals(contactId)) {
                return contact;
            }
        }
        return null;
    }

    @Override
    public List<Contact> findContacts() {
        return contacts;
    }

    private Long getContactId() {
        Long contactId = Math.round(Math.random() * 1000 + System.currentTimeMillis());
        while (getContact(contactId) != null) {
            contactId = Math.round(Math.random() * 1000 + System.currentTimeMillis());
        }
        return contactId;
    }
}
