package com.gfg.library1.controller;

import com.gfg.library1.domain.Book;
import com.gfg.library1.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class UserController {
    @Autowired
    BookService bookService;


    @GetMapping("/book")
    public ResponseEntity<List<Book>> getAllBook(){
        List<Book> books = bookService.getAllBooks();
        return new ResponseEntity<>(books, HttpStatus.OK);
    }
    @GetMapping("/book/{id}")
    public ResponseEntity<Book> getBook(@PathVariable("id") String id){
        Book book = bookService.getBook(Integer.valueOf(id));
        System.out.println(book.toString());
        return new ResponseEntity<>(book,HttpStatus.OK);
    }
}
