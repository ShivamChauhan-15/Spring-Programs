package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        AbstractApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
        context.registerShutdownHook();
        Book b=context.getBean("book", Book.class);
        NoteBook n=context.getBean("notebook", NoteBook.class);
        System.out.println("printing book details");
        System.out.println(b);
        System.out.println("printing notebook details");
        System.out.println(n);
    }
}