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
		email email: true, unique:true
		password minSize: 6, password:true
		foto nullable: true
	}
	

	String toString(){
		return nombre
	}
	
	/*
	static hasMany = [ bandas : Banda ]
	static hasOne = [ perfil : Perfil ]
	static hasOne = [rol : Rol]*/
}
