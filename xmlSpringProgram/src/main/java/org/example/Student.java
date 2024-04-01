package org.example;

public class Student {
    String name;
    int roll;
//    Student(){
//        System.out.println("No-arg Constructor");
//    }
    public int getRoll() {
        return roll;
    }
    public String getName(){
        return name;
    }
//    public Student(int roll,String name){
//        this.roll=roll;
//        this.name=name;
//    }
    public void setName(String name) {
        this.name = name;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }
    public void print(){
        System.out.println("Hello World");
    }
    @Override
    public String toString() {
        return "Roll No: "+roll+" Name: "+name;
    }
}
