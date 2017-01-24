package com.samples.cxfservice1;

import org.apache.cxf.bus.spring.SpringBus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.xml.ws.Endpoint;

/**
 * Created by edara on 10/7/16.
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.samples.cxfservice1")
public class AppConfig {
    @Bean
    public SpringBus cxf() {
        return new SpringBus();
    }
    @Bean
    public Endpoint endpoint() {
        EndpointImpl endpoint = new EndpointImpl(cxf(), new EmployeeServiceImpl());
        endpoint.publish("/employee");
        return endpoint;
    }

}
