package com.miapp

class Banda {

	String nombre
	byte [] logo
	
    static constraints = {
		nombre nullable: false
		logo nullable:true
	}

	//static belongsTo = [ musico : Musico ]
	//static hasMany = [ generoMusical : GeneroMusical ]
}
