package com.co.ceiba.biblioteca.repository;

import com.co.ceiba.biblioteca.exception.BibliotecaException;
import com.co.ceiba.biblioteca.modelo.Libro;

public interface ILibroDao {
	void guardarLibro(Libro libro) throws BibliotecaException;

}
 