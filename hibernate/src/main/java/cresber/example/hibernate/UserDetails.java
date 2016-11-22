package cresber.example.hibernate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserDetails {

	@Id
	int userId;
	String userName;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
}
