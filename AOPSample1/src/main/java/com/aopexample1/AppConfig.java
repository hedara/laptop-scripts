package com.aopexample1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by edara on 9/29/16.
 */
@EnableAspectJAutoProxy
@Configuration
@ComponentScan
public class AppConfig {
    @Bean
    public FunctionHallManager functionHallManager() {
        return new FunctionHallManager();
    }
}
