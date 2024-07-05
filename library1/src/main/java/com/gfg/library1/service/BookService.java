package com.gfg.library1.service;

import com.gfg.library1.domain.Book;
import com.gfg.library1.domain.Review;

import java.util.List;

public interface BookService {
    public void addBook(Book book);
    public List<Book> getAllBooks();
    public Book getBook(Integer id);
    public void deleteBook(Integer id);
    public Book updateBook(Integer id, Book book);
    public void addReview(Integer bookId, Review review);
}
