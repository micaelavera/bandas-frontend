package bandas

import com.miapp.auth.*

class BootStrap {

    def init = { servletContext ->
   def adminRole = Role.findOrSaveWhere(authority: 'ROLE_ADMIN')
		def userRole = Role.findOrSaveWhere(authority: 'ROLE_USER')
		def admin = User.findOrSaveWhere(username: 'admin', password: 'pass')
		def user = User.findOrSaveWhere(username: 'micaela', password: 'pass')

		if (!admin.authorities.contains(adminRole)) {
			UserRole.create(admin, adminRole, true)
		}

		if (!user.authorities.contains(adminRole)) {
			UserRole.create(user, userRole, true)

		}

   }
    def destroy = {
    }
}
