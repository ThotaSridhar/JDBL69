package com.gfg.library1.service.resource;


import com.gfg.library1.domain.Book;
import com.gfg.library1.domain.Review;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class ReviewRequest {

    @NotBlank(message = "comment cant be blank")
    private String comment;
    @Min(value = 0, message = "rating cannot be less than zero")
    @Max(value=5,message = "rating cannot be greater than 5")

    private Double rating;
    @Min(value=0,message = "bookId cannot be less than 0")
    private Integer bookId;

    public Review getReview(){
        return Review.builder().comment(this.comment).rating(this.rating).
                book(Book.builder().id(this.bookId).build()).build();

    }
}


