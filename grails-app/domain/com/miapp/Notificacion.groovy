package com.miapp

class Notificacion {

	Busqueda busqueda

	
    static constraints = {
    }

	static mapping = {
		table 'notificacion'
			version false
			busqueda column: 'busqueda_id'
	}
}
