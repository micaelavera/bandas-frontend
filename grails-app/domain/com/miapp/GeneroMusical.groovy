package com.miapp

class GeneroMusical {

	String nombre
	
    String toString(){
		return nombre
	}
	
	static constraints = {
    }
	static hasMany = [ bandas : Banda ]
}
