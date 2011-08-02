package pl.marchwicki.common.ejb;

import javax.ejb.Local;
import javax.ejb.Stateless;

import org.joda.time.DateTime;

import pl.marchwicki.common.basetypes.Person;

@Stateless
@Local(CommonServiceLocal.class)
public class CommonService implements CommonServiceLocal {

	public Person getNewPerson(int personId) {
		DateTime date = new DateTime(1980, 12, 13, 0, 0, 0, 0);
		
		Person person = new Person.Builder()
			.withPersonId(personId)
			.withFirstname("John")
			.withLastname("Smith")
			.withDateOfBirth(date.toDate())
			.build();
		
		return person;
	}

}
