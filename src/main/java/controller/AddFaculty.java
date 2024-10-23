package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.Faculty;
import beans.FacultyDBHandler;
import beans.Student;
import beans.StudentDBHandler;


@WebServlet("/AddFaculty")
public class AddFaculty extends HttpServlet {
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		String name=request.getParameter("name");
		String branch=request.getParameter("type");
		Faculty faculty=new Faculty(0, name, email, password, branch);
		FacultyDBHandler db=new FacultyDBHandler();
		db.save(faculty);
		if(db.getMessage().equals("success"))
		{
			response.sendRedirect("welcome.jsp");
		}
		else 
		{
			response.sendRedirect("addfaculty.jsp?data_already_exists");
		}
	}

}
