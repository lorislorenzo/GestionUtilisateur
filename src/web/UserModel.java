package web;
import metier.User;

import java.util.ArrayList;
import java.util.List;

public class UserModel {
	private String motCle ;
	private List<User> user = new ArrayList<User>() ;

	public String getMotCle() {
		return motCle;
	}
	public void setMotCle(String motCle) {
		this.motCle = motCle;
	}
	public List<User> getUser() {
		return user;
	}
	public void setUser(List<User> user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "UserModel [motCle=" + motCle + ", user=" + user + "]";
	}
	

}
