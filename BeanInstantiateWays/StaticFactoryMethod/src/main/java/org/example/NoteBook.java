package org.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;


public class NoteBook {
    public NoteBook(){
        System.out.println("Notebook Constructor");
    }
    @Value("Java")
    private String name;
    public String getName(){
        return name;
    }
}
