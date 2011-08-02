package pl.marchwicki.common.ejb;

import pl.marchwicki.common.basetypes.Person;

public interface CommonServiceLocal {

	public Person getNewPerson(int personId);
	
}
