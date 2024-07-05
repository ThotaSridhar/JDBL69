package com.gfg.library1.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="books")
@Entity
@Builder
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String title;
    private String author;
    @Enumerated(value =EnumType.STRING)
    private Genre genre;
    private Double rating;
    private Double cost;
    private int year;
    @OneToMany(mappedBy = "book")
    @JsonIgnoreProperties("book")
    private List<Review> reviewList;


}