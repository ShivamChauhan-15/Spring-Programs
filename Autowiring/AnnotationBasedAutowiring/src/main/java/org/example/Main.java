package org.example;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AppConfig.class);
        Student s=context.getBean(Student.class);
        System.out.println(s.getAddress());
        System.out.println(s.getAddress2());
        System.out.println(s.getName());
    }
}