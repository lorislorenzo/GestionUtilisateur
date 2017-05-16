package dao;

import java.util.List ;

import metier.User;

public interface IUser {
	public void deleteUser(int id) ;
	public List<User> chercherUser(String motCle); 
	public User save(User nom) ;
	public User getUser(int id);
	public User update(User user);
}
