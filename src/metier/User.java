package metier;

import java.io.Serializable;


@SuppressWarnings("serial")
public class User implements Serializable {
	private String last_name ; 
	private String first_name ;
	private String username ;
	private String password ;
	private int id ;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public User() {
		super();
	}
	public User(String last_name, String first_name, String username, String password) {
		super();
		this.last_name = last_name;
		this.first_name = first_name;
		this.username = username ;
		this.password = password ;
		
	}
	public User(String last_name, String first_name, String username, String password, int id){
		super();
		this.last_name = last_name;
		this.first_name = first_name;
		this.username = username ;
		this.password = password ;
		this.id = id ;
	}

	@Override
	public String toString() {
		return "User [nom=" + last_name + ", prenom=" + first_name + ", login=" + username + " password=" + password + "id=" + id +"]";
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
