package beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class FacultyDBHandler {
	
	private String message;
	public String getMessage() 
	{
		return message;
	}
	
	public void save(Faculty faculty )
	{
		message="";
		try
		{
			Connection cn=DB.getConnection();
			String query="insert into Faculty(name,email,password,branch) values(?,?,?,?)";
			PreparedStatement st=cn.prepareStatement(query);
			st.setString(1,faculty.getName());
			st.setString(2,faculty.getEmail());
			st.setString(3,faculty.getPassword());
			st.setString(4,faculty.getBranch());
			st.executeUpdate();
			cn.close();
			message="success";
			
		}
		catch (Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}

	public Faculty getFaculty(String email)
	{
		Faculty faculty=null;
		message="";
		try
		{
			Connection cn=DB.getConnection();
			String query="select * from faculty where email=?";
			PreparedStatement st=cn.prepareStatement(query);
			st.setString(1,email);
			ResultSet result=st.executeQuery();
			if(result.next())
			{
				faculty = new Faculty(result.getInt(1),result.getString(2),result.getString(3),result.getString(4),result.getString(5));
			}
			cn.close();
			message="success";
			
		}
		catch (Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		return faculty;
	}

}
