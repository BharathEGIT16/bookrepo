package com.digitalbooks.book.repository;

import org.springframework.data.repository.CrudRepository;

import com.digitalbooks.book.entity.Book;
import com.digitalbooks.book.entity.Subscription;

public interface SubscriptionRepository  extends CrudRepository<Subscription, String> {
	
	Subscription save(Subscription subscription);

}
