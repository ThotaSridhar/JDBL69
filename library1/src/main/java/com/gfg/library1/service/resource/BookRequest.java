package com.gfg.library1.service.resource;

import com.gfg.library1.domain.Book;
import com.gfg.library1.domain.Genre;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BookRequest {

    @NotBlank(message = "Title shouldn't be blank")
    private String title;
    @NotBlank(message = "Author should not be blank")
    private String author;
    private String genre;
    @Min(value = 0, message = "The cost should be minimum of 0")
    private Double cost;
    @Min(value = 1000, message = "The year should be minimum of 1000")
    private Integer year;


    public Book getBook(){
        return Book.builder().title(this.title).author(this.author).rating(0.0)
                .genre(Genre.valueOf(this.genre)).cost(this.cost)
                .year(this.year).build();
    }
}
