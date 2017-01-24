package com.samples.example2;

import com.samples.models.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by edara on 9/3/16.
 */
@Service
@Transactional(propagation = Propagation.REQUIRES_NEW)
class ServiceEx2 {
    Logger logger = LoggerFactory.getLogger(ServiceEx2.class);
    @Autowired
    DaoEx2 dao;

    public void lookupPerson(int ssn) {
        logger.info("calling getPerson on DAO");
        logger.info(dao.getPerson(ssn).toString());
    }

}
