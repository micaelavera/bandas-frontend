package com.miapp

class Banda {

	String nombre
	byte [] logo
	GeneroMusical genero
	Musico[] musicos
	
    static constraints = {
		nombre nullable: false
		logo nullable:true
	}

	//static belongsTo = [ musico : Musico ]
	//static hasMany= [musicos : Musico]
}
