package com.miapp

class Busqueda {

    String instrumento
    String experiencia
    String sugerencia

    static constraints = {
    }

    static mapping={
        table "busqueda"
		version false
        instrumento column: 'instrumento'
        experiencia column: 'experiencia'
       sugerencia column: 'fechaSugerencia'
    }
	
	//static belongsTo= [instrumento: Instrumento]
}
