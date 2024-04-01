package example;

public class Book {
    private Book(){
        System.out.println("Book Constructor");
    }
    //Instance method
    public NoteBook createInstance(){
        return new NoteBook();
    }
}
