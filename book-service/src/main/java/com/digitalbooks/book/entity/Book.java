package com.digitalbooks.book.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
@Entity
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String image;
	private String title;
	private String category;
	private String publisher;
	private String publishedDate;
	private String chapters;
	private boolean active;

}
