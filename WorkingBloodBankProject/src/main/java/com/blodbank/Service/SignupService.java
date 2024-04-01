package com.blodbank.Service;

import com.blodbank.Repository.DataBaseInitializer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Service
public class SignupService {
    @Autowired
    public DataBaseInitializer dataBaseInitializer;
    public void setUp(String username,String name,LocalDate dob,String role,String password) throws SQLException {
//        dataBaseInitializer.createTable();
        dataBaseInitializer.insert(username,name,dob,role,password);
        dataBaseInitializer.print();

    }
}
