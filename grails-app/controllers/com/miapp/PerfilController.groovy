package com.miapp
import grails.plugin.springsecurity.annotation.Secured
@Secured(['ROLE_USER'])
class PerfilController {

    static scaffold = Perfil

}
