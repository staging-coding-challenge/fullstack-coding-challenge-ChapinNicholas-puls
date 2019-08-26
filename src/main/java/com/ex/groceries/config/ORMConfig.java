package com.ex.groceries.config;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.Properties;

@Configuration
@EnableTransactionManagement
public class ORMConfig {

    @Value("${connection.driver_class}")
    String driverClassName;

    @Value("${connection.username}")
    String username;

    @Value("${connection.password}")
    String password;

    @Value("${connection.url}")
    String url;
    //@Bean applies to a method and the method
    //is used to create instances of configured
    //objects
    @Bean
    public DataSource dataSource() {
        BasicDataSource ds = new BasicDataSource();
        System.out.println("Using jdbc driver " + driverClassName);
        ds.setDriverClassName(driverClassName);

        System.out.println("Connecting to url " + url);
        ds.setUrl(url);

        System.out.println("As user " + username);
        ds.setUsername(username);
        ds.setPassword(password);

        return ds;
    }

    @Bean
    public LocalSessionFactoryBean sessionFactoryBean(DataSource ds) {
        LocalSessionFactoryBean sfBean = new LocalSessionFactoryBean();
        sfBean.setDataSource(ds);
        sfBean.setPackagesToScan("com.ex.fcn.models");
        sfBean.setHibernateProperties(getSfProps());
        return sfBean;
    }

    @Bean
    HibernateTransactionManager transactionManager(SessionFactory sf) {
        HibernateTransactionManager manager = new HibernateTransactionManager();
        manager.setSessionFactory(sf);

        return manager;
    }

    private Properties getSfProps() {
        Properties props = new Properties();
        props.setProperty("hibernate.dialect", "org.hibernate.dialect.PostgreSQLDialect");
        props.setProperty("hibernate.show_sql", "true");
        props.setProperty("hibernate.format_sql", "true");
        props.setProperty("hibernate.hbm2ddl.auto", "update");

        return props;
    }
}
