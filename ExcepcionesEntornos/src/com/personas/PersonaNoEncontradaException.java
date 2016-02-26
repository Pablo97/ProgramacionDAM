package com.personas;

public class PersonaNoEncontradaException  extends Exception{
	
	private static final long serialVersionUID = 1748814881087006332L;
	String nombre;
	
	@Override
	public String getMessage(){
		return nombre +  " no es un usuario del sistema";
	}
}
