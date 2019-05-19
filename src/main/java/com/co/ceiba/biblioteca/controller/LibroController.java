package com.co.ceiba.biblioteca.controller;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.co.ceiba.biblioteca.services.ILibroService;
import com.co.ceiba.modelo.Libro;

@SuppressWarnings("serial")
@RestController
@RequestMapping("/libro")
public class LibroController implements Serializable{
	
	@Autowired
	ILibroService libroService;
	
	@CrossOrigin
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> crearLibro(){
		Libro libro = new Libro();
		libro.setId(12344588);
		libro.setIsbn(11111);
		libro.setCantidad(2);
		libro.setNombre("test");
		libro.setPalindromo(true);
		
		try {
			libroService.crearLibro(libro);
			return new ResponseEntity<String>("Libro creada", HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseEntity<String>(e.getMessage(), HttpStatus.BAD_REQUEST);
		}
	}
	
	

}
