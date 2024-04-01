package example;

import org.springframework.beans.factory.annotation.Value;

public class NoteBook {
    public NoteBook(){
        System.out.println("Notebook Constructor");
    }
    @Value("Java")
    private String name;
    public String getName(){
        return name;
    }

}
