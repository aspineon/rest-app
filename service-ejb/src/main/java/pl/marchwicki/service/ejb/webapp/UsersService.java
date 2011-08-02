package pl.marchwicki.service.ejb.webapp;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Stateless;

import org.jboss.annotation.ejb.LocalBinding;

import pl.marchwicki.service.basetypes.User;
import pl.marchwicki.service.ejb.ServiceLocal;

@Stateless
@Local(UsersServiceLocal.class)
@LocalBinding(jndiBinding = "UsersService/local")
public class UsersService implements UsersServiceLocal {

	@EJB
	ServiceLocal service;
	
	public String getUser(Integer personId) {
		User u = service.getUserInfo(personId);
		return u.toString();
	}

}
