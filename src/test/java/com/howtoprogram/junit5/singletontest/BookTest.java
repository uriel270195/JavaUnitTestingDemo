package com.howtoprogram.junit5.singletontest;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

import com.howtoprogram.junit5.singleton.Book;

public class BookTest {
	@Test
	void singletonTestOne() {
		Book book = Book.getInstance();
		book.setNombre("uriel");
		assertEquals("uriel",book.getNombre());
		
		Book book1 = Book.getInstance();
		book1.setNombre("javier");
		assertEquals("javier",book1.getNombre());
		
		Book book2 = Book.getInstance();
		book2.setNombre("arturo");
		assertEquals("arturo",book2.getNombre());
	}
}
