package com.miapp

class Instrumento {

	String nombre 
	
    static constraints = {
		nombre nullable: false 
	}
	static hasMany = [ rol : Rol ]
}
