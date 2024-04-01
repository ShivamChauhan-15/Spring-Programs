package org.example;

public class Student {
    private Address address;
    private String name;
    public Student(){}
    public Student(String name,Address address){
        this.address=address;
        this.name=name;
        System.out.println("Inside Student Constructor Name:"+name);
    }
    public void setAddress(Address address){
        this.address=address;
    }
    public Address getAddress(){
        return address;
    }

}
