package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {
    @Autowired
    private School school;
    public Student(School school){
        this.school=school;
    }
    public void setStudent(School school){
        this.school=school;
    }
    public void print(){
        System.out.println("Student Print Method");
    }
}
