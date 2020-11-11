package edu.javacourse.contact.dao;

import edu.javacourse.contact.ContactSimpleDAO;

public class ContactDAOFactory
{
    public static ContactDAO getContactDAO() {
        return new ContactSimpleDAO();
    }
}
