package com.miapp

class Notificacion {

	Busqueda busqueda

	
    static constraints = {
    }

	static mapping = {
		table 'notificacion'
			busqueda column: 'busqueda_id'
	}
}
