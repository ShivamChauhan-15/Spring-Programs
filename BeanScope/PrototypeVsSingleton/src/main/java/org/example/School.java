package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
public class School {
    @Autowired
    private Student student; //prototype
    public School(){
        System.out.println("School Constructor...");
    }
    public void setStudent(Student student){
        this.student=student;
    }
    @Lookup   //2nd way to make proxy
    Student createStudentObject(){   //we can also make this method abstract then also it work as usual
        return null;
    }
    //Behind the scene(null above) CGLib do  (Spring will create a subclass(cglib proxy)for school,it will override and implement the method createStudentObject()
//    Student createStudentObject(){
//        return context.getBean("student",Student.class);
//    }
    public Student getStudent(){
        return student;
    }
//    public Student getStudent(){
//        return createStudentObject();
//    }

}
