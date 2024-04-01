package org.example;

public class Book {
    int price;
    public void setPrice(int price){
        System.out.println("Setting price...");
        this.price=price;
    }
    //name of init and destroy method maybe different but they should match in xml file
    public void init(){
        System.out.println("Inside init method");
    }
    public void destroy(){
        System.out.println("Inside book destroy method");
    }

    @Override
    public String toString() {
        return "Book price: "+price;
    }
}
