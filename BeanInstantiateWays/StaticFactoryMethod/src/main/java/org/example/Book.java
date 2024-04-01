package org.example;

import org.springframework.beans.factory.annotation.Value;

public class Book {

    private Book(){}
    public static NoteBook createInstance(){
        return new NoteBook();
    }

}
