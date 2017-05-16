package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class SingletonConnection {
	private static Connection connection ;
	static{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver") ;
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?useLegacyDatetimeCode=false&serverTimezone=America/New_York", "root", "dadfba16") ;
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
		}
	public static Connection getConnection() {
		return connection ;
	}
}
