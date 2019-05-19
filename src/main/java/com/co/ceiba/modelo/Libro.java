package com.co.ceiba.modelo;

import javax.persistence.Table;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@SuppressWarnings("serial")
@Entity
@Table(name = "libro")
public class Libro implements Serializable {

	@Id
	@Column(name = "isbn")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name="isbn")
	private int isbn;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="cantidad")
	private int cantidad;
	
	@Column(name="palindromo")
	private boolean palindromo;	

	public Libro(int id, int isbn, String nombre, int cantidad, boolean palindromo) {
		super();
		this.id = id;
		this.isbn = isbn;
		this.nombre = nombre;
		this.cantidad = cantidad;
		this.palindromo = palindromo;
	}	
	
	public Libro() {
		super();		
	}		

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public boolean isPalindromo() {
		return palindromo;
	}

	public void setPalindromo(boolean palindromo) {
		this.palindromo = palindromo;
	}


}
