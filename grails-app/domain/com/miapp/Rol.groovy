package com.miapp

class Rol {

	String nombre
	
    static constraints = {
		nombre blank: false
	}
	
	static hasOne = [ musico : Musico ] 
	static hasOne = [instrumento : Instrumento ]
}
