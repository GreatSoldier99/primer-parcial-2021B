package edu.uaslp.examen;

import java.util.ArrayList;

public class BookCollectionManager {
    private ArrayList<BookCollection> collections;

    public BookCollection createCollection(String name){
        BookCollection bookC=new BookCollection(name);
        return bookC;
    }

    public BookCollection getCollectionByName(String name) {
        boolean Band = false;
        for (BookCollection collection : collections) {
            if (collection.getName().equals(name)) {
                return collection;
                Band = true;
            }
        }
        if (Band == false)
            return null;
    }

    public void deleteCollectionByName(String name){
        collections.removeIf(collection -> collection.getName().equals(name));
    }

    public void addBookToCollection(String collectionName, Book book){
        boolean Band=false;
        BookCollection collectionNew;
        for (BookCollection collection : collections) {
            if (collection.getName().equals(collectionName)) {
                collection.addBook(book);
                Band = true;
            }
        }
        if(Band==false)
            collectionNew=createCollection(collectionName);
    }

    public ArrayList<String> getCollectionNames(){

    }
}
