package com.library.repository;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository
public class BookRepository {
    @Value("Importance of Autowiring by Aditya Doliya 6391609")
    public String bookTitle;

    public void setBookTitle(String bookTitle){
        this.bookTitle=bookTitle;
    }

    @Override
    public String toString() {
        return bookTitle;
    }
}
