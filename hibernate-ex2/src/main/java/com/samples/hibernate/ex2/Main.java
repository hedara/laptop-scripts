package com.samples.hibernate.ex2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Created by edara on 8/15/16.
 */
public class Main {
    static SessionFactory sessionFactory;
    public static void main(String[] args) {
        sessionFactory = new Configuration().configure().buildSessionFactory();
        Employee emp = getEmployee();
        saveEmployee(emp);
        System.out.println("done");
    }

    public static Employee getEmployee() {
        Employee emp = new Employee();
        emp.setName("Laks");
        Address adr = new Address();
        adr.setSt("123 Main st");
        adr.setCity("Tampa");
        adr.setZip("12345");
        emp.setAddress(adr);
        return emp;
    }
    public static void saveEmployee(Employee emp) {
        Session session = sessionFactory.openSession();
        Transaction trans = session.beginTransaction();
        try {
            session.save(emp);
            trans.commit();
        }catch(Exception ex) {

        }finally {
            session.close();
            sessionFactory.close();
        }


    }
}
