package com.miapp

class Rol {

	String nombre
	
    static constraints = {
		nombre blank: false
	}
	
	/*static hasMany= [ instrumentos: Instrumento ]*/
}
