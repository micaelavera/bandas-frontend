package com.miapp

class Banda {

	String nombre
	byte [] logo
	
    static constraints = {
		nombre nullable: false
		logo blank:false
	}

	static belongsTo = [ musico : Musico ]
	static hasMany = [ generoMusical : GeneroMusical ]
}
