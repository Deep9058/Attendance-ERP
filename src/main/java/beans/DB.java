package beans;

import java.sql.Connection;
import java.sql.DriverManager;

public class DB {
	
	public static Connection getConnection()
	{
		Connection cn=null;
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			cn=DriverManager.getConnection("jdbc:mysql://localhost/attendance?user=root&password=3011");
		} 
		catch (Exception ex) 
		{
			System.out.println("Error:- " +ex.getMessage());
		}

		return cn;
	}

	public DB()
	{
		
	}

}
