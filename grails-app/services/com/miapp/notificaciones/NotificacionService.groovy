package com.miapp

import grails.gorm.transactions.Transactional

@Transactional
class NotificacionService {

    Notificacion[] listarNotificaciones() {
	Notificacion.list() as Notificacion[]
 }
}
