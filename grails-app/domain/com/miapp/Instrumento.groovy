package com.miapp

class Instrumento {

	String nombre 
	
	
	String toString(){
		return nombre
	}
	
    static constraints = {
		nombre nullable: false 
	}
	
	
}
