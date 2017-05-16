package dao;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;

import metier.User;

public class UserDaoImplementation implements IUser {
	public UserDaoImplementation(){
		
	}

	@Override
	public void deleteUser(int id) {
		Connection connection = SingletonConnection.getConnection(); 
		try {
			PreparedStatement ps = connection.prepareStatement("DELETE FROM users WHERE `id` = ?") ;
			
			ps.setInt(1, id);
			ps.executeUpdate();
			ps.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}

	@Override
	public List<User> chercherUser(String motCle) {
		List<User> user = new ArrayList<User>();
		Connection connection = SingletonConnection.getConnection();
		try {
			PreparedStatement ps = connection.prepareStatement("SELECT * FROM users WHERE `last_name` LIKE ?") ;
			ps.setString(1, motCle);
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()){
				User u = new User();
				u.setUsername(rs.getString("username"));
				u.setLast_name(rs.getString("last_name"));
				u.setFirst_name(rs.getString("first_name"));
				u.setPassword(rs.getString("password"));
				u.setId(rs.getInt("id"));

				user.add(u);
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return user;
	}

	@Override
	public User save(User user) {
		Connection connection = SingletonConnection.getConnection(); 
		try {
			PreparedStatement ps = connection.prepareStatement("INSERT INTO users (last_name, first_name, username, password) VALUES (?,?,?,MD5(?))") ;
			ps.setString(1, user.getLast_name());
			ps.setString(2, user.getFirst_name()) ;
			ps.setString(3, user.getUsername());
			ps.setString(4, user.getPassword());
			ps.executeUpdate();
			ps.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return user;
	}
	public User getUser(int id){
		User user = null ;
		Connection connection = SingletonConnection.getConnection();
		try {
			PreparedStatement ps = connection.prepareStatement("SELECT * FROM users WHERE `id` = ?") ;
			ps.setInt(1, id);
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()){
				user = new User();
				user.setUsername(rs.getString("username"));
				user.setLast_name(rs.getString("last_name"));
				user.setFirst_name(rs.getString("first_name"));
				user.setPassword(rs.getString("password"));
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return user;
	}
	public User update(User user){
		Connection connection = SingletonConnection.getConnection(); 
		try {
			PreparedStatement ps = connection.prepareStatement
					("UPDATE users SET last_name=?, first_name=?, username=?, password=md5(?) WHERE `id` = ?") ;
			ps.setString(1, user.getLast_name());
			ps.setString(2, user.getFirst_name());
			ps.setString(3, user.getUsername());
			ps.setString(4, user.getPassword());
			ps.setInt(5, user.getId());
			ps.executeUpdate();
			ps.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return user;
	}

}
