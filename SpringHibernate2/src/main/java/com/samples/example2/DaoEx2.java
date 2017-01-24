package com.samples.example2;

import com.samples.models.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * Created by edara on 9/3/16.
 */
@Repository
public class DaoEx2 {
    Logger logger = LoggerFactory.getLogger(DaoEx2.class);
    @Autowired
    SessionFactory sessionFactory;

    Person getPerson(int ssn) {
        logger.info("getting Person by ssn");
        Session session = sessionFactory.getCurrentSession();
        Person result = session.get(Person.class, ssn);
        if(result != null){
            return result;
        }
        return null;
    }

}
