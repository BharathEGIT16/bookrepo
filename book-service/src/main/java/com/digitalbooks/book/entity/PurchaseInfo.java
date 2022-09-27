package com.digitalbooks.book.entity;

import java.util.Objects;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;


@Entity
public class PurchaseInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String bookId;
	@OneToOne(targetEntity=Reader.class,cascade=CascadeType.ALL) 
	private Reader reader;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getBookId() {
		return bookId;
	}
	public void setBookId(String bookId) {
		this.bookId = bookId;
	}
	public Reader getReader() {
		return reader;
	}
	public void setReader(Reader reader) {
		this.reader = reader;
	}
	@Override
	public int hashCode() {
		return Objects.hash(bookId, id, reader);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PurchaseInfo other = (PurchaseInfo) obj;
		return Objects.equals(bookId, other.bookId) && Objects.equals(id, other.id)
				&& Objects.equals(reader, other.reader);
	}


	
	
	
}
