package com.samples.example1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static spark.Spark.*;

/**
 * Created by edara on 9/28/16.
 */
public class Sample1 {
    static Logger logger = LoggerFactory.getLogger("Sample1.class");
    public static void main(String[] args) throws InterruptedException {
        port(8080);
        get("/sample1", (req,resp) -> "Hello World");
        get("/sample2/:name", (req,resp)-> {return "Hello "+req.params(":name");});
        get("/sample3",(req,resp) -> {return getEmployee();},new JsonTransformer());

        Thread.sleep(50000);

        stop();
        logger.info("Server stopped");
    }
    public static Employee getEmployee() {
        return new Employee("Hareen", "Edara", "Systems");
    }

}
