package com.co.ceiba.biblioteca.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.co.ceiba.biblioteca.exception.BibliotecaException;
import com.co.ceiba.biblioteca.modelo.Libro;
import com.co.ceiba.biblioteca.repository.ILibroDao;

@Service
@Transactional
public class ILibroServiceImpl implements ILibroService {
	
	@Autowired
	ILibroDao ilibroDao;

	@Override
	public void crearLibro(Libro libro){
		
		try {
			ilibroDao.guardarLibro(libro);
		} catch (BibliotecaException e) {
				
		}
		
	}

}
