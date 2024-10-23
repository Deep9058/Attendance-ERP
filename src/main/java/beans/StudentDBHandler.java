package beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class StudentDBHandler {
	
	private String message;
	public String getMessage() 
	{
		return message;
	}
	
	public	void save(Student student )
	{
		message="";
		try
		{
			Connection cn=DB.getConnection();
			String query="insert into student(name,email,password,branch) values(?,?,?,?)";
			PreparedStatement st=cn.prepareStatement(query);	
			st.setString(1,student.getName());
			st.setString(2,student.getEmail());
			st.setString(3,student.getPassword());
			st.setString(4,student.getBranch());
			st.executeUpdate();
			cn.close();
			message="success";
			
		}
		catch (Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}
	
	public	void edit(Student student )
	{
		message="";
		try
		{
			Connection cn=DB.getConnection();
			String query="update into student(name,email,password,branch) values(?,?,?,?)";
			PreparedStatement st=cn.prepareStatement(query);	
			st.setString(1,student.getName());
			st.setString(2,student.getEmail());
			st.setString(3,student.getPassword());
			st.setString(4,student.getBranch());
			st.executeUpdate();
			cn.close();
			message="success";
			
		}
		catch (Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}
	
	public Student getStudent(String email)
	{
		Student student=null;
		message="";
		try
		{
			Connection cn=DB.getConnection();
			String query="select * from student where email=?";
			PreparedStatement st=cn.prepareStatement(query);
			st.setString(1,email);
			ResultSet result=st.executeQuery();
			if(result.next())
			{
				student = new Student(result.getInt(1),result.getString(2),result.getString(3),result.getString(4),result.getString(5));
			}
			cn.close();
			message="success";
			
		}
		catch (Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		return student;
	}
	
	public ArrayList<Student> getAllStudents(String searchText)
	{
		ArrayList<Student> students=new ArrayList<Student>();
		try
		{
			Connection cn=DB.getConnection();
			String query="select * from student where sid=? or email like ? or name like ?";
			PreparedStatement st=cn.prepareStatement(query);
			st.setString(1, searchText);
			st.setString(2, "%"+searchText+"%");
			st.setString(3, "%"+searchText+"%");
			ResultSet result=st.executeQuery();
			if(result.next())
			{
				Student	student = new Student(result.getInt(1),result.getString(2),result.getString(3),result.getString(4),result.getString(5));
				students.add(student);
			}
			cn.close();
			message="success";
		}
		
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
		return students;
	}

}
