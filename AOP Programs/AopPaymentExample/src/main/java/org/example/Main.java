package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        PaymentImplementClass p=context.getBean("payment",PaymentImplementClass.class);
        p.makePayment(2000);
    }
}