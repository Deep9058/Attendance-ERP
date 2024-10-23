package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.Student;
import beans.StudentDBHandler;


@WebServlet("/AddStudent")
public class AddStudent extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
	
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		String name=request.getParameter("name");
		String branch=request.getParameter("type");
		
		Student student=new Student(0, name, email, password, branch);
		StudentDBHandler db=new StudentDBHandler();
		db.save(student);
		if(db.getMessage().equals("success"))
		{
			response.sendRedirect("welcome.jsp");
		}
		else 
		{
			response.sendRedirect("addstudent.jsp?data_already_exists");
		}
		
		
	}

}
