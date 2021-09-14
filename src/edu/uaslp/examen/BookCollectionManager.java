package edu.uaslp.examen;

import java.util.ArrayList;
import java.util.List;

public class BookCollectionManager {
    private List<BookCollection> collections=new ArrayList<>();

    public BookCollection createCollection(String name){
        BookCollection bookC=new BookCollection(name);
        collections.add(bookC);
        return bookC;
    }

    public BookCollection getCollectionByName(String name) {
        for (BookCollection bookC : collections) {
            if (bookC.getName().equals(name)) {
                return bookC;
            }
        }
        return null;
    }

    public void deleteCollectionByName(String name){
        collections.removeIf(collection -> collection.getName().equals(name));
    }

    public void addBookToCollection(String collectionName, Book book){
        BookCollection bookC=getCollectionByName(collectionName);
        if(bookC==null)
            bookC=createCollection(collectionName);
        bookC.addBook(book);
    }

    public List<String> getCollectionNames(){
        List<String> collectionNames=new ArrayList<>();

        for (BookCollection collection : collections) {
            collectionNames.add(collection.getName());
        }
        return collectionNames;
    }
}
