package com.miapp

class Busqueda {

    String instrumento
    String experiencia
    String sugerencia

    static constraints = {
    }

    static mapping={
        table "busqueda"
        instrumento column: '`instrumento`'
        experiencia column: '`experiencia`'
       sugerencia column: '`fechaSugerencia`'
    }
}
