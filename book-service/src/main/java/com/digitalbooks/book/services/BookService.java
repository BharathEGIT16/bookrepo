package com.digitalbooks.book.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.digitalbooks.book.entity.PurchaseInfo;
import com.digitalbooks.book.entity.Reader;
import com.digitalbooks.book.entity.Subscription;
import com.digitalbooks.book.model.Book;
import com.digitalbooks.book.model.BookInfo;
import com.digitalbooks.book.repository.SubscriptionRepository;
import com.digitalbooks.book.util.Util;

@Service
public class BookService {

	
	@Autowired
	SubscriptionRepository subscriptionRepository;

	public List<Book> getAllBooks() {

		// bookRepository.findAllBooks().stream().filter(book->book.g)

		List<Book> booklist = new ArrayList<Book>();

		Book b1 = new Book();
		b1.setTitle("Java 8");
		b1.setCategory("Java");
		booklist.add(b1);
		return booklist;
	}

	public String buyBook(BookInfo bookInfo) {
		Subscription subscription = new Subscription();
		PurchaseInfo purchaseInfo = new PurchaseInfo();
		purchaseInfo.setBookId(bookInfo.getBookId());
		Reader reader = new Reader();
		reader.setEmail(bookInfo.getReader().getEmail());
		reader.setName(bookInfo.getReader().getName());
		purchaseInfo.setReader(reader);
		subscription.setPurchaseInfo(purchaseInfo);
		return subscriptionRepository.save(subscription).getId() + "";

	}

}
