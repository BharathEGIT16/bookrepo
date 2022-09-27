package com.digitalbooks.book.repository;

import org.springframework.data.repository.CrudRepository;

import com.digitalbooks.book.entity.Reader;
import com.digitalbooks.book.entity.Subscription;

public interface ReaderRepository extends CrudRepository<Reader, Long>{

	Reader save(Reader reader);
}
