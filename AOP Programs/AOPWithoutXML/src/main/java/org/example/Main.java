package org.example;

import Config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        PaymentImplementClass p=context.getBean(PaymentImplementClass.class);
        p.makePayment(2000);
    }
}