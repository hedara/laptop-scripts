package com.samples.example4;

import com.samples.example2.AppConfig;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.io.IOException;

/**
 * Created by edara on 9/4/16.
 */
@Import({com.samples.example2.AppConfig.class})
@ComponentScan(basePackages = {"com.samples.example4"})
@EnableTransactionManagement
public class AppConfig4 {
    @Autowired
    AppConfig appConfig;

    @Bean
    SessionFactory sessionFactory() throws IOException {
        LocalSessionFactoryBean sessionFactoryBean = new LocalSessionFactoryBean();
        sessionFactoryBean.setDataSource(appConfig.dataSource());
        sessionFactoryBean.setHibernateProperties(appConfig.hibernateProperties());
        sessionFactoryBean.setPackagesToScan("com.samples.models.bidirectional");
        sessionFactoryBean.afterPropertiesSet();
        return (SessionFactory) sessionFactoryBean.getObject();
    }

}
