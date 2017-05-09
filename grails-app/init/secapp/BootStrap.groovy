package secapp

import com.secapp.Role
import com.secapp.User
import com.secapp.UserRole

class BootStrap {

   def init = { servletContext ->

      Role roleAdmin = Role.findByAuthority(Role.ROLE_ADMIN)
      roleAdmin = roleAdmin ?: new Role(authority: Role.ROLE_ADMIN).save(failOnError: true)

      User userAdmin = User.findByUsername("admin")
      userAdmin = userAdmin ?: new User(username: "admin", password: "admin").save(failOnError: true)

      UserRole userRoleAdmin = UserRole.findByUserAndRole(userAdmin, roleAdmin)
      userRoleAdmin = userRoleAdmin ?: new UserRole(user: userAdmin, role: roleAdmin).save(failOnError: true)

   }

   def destroy = {
   }

}
