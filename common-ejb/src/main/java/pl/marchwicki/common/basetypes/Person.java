package pl.marchwicki.common.basetypes;

import java.util.Date;
import pl.marchwicki.common.basetypes.Person;

public class Person {

	private int personId;
	private String firstname;
	private String lastname;
	private Date dateOfBirth;

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public int getPersonId() {
		return personId;
	}
	
	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	private Person(Builder builder) {
		this.personId = builder.personId;
		this.firstname = builder.firstname;
		this.lastname = builder.lastname;
		this.dateOfBirth = builder.dateOfBirth;
	}

	public static class Builder {
		private int personId;
		private String firstname;
		private String lastname;
		private Date dateOfBirth;

		public Builder withPersonId(int personId) {
			this.personId = personId;
			return this;
		}
		
		public Builder withFirstname(String firstname) {
			this.firstname = firstname;
			return this;
		}

		public Builder withLastname(String lastname) {
			this.lastname = lastname;
			return this;
		}

		public Builder withDateOfBirth(Date dateOfBirth) {
			this.dateOfBirth = dateOfBirth;
			return this;
		}

		public Person build() {
			return new Person(this);
		}
	}
	
	public String toString() {
		return "[Person id=" + personId +", name=" + firstname + " " + lastname + "]";
	}
}
