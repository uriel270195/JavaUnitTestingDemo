package com.howtoprogram.junit5.singleton;

public class Book {
	private String nombre;
	private static Book book;
	
	public Book() {
		System.out.println("Constructor");
	}
	public static Book getInstance() {
		if(book == null) {
			book = new Book();
		}
		return book;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
