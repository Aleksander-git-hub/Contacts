package edu.javacourse.contact.dao;

import edu.javacourse.contact.entity.Contact;

import java.util.List;

public interface ContactDAO
{
    // добавляем контакт и возвращаем ID
    Long addContact(Contact contact);
    // редактирование контакта
    void updateContact(Contact contact);
    // удаление контакта по его ID
    void deleteContact(Long contactId);
    // получение контакта по его ID
    Contact getContact(Long contactId);
    // получение списка контактов
    List<Contact> findContacts();
}
