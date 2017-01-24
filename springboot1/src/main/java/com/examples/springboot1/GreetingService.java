package com.examples.springboot1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

/**
 * Created by edara on 7/18/16.
 */
@RestController
@RequestMapping(value="/greetings")
public class GreetingService {

    List<Greeting> greetings = Arrays.asList(new Greeting[]{
            new Greeting(1, "Good Morning"),
            new Greeting(2, "Good Afternoon"),
            new Greeting(3, "Good Evening"),
            new Greeting(4, "Good Night")
    });

    @RequestMapping(method= RequestMethod.GET)
    public Greeting sayGreetings(@RequestParam(value="id") int id) {
        return greetings.get(0);
    }
}
