package com.gfg.library1;

import com.gfg.library1.domain.Book;
import com.gfg.library1.domain.Genre;
import com.gfg.library1.domain.Review;
import com.gfg.library1.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.redis.core.RedisTemplate;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Library1Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Library1Application.class, args);
	}

	@Autowired
	BookRepository bookRepository;

	@Autowired
	RedisTemplate<String,Object> redisTemplate;

	@Override
	public void run(String... args) throws Exception {
		Book book = new Book();
		book.setTitle("HarryPotter");
		book.setAuthor("JK Rowling");
		book.setGenre(Genre.FICTION);
		book.setRating(4.0);
		book.setCost(500.0);
		book.setYear(2000);
		List<Review> reviews = new ArrayList<>();
		reviews.add(new Review());

		redisTemplate.opsForValue().set("myJavaKey","myJavaValue");

	}
}
