package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.awt.print.Book;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
        NoteBook n=context.getBean("book", NoteBook.class);
        NoteBook n1=context.getBean("book", NoteBook.class);
        System.out.println(n);
        System.out.println(n1);
        System.out.println(n.getName());


    }
}