package com.miapp

class NotificacionController {

    def notificacionService
	def listar() { 
	[notificaciones: notificacionService.listarNotificaciones()]
	}
}
