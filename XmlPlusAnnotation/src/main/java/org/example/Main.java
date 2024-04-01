package org.example;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("autoConfig.xml");
        Student s=context.getBean("student", Student.class);
        System.out.println(s.getAddress());
        System.out.println(s.getAddress2());
        System.out.println(s.getName());
    }
}