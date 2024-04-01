package org.example;

public class Author {
    public String authorName;
    public Author(){
        System.out.println("Author Constructor");
    }
    public void setAuthorName(String authorName){
        this.authorName=authorName;
    }
    public String getAuthorName(){
        return authorName;
    }

}
