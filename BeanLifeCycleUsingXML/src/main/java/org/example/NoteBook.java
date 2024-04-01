package org.example;

public class NoteBook {
    int price;
    public void setPrice(int price){
        System.out.println("Setting price...");
        this.price=price;
    }
    //name of init and destroy method maybe different but they should match in xml file
    public void hey(){
        System.out.println("Inside init method");
    }
    public void bye(){
        System.out.println("Inside notebook destroy method");
    }

    @Override
    public String toString() {
        return "Book price: "+price;
    }
}
