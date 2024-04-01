package org.example;

import org.springframework.context.annotation.Scope;

public class Book {
    private String name;
    private Author author;
    public void setName(String name){
        this.name=name;
    }
    public Book(){
        System.out.println("Book Constructor");
    }
    public void setAuthor(Author author){
        System.out.println("Setting author");
        this.author=author;
    }
    public String getName(){
        return name;
    }
    public String getAuthorName(){
        return author.getAuthorName();
    }


}
