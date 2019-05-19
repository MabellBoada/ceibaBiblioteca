package com.co.ceiba.biblioteca.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.co.ceiba.biblioteca.exception.BibliotecaException;
import com.co.ceiba.biblioteca.modelo.Libro;

@Transactional
@Repository
public class LibroDao implements ILibroDao{

	@PersistenceContext
	private EntityManager em;
	
	public void guardarLibro(Libro libro) throws BibliotecaException {
		try {
			em.persist(libro);
		} catch (Exception e) {
			throw new BibliotecaException("Hola, HUbo un errror",e);


		}
	}

}
