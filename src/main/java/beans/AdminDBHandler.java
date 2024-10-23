package beans;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AdminDBHandler {

	private String message="";
	public String getMessage() {
		return message;
	}

	public Admin getAdmin(String email)
	{ 
		Admin admin=null;
		message="";
		try
		{
			Connection cn=DB.getConnection();
			String query="select * from admin where email=?";
			PreparedStatement st=cn.prepareStatement(query);
			st.setString(1, email);
			ResultSet result=st.executeQuery();
			if(result.next()) 
			{
				admin=new Admin(result.getString(1),result.getString(2),result.getString(3));
			}
			cn.close();
			message="successs";
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		return admin;
	}
	

}
