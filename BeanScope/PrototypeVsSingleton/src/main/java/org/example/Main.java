package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
        School s=context.getBean("school", School.class);
        System.out.println(s.getStudent());

        //2nd instance
        School s1=context.getBean("school", School.class);
        System.out.println(s1.getStudent());


    }
}