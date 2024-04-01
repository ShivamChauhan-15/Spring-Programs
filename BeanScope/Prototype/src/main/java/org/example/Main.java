package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
        Book b1=context.getBean("book",Book.class);
        System.out.println(b1.getName());
        System.out.println(b1.getAuthorName());
        System.out.println(b1.hashCode());
        Book b2=context.getBean("book", Book.class);
        System.out.println(b2.hashCode());
    }
}