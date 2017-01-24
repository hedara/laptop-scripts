package com.samples.example3;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.io.IOException;
import java.util.Properties;

/**
 * Created by edara on 9/3/16.
 */
@Configuration
@ComponentScan(basePackages = {"com.samples.example3"})
@EnableTransactionManagement
@PropertySource(value = {"classpath:app.properties"})
@Import({com.samples.example2.AppConfig.class})
public class AppConfig3 {
    @Autowired
    Environment env;


}
