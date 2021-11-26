package com.example.modelapp.model;

public class BookFacory {
    public IBookDa getModel(){
        return new BookDa();
    }

}


