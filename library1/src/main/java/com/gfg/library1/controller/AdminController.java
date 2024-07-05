package com.gfg.library1.controller;


import com.gfg.library1.domain.Book;
import com.gfg.library1.service.BookService;
import com.gfg.library1.service.resource.BookRequest;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class AdminController {

    @Autowired
    BookService bookService;

    @PostMapping("/book/create")
    public ResponseEntity<Book> createBook(@RequestBody @Valid BookRequest bookRequest){
        Book book = bookRequest.getBook();
        bookService.addBook(book);
        return new ResponseEntity<>( HttpStatus.CREATED);
    }

    @DeleteMapping("book/{id}")
    public ResponseEntity<Book> deleteBook(@PathVariable("id") String id){
        bookService.deleteBook(Integer.valueOf(id));
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
