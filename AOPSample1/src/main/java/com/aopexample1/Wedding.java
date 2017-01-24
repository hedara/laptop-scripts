package com.aopexample1;

import org.springframework.stereotype.Component;

/**
 * Created by edara on 9/29/16.
 */
@Component
public class Wedding implements Function {

    public void perform(String hostname) {
        System.out.println("Wedding function ongoing");
    }
}
