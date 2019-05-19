package com.co.ceiba.biblioteca.exception;

@SuppressWarnings("serial")
public class BibliotecaException extends Exception{
	public BibliotecaException() {
		super();
	}
	public BibliotecaException(String mensaje, Throwable e) {
      super(mensaje, e);
	}

}
