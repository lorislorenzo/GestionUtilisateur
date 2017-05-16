package dao;

import java.util.List;

import metier.User;

public class TestDao {

	public static void main(String[] args) {
		UserDaoImplementation dao = new UserDaoImplementation() ;
		User u1 = dao.save(new User("loris","lorenzo", "loris.lorenzo", "azerty") ) ;
		System.out.println(u1.getPassword());
		List <User> us = dao.chercherUser("%loris%") ;
		for(User user : us ){
			System.out.println(user.toString());
		}
		
	}
}
