package com.gfg.library1.controller;


import com.gfg.library1.service.ReviewService;
import com.gfg.library1.service.resource.ReviewRequest;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/review")
public class ReviewController {

    @Autowired
    ReviewService reviewService;

    @PostMapping("/add")
    public ResponseEntity<?> addReview(@RequestBody @Valid ReviewRequest reviewRequest){
        reviewService.addReview (reviewRequest.getReview());
        return new ResponseEntity<>(reviewRequest.getReview(), HttpStatus.CREATED);
    }
}
