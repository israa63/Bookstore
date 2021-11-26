package com.example.modelapp.model;

public class Book {
    private int pages;
    private String titel;
    private  String category;

 public   Book(int pages,String titel,String category){
    this.pages=pages;
    this.titel=titel;
    this.category=category;
}

    public int getPages() {
        return pages;
    }

    public String getCategory() {
        return category;
    }

    public String getTitel() {
        return titel;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }
}

