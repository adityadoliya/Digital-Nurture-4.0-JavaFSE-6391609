package com.library.repository;

public class BookRepository {

    public String bookTitle;

    public void setBookTitle(String bookTitle){
        this.bookTitle=bookTitle;
    }

    @Override
    public String toString() {
        return bookTitle;
    }
}
