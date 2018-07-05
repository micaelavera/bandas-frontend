package com.miapp
import grails.plugin.springsecurity.annotation.Secured
@Secured(['ROLE_USER'])
class NotificacionController {

    def notificacionService
	def listar() { 
	[notificaciones: notificacionService.listarNotificaciones()]
	}
}
