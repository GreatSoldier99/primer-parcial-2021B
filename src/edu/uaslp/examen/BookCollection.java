package edu.uaslp.examen;

import java.util.ArrayList;

public class BookCollection {
    private String Name;
    private ArrayList<Book> books;

    public BookCollection(String name){
        Name=name;
    }

    public String getName(){
        return Name;
    }

    public void addBook(Book book){
        books.add(book);
    }

    public ArrayList<Book> getBooks(){
        return books;
    }

    public int getStars(){
        int iCont=0, iCont2=0, iProm=0;
        for (Book book : books) {
            iCont+=book.getStars();
            iCont2++;
        }
        iProm=iCont/iCont2;
        return iProm;
    }
}
