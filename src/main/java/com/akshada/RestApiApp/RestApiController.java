package com.akshada.RestApiApp;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.akshada.RestApiApp.binding.Book;
import com.akshada.RestApiApp.binding.Books;

@RestController
public class RestApiController {

	@GetMapping(value = "/books", produces = { "application/xml", "application/json" })
	public ResponseEntity<Books> getAllBooks() {
		Book b1 = new Book(101, "core java", 100.22);
		Book b2 = new Book(102, "Adv java", 100.88282);
		Book b3 = new Book(103, "python", 200.22);
		List<Book> list = Arrays.asList(b1, b2, b3);
		Books books = new Books();
		books.setBookList(list);
		return new ResponseEntity<Books>(books, HttpStatus.OK);
	}

	@PostMapping(value = "/books", consumes = { "application/xml", "application/json" })
	public ResponseEntity<String> addBooks(@RequestBody Books bookList) {

		List<Book> list = bookList.getBookList();
		list.forEach(System.out::println);
		return new ResponseEntity<String>("books created!!!", HttpStatus.CREATED);

	}
}
