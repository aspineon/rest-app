package pl.marchwicki.service.basetypes;

import java.util.Date;

import pl.marchwicki.common.basetypes.Person;
import pl.marchwicki.service.basetypes.User;

public class User {

	private Person userData;
	private boolean premiumAccount;
	private Date lastActivity;

	public Person getUserData() {
		return userData;
	}

	public void setUserData(Person userData) {
		this.userData = userData;
	}

	public boolean isPremiumAccount() {
		return premiumAccount;
	}

	public void setPremiumAccount(boolean premiumAccount) {
		this.premiumAccount = premiumAccount;
	}

	public Date getLastActivity() {
		return lastActivity;
	}

	public void setLastActivity(Date lastActivity) {
		this.lastActivity = lastActivity;
	}

	private User(Builder builder) {
		this.userData = builder.userData;
		this.premiumAccount = builder.premiumAccount;
		this.lastActivity = builder.lastActivity;
	}

	public static class Builder {
		private Person userData;
		private boolean premiumAccount;
		private Date lastActivity;

		public Builder withUserData(Person userData) {
			this.userData = userData;
			return this;
		}

		public Builder withPremiumAccount(boolean premiumAccount) {
			this.premiumAccount = premiumAccount;
			return this;
		}

		public Builder withLastActivity(Date lastActivity) {
			this.lastActivity = lastActivity;
			return this;
		}

		public User build() {
			return new User(this);
		}
	}
	
	public String toString() {
		return (isPremiumAccount()?"Premium":"Not premium") + " User: " + userData.toString();
	}
}
