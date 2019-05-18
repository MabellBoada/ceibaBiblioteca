package com.co.ceiba.biblioteca;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import javax.xml.ws.ServiceMode;

@Transactional
@ServiceMode
public class LibroDao {

	@PersistenceContext
	private EntityManager em;

	public void guardarLibro(Libro libro) {
		try {
			em.persist(libro);

		} catch (Exception e) {

		}
	}

}
