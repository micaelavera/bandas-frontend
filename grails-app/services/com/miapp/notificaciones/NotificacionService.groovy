package bandas

import grails.gorm.transactions.Transactional

import com.miapp.*

@Transactional
class NotificacionService {

    Notificacion[] listarNotificaciones() {
	Notificacion.list() as Notificacion[]
 }
}
