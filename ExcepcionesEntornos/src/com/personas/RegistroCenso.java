package com.personas;

import java.util.Scanner;

public class RegistroCenso {
	
	static protected String [] personas;
	public static void main(String[] args) {
		personas = new String[10];
		mostrarOpciones();
		int opcion=leerOpcion();
		do{
			if (opcion==1) registraPersona();
			if (opcion==2)
				try {
					buscaPersona();
				} catch (PersonaNoEncontradaException e) {
					e.printStackTrace();
				}
		} while (opcion !=3);
	}

	private static void mostrarOpciones() {
		System.out.println("____________________________");
		System.out.println("|                          |");
		System.out.println("| 1. Registrar una persona.|");
		System.out.println("| 2. Buscar una persona.   |");
		System.out.println("| 3. Salir.                |");
		System.out.println("|__________________________|");
	}

	private static int leerOpcion() {
		Scanner sc = new Scanner (System.in);
		System.out.println("Introduce una opción: ");
		int opcion=Integer.valueOf(sc.nextInt());
		sc.close();
		return opcion;
	}

	private static void registraPersona() {
		System.out.println("Introduce el nombre de una persona: ");
		Scanner sc = new Scanner (System.in);
		
		sc.close();
	}
	
	public static void buscaPersona() throws PersonaNoEncontradaException {
	Scanner sc = new Scanner(System.in);
	String nombre = sc.nextLine();
	for (int i=0; i<personas.length; i++){
		if (personas[i].compareTo(nombre)==0){
			System.out.println(nombre + " está registrado en el curso");
			return;
		}
	}
	 PersonaNoEncontradaException e = new PersonaNoEncontradaException();
	 e.nombre=nombre;
	 throw e;
	}
}
