package jcx.Database;

import jcx.Entity.Contact;

import java.util.LinkedList;
import java.util.List;

public class Database {
    private List<Contact> contacts = new LinkedList<Contact>();

    public Database() {
    }

    public Database(List<Contact> contacts) {
        this.contacts = contacts;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }


}
