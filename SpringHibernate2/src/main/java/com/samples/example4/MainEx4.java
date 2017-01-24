package com.samples.example4;

import com.samples.example3.MainEx3;
import com.samples.example3.ServiceEx3;
import com.samples.models.bidirectional.Person;
import com.samples.models.bidirectional.Phone;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;
import java.util.HashSet;

/**
 * Created by edara on 9/4/16.
 */
public class MainEx4 {
    static Logger logger = LoggerFactory.getLogger(MainEx4.class);
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig4.class);
        ServiceEx4 service = (ServiceEx4) context.getBean("serviceEx4");
        // Add person and get person .
        service.addPerson(getSample());
        logger.info("*********************************************");
        Person person = service.getPersonContact(111);
        logger.info(person.toString());
        // delete phones
        System.out.println(" phone delete #############################################");
        Integer[] remove_ph_nos = {123};
        service.removePhoneRecords(111, new HashSet<Integer>(Arrays.asList(remove_ph_nos)));
        // delete person. check for phones
        service.removePerson(111);

    }

    public static Person getSample() {
        Person person = new Person(111, "Hareen", "Edara");
        Phone ph1 = new Phone(1234, "Home");
        Phone ph2 = new Phone(1122, "Cell");
        person.addPhone(ph1);
        person.addPhone(ph2);
        person.addPhone(getOfficePhone());
        //person.getPhones().add(ph1);
        //person.getPhones().add(ph2);
        person.addPhone(getOfficePhone());
        return person;
    }
    public static Phone getOfficePhone(){
        Phone ph = new Phone(123,"Office");
        return ph;
    }
}
