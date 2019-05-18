package com.co.ceiba.biblioteca;

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

	private int isbn;
	private String nombre;
	private int cantidad;
	private boolean palindromo;

	@Id
	@Column(name = "isbn")
	@GeneratedValue(strategy = GenerationType.AUTO)
	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	@Column(name = "nombre")
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "cantidad")
	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	@Column(name = "palindromo")
	public boolean isPalindromo() {
		return palindromo;
	}

	public void setPalindromo(boolean palindromo) {
		this.palindromo = palindromo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cantidad;
		result = prime * result + isbn;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + (palindromo ? 1231 : 1237);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Libro other = (Libro) obj;
		if (cantidad != other.cantidad)
			return false;
		if (isbn != other.isbn)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (palindromo != other.palindromo)
			return false;
		return true;
	}

}
