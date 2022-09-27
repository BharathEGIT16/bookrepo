package com.digitalbooks.book.model;

import java.util.Objects;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;


public class Book {
private String image;
private String title;
private String category;
private Author author;
private String publisher;
private String publishedDate;
private String chapters;
private boolean active;
public String getImage() {
	return image;
}
public void setImage(String image) {
	this.image = image;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}
public Author getAuthor() {
	return author;
}
public void setAuthor(Author author) {
	this.author = author;
}
public String getPublisher() {
	return publisher;
}
public void setPublisher(String publisher) {
	this.publisher = publisher;
}
public String getPublishedDate() {
	return publishedDate;
}
public void setPublishedDate(String publishedDate) {
	this.publishedDate = publishedDate;
}
public String getChapters() {
	return chapters;
}
public void setChapters(String chapters) {
	this.chapters = chapters;
}
public boolean isActive() {
	return active;
}
public void setActive(boolean active) {
	this.active = active;
}
@Override
public int hashCode() {
	return Objects.hash(active, author, category, chapters, image, publishedDate, publisher, title);
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Book other = (Book) obj;
	return active == other.active && Objects.equals(author, other.author) && Objects.equals(category, other.category)
			&& Objects.equals(chapters, other.chapters) && Objects.equals(image, other.image)
			&& Objects.equals(publishedDate, other.publishedDate) && Objects.equals(publisher, other.publisher)
			&& Objects.equals(title, other.title);
}

}

