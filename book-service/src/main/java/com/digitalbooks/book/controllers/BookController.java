package com.digitalbooks.book.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.digitalbooks.book.model.Book;
import com.digitalbooks.book.model.BookInfo;
import com.digitalbooks.book.services.BookService;

@RestController("/api/v1/digitalbooks/books")
public class BookController {
	
	@Autowired
	BookService bookService;

	@GetMapping("/search")
	public List<Book> getAllBooks(@RequestParam String category, @RequestParam String author,
			@RequestParam String price, @RequestParam String publisher) {

		return new ArrayList<Book>();
	}
	
	@PostMapping("/buy")
	public String buyBook(@RequestBody BookInfo bookInfo) {
		return bookService.buyBook(bookInfo);
	}

}
