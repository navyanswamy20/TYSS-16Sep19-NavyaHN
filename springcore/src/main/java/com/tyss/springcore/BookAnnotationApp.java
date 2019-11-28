package com.tyss.springcore;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tyss.springcore.config.ConfigurationBook;
import com.tyss.springcore.di.Author;
import com.tyss.springcore.di.Book;

public class BookAnnotationApp {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationBook.class);
Book book = context.getBean(Book.class);
System.out.println(book.getAuthor());
System.out.println(book.getName());
System.out.println(book.getPrice());
System.out.println("=========================");
 Author author = context.getBean(Author.class);
 System.out.println(author.getName());
 System.out.println(author.getPenName());
	}
	
}
