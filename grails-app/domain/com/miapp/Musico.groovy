package com.miapp

class Musico {

	String nombre
	String apellido
	String email
	String password
	byte [] foto
	
    static constraints = {
		nombre nullable: false
		apellido nullable: false
		email email: true
		password minSize: 6, password:true
	}
}
