package com.example.modelapp.model;

import java.util.ArrayList;
import java.util.List;
// هون الافضل انو يكون BookDa عبارة عن private package
public class BookDa implements IBookDa {
    private ArrayList<Book>books =new ArrayList<>();

    public BookDa(){
        books.add(new Book(300,"Thinking in Java",
                "Java"));
        books.add(new Book(400,"Provisional Java",
                "Java"));
        books.add(new Book(600,"Beginning c# developing",
                "C#"));
        books.add(new Book(100,"Beginning php developing",
                "php"));
        books.add(new Book(100,"Beginning database developing",
                "database"));
        books.add(new Book(200,"Beginning Python developing",
                "Python"));
    }
    public List<Book>getbooks(String cat){
        ArrayList<Book>data =new ArrayList<>();
        for(Book b:books){
            if(b.getCategory().equals(cat)){
                data.add(b);
            }
        }return data;
    }

    @Override
    public String[] getcategories() {

       String[]cats =new String[]{"Java","C#","Python","database","Datastructer"};

        return cats;
    }

}
