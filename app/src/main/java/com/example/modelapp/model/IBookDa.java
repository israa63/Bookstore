package com.example.modelapp.model;

import java.util.ArrayList;
import java.util.List;

public interface IBookDa {

    List<Book>getbooks(String cat);
    String [] getcategories();
}
