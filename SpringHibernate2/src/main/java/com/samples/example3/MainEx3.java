package com.samples.example3;

import com.samples.example2.AppConfig;
import com.samples.models.Person;
import com.samples.models.Phone;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Created by edara on 9/3/16.
 */
public class MainEx3 {
    static Logger logger = LoggerFactory.getLogger(MainEx3.class);
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig3.class);
        ServiceEx3 service = (ServiceEx3) context.getBean("serviceEx3");
        // Add person and get person .
        service.addPerson(getSample());
        logger.info("*********************************************");
        //Person person = service.getPersonContact(111);
        //logger.info(person.toString());
        // delete phones
        System.out.println(" phone delete #############################################");
        Integer[] remove_ph_nos = {123};
        service.removePhoneRecords(111, new HashSet<Integer>(Arrays.asList(remove_ph_nos)));
        // delete person. check for phones
        //service.removePerson(111);


    }

    public static Person getSample() {
        Person person = new Person(111, "Hareen", "Edara");
        Phone ph1 = new Phone(1234, "Home");
        Phone ph2 = new Phone(1122, "Cell");
        person.getPhones().add(ph1);
        person.getPhones().add(ph2);
        person.getPhones().add(getOfficePhone());
        return person;
    }
    public static Phone getOfficePhone(){
        Phone ph = new Phone(123,"Office");
        return ph;
    }

    public static Person getSample2() {
        Person person = new Person(222,"Lakshmi", "chalasani");
        Phone ph1 = new Phone(1133,"Cell");
        person.getPhones().add(ph1);
        return person;
    }
}
