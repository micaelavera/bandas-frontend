package com.miapp

class Perfil {
		
	String experiencia
	Musico musico
	GeneroMusical genero
	Rol rol
	
    static constraints = {
		experiencia nullable:false
    }
	
	static belongsTo = [ musico : Musico ]
	static hasMany = [ rol: Rol]
}
