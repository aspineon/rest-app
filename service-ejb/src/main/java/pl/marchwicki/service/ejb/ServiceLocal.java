package pl.marchwicki.service.ejb;

import pl.marchwicki.service.basetypes.User;

public interface ServiceLocal {

	public User getUserInfo(int userId);
	
}
