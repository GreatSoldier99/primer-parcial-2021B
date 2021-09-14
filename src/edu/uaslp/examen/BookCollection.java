package edu.uaslp.examen;

import java.util.ArrayList;
import java.util.List;

public class BookCollection {
    private String Name;
    private List<Book> books;

    public BookCollection(String name){
        Name=name;
        books=new ArrayList<>();
    }

    public String getName(){
        return Name;
    }

    public void addBook(Book book){
        books.add(book);
    }

    public List<Book> getBooks(){
        return books;
    }

    public int getStars(){
        int iProm=0;

        for(Book book: books)
            iProm+=book.getStars();
        return iProm/books.size();
    }
}
