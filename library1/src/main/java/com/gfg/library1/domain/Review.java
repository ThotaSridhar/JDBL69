package com.gfg.library1.domain;


import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.IdGeneratorType;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name="reviews")
@Entity
public class Review {
    @Id
    @Column(name="id",nullable = false)
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;
    private String comment;
    private Double rating;

    @ManyToOne
    @JoinColumn(name="book_id")
    private Book book;

}
