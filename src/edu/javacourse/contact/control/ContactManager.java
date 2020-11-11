package edu.javacourse.contact.control;

import edu.javacourse.contact.dao.ContactDAO;
import edu.javacourse.contact.dao.ContactDAOFactory;
import edu.javacourse.contact.entity.Contact;

import java.util.List;

public class ContactManager
{
    private ContactDAO dao;

    public ContactManager() {
        dao = ContactDAOFactory.getContactDAO();
    }

    // Добавление контакта - возвращает ID добавленного контакта
    public Long addContact(Contact contact) {
        return dao.addContact(contact);
    }

    // Редактирование контакта
    public void updateContact(Contact contact) {
        dao.updateContact(contact);
    }

    // Удаление по ID
    public void deleteContact(Long contactId) {
        dao.deleteContact(contactId);
    }

    // Получение одного контакта
    public Contact getContact(Long contactId) {
        return dao.getContact(contactId);
    }

    // Получение списка контактов
    public List<Contact> findContacts() {
        return dao.findContacts();
    }
}
