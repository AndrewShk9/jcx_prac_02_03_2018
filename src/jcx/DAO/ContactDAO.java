package jcx.DAO;

import jcx.Database.Database;
import jcx.Entity.Contact;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class ContactDAO {
    private Database database = new Database();

    public void save(Contact contact)
    {
        database.getContacts().add(contact);
    }

    public void delete(int id)
    {
        List<Contact> contacts = database.getContacts();
        Iterator<Contact> iterator = contacts.iterator();

        while (iterator.hasNext())
        {
            Contact currentContact = iterator.next();
            if(currentContact.getId() == id)
                iterator.remove();
        }
    }

    public Contact findOne(int id)
    {
        Contact contact = null;
        List<Contact> contacts = database.getContacts();
        Iterator<Contact> iterator = contacts.iterator();

        while (iterator.hasNext())
        {
            Contact currentContact = iterator.next();
            if(currentContact.getId() == id)
                contact = currentContact;
        }

        return contact;

    }

    public List<Contact> findAll()
    {
        return database.getContacts();
    }




}
