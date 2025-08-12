package com.library.service;

import com.library.repository.BookRepository;

public class BookService {

    private String publisherName;
    private BookRepository bookRepository;

    public BookService(String publisherName) {
        this.publisherName = publisherName;
    }

    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void displayBook() {
        System.out.println("Book Title: " + bookRepository);
        System.out.println("publisherName: " + publisherName);
    }
}