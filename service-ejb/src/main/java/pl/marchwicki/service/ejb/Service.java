package pl.marchwicki.service.ejb;

import java.util.Date;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Stateless;

import pl.marchwicki.common.basetypes.Person;
import pl.marchwicki.common.ejb.CommonServiceLocal;
import pl.marchwicki.service.basetypes.User;

@Stateless
@Local(ServiceLocal.class)
public class Service implements ServiceLocal {

	@EJB
	CommonServiceLocal commonService;
	
	public User getUserInfo(int userId) {
		Person newPerson = commonService.getNewPerson(userId);
		
		User user = new User.Builder()
			.withUserData(newPerson)
			.withPremiumAccount(((userId % 2 == 0)?true:false))
			.withLastActivity(new Date())
			.build();
		
		return user;
	}

}
