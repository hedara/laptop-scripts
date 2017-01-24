package com.aopexample1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by edara on 9/29/16.
 */
public class Main1 {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Function function = (Function) context.getBean("wedding");
        function.perform("Edara");
        System.out.println("Done");
    }
}
