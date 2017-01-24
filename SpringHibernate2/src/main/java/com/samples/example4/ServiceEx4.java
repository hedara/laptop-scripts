package com.samples.example4;

import com.samples.models.bidirectional.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Set;

/**
 * Created by edara on 9/5/16.
 */

    @Service
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public class ServiceEx4 {
        @Autowired
        DaoEx4 dao;

        public void addPerson(Person person) {
            dao.insertRow(person);
        }
        public Person getPersonContact(int ssn){
            return dao.searchPerson(ssn);
        }
        public void updatePerson(Person person) {
            dao.update(person);
        }
        public void removePhoneRecords(int ssn, Set<Integer> phone_nos){
            dao.removePhones(ssn,phone_nos);
        }
        public void removePerson(int ssn) {dao.removePerson(ssn);}
    }


