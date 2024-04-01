package org.example;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Main {
    public static void main(String[] args) {
        //Using xml
//        Using BeanFactory
//        Resource resource=new ClassPathResource("BeanConfig.xml");
//        BeanFactory container=new XmlBeanFactory(resource);
//        Student student1= (Student) container.getBean(("student1"));

        //Using ApplicationContext
        ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
        Student s=(Student) context.getBean("student");
        System.out.println(s);
        s.print();
    }
}