package com.gfg.library1.service.Impl;

import com.gfg.library1.domain.Book;
import com.gfg.library1.domain.Review;
import com.gfg.library1.repository.BookRepository;
import com.gfg.library1.repository.ReviewRepository;
import com.gfg.library1.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ReviewServiceImpl implements ReviewService {

    @Autowired
    ReviewRepository reviewRepository;

    @Autowired
    BookRepository bookRepository;

    @Override
    public void addReview(Review review) {
//        Optional<Book> book  = bookRepository.findById(review.getBook().getId());
//        if(book.isEmpty()){
//            throw new IllegalArgumentException("Book doesn't exist ");
//        }
//        review.setBook(book.get());
        reviewRepository.save(review);
    }
}
