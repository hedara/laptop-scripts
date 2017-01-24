package com.aopexample1;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by edara on 9/29/16.
 */
@Aspect
public class FunctionHallManager {
    Logger logger = LoggerFactory.getLogger(FunctionHallManager.class);

    @Pointcut("execution(* com.aopexample1.Function.perform(String))" +
        "&& args(hostname)")
    public void pointcut1(String hostname){}

    @Before("pointcut1(hostname)")
    public void setupTablesnChairs(String hostname) {
        logger.info("Setup tables and chairs as per host "+ hostname+" specs");
    }
    @After("pointcut1(hostname)")
    public void cleanUp(String hostname) {
        logger.info("Clean floor, walls and cieling");
    }
    @After("pointcut1(hostname)")
    public void removeTablesnChairs(String hostname) {
        logger.info("Remove tables and chairs to storage");
    }

}
