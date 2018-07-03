package com.miapp

class Rol {

	String nombre
	Instrumento instrumento
	
    static constraints = {
		nombre blank: false
	}
	
	String toString(){
		return nombre
	}
	
	static belongsTo= [instrumento: Instrumento]
}
