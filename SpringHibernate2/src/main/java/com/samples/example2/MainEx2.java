package com.samples.example2;

import com.samples.example2.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by edara on 9/3/16.
 */
public class MainEx2 {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        ServiceEx2 service = (ServiceEx2) context.getBean("serviceEx2");
        service.lookupPerson(2);
        System.out.println("Done");
    }
}
