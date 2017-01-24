package com.samples.hibernate.ex3;

import com.samples.hibernate.ex2.Employee;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

/**
 * Created by edara on 8/20/16.
 */
public class MainEx3 {
    public static SessionFactory sessionFactory;
    public static Logger logger = LoggerFactory.getLogger(MainEx3.class);
    public static void main(String[] args) {
        sessionFactory = new Configuration().configure().buildSessionFactory();
        for(EmployeeExt temp:getEmployees ()){
            logger.info(temp.toString());
        }
    }
    public static List<EmployeeExt> getEmployees() {
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        List<EmployeeExt> results= null;
        try {
            Criteria cr = session.createCriteria(EmployeeExt.class);
            results = cr.list();
            tx.commit();
            return results;
        }catch(Exception ex) {
            logger.info(String.valueOf(ex));
            if(tx != null)
                tx.rollback();
        }finally{
            session.close();
            sessionFactory.close();
        }

        return results;
    }
}
