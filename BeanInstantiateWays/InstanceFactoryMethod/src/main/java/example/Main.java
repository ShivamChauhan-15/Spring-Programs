package example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
        NoteBook n=context.getBean("notebook", NoteBook.class);
        System.out.println(n.getName());
    }
}