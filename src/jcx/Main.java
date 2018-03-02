package jcx;

import jcx.DAO.ContactDAO;
import jcx.Entity.Company;
import jcx.Entity.Contact;
import jcx.Entity.Department;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        ContactDAO contactDAO = new ContactDAO();
        contactDAO.save(new Contact(1,"Vasya", Company.Apple, "Pech", "pech@t.com", 33, Department.Factory));
        contactDAO.save(new Contact(2,"Kolya", Company.Microsoft, "Grig", "grig@t.com", 44, Department.Support));
        contactDAO.save(new Contact(3,"Misha", Company.Intel, "Ros", "ros@t.com", 55, Department.Support));
        contactDAO.save(new Contact(4,"Maks", Company.Intel, "Hoh", "hoh@t.com", 66, Department.Tech));
        contactDAO.save(new Contact(5,"Nick", Company.Apple, "Kim", "kim@t.com", 56, Department.Factory));
        contactDAO.save(new Contact(6,"Ben", Company.Apple, "Htb", "htb@t.com", 50, Department.Factory));
        contactDAO.save(new Contact(7,"Gosha", Company.Microsoft, "Fen", "fen@t.com", 11, Department.Support));
        contactDAO.save(new Contact(8,"Hmara", Company.Apple, "Jen", "jen@t.com", 87, Department.Support));
        contactDAO.save(new Contact(9,"Rick", Company.Intel, "Yem", "yem@t.com", 77, Department.Tech));
        contactDAO.save(new Contact(9,"Rick", Company.Intel, "Yem", "yem@t.com", 77, Department.Tech));

        Stream<Contact> stream = contactDAO.findAll().stream();

        List<Contact> contacts = stream
                    .distinct()
                    //.filter(contact -> contact.getDepartment() == Department.Support)
                    //.sorted(Comparator.comparing(Contact::getEmail))
                    .sorted(Comparator.comparing(Contact::getCompany))
                    .collect(Collectors.toList());

        contacts.forEach(System.out::println);




    }
}
