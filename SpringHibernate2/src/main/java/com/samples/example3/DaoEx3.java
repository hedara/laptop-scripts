package com.samples.example3;

import com.samples.models.Person;
import com.samples.models.Phone;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Set;

/**
 * Created by edara on 9/3/16.
 */
@Component
public class DaoEx3 {
    @Autowired
    SessionFactory sessionFactory;

    void insertRow(Person person) {
        Session session= null;
        try {
            session = sessionFactory.getCurrentSession();
            session.save(person);
            session.flush();
        }catch(Exception ex) {
            System.out.println(ex);
            session.close();
        }
    }
    Person searchPerson(int ssn){
        Session session= null;
        try{
            session = sessionFactory.getCurrentSession();
            Person person = session.get(Person.class,ssn);
            return person;
        }catch(Exception ex) {
            System.out.println(ex);
            session.close();
        }
        return null;
    }

    void update(Person person) {
        Session session = null;
        try {
            session = sessionFactory.getCurrentSession();
            session.saveOrUpdate(person);

        }catch(Exception ex){
            System.out.println(ex);
            session.close();
        }
    }

    void removePhones(int ssn,Set<Integer> phone_nos) {
        Session session = null;
        try {
            session = sessionFactory.getCurrentSession();
            Person person = session.get(Person.class,ssn);
            Set<Phone> phones = person.getPhones();
            for(Integer phone_no :phone_nos){
                Phone phone = new Phone(phone_no,"");
                if(phones.contains(phone)){
                    phones.remove(phone);
                }
            }
        }catch(Exception ex) {
            System.out.println(ex);
            session.close();
        }
    }
    void removePerson(int ssn) {
        Session session = null;
        try{
            session = sessionFactory.getCurrentSession();
            session.remove(new Person(ssn,"",""));
        }catch(Exception ex) {
            System.out.println(ex);
            session.close();
        }
    }

}
