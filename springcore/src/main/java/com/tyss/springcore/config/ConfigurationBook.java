package com.tyss.springcore.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.tyss.springcore.di.Author;
import com.tyss.springcore.di.Book;
@Configuration
public class ConfigurationBook {
@Bean(name="book")
	public Book getBook() {
		Book book=new Book();
		book.setAuthor("vikram");
		book.setName("aaaa");
		book.setPrice(2000);
		return book;
	}
@Bean(name="author")
	public Author getAuthor() {
		Author author = new Author();
		author.setName("Tejasvi");
		author.setPenName("KVPN");
		return author;
	}
}

