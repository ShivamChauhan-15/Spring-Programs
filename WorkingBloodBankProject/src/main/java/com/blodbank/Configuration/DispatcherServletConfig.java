package com.blodbank.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackages = "com.blodbank")
public class DispatcherServletConfig {
    @Bean
    public InternalResourceViewResolver view(){
        System.out.println("configure view");
        InternalResourceViewResolver vr=new InternalResourceViewResolver();
        vr.setPrefix("/WEB-INF/views/");
        vr.setSuffix(".jsp");
        return vr;
    }

    @Bean
    public DataSource dataSource() {
        System.out.println("return dataSource bean");
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.h2.Driver");
        dataSource.setUrl("jdbc:h2:tcp://localhost/~/test");
        dataSource.setUsername("Shivam");
        dataSource.setPassword("1234");
        return dataSource;
    }
}
