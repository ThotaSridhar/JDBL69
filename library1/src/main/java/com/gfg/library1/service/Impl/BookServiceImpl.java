package com.gfg.library1.service.Impl;

import com.gfg.library1.domain.Book;
import com.gfg.library1.domain.Review;
import com.gfg.library1.repository.BookRepository;
import com.gfg.library1.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    BookRepository bookRepository;

    @Override
    public void addBook(Book book) {
        bookRepository.save(book);
    }

    @Override
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public Book getBook(Integer id) {
        return bookRepository.findById(id).orElse(null);
    }

    @Override
    public void deleteBook(Integer id) {
        bookRepository.deleteById(id);

    }

    @Override
    public Book updateBook(Integer id, Book book) {
        Optional<Book> originalBook = bookRepository.findById(id);
        if(originalBook.isPresent()){
            bookRepository.save(book);
        }
        return book;
    }

    @Override
    public void addReview(Integer bookId, Review review) {

    }


}
