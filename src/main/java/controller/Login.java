package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.catalina.User;

import beans.Admin;
import beans.AdminDBHandler;
import beans.Faculty;
import beans.FacultyDBHandler;
import beans.Student;
import beans.StudentDBHandler;

@WebServlet("/Login")
public class Login extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		String type=request.getParameter("type");
		
		if(type.equals("admin"))
		{
			AdminDBHandler db=new AdminDBHandler();
			Admin admin=db.getAdmin(email);
			
			if(admin==null)
			{
				response.sendRedirect("index.jsp?message=Invalid_email");
			}
			else 
			{
				if(admin.getPassword().equals(password))
				{
					HttpSession session=request.getSession();
					session.setAttribute("Admin", admin);
					response.sendRedirect("welcome.jsp");
				}
				else 
				{
					response.sendRedirect("index.jsp?message=Invalid_password");
				}
			}
		}
		else if(type.equals("faculty"))
		{
			FacultyDBHandler db=new FacultyDBHandler();
			Faculty faculty=db.getFaculty(email);
			
			
			if(faculty==null)
			{
				response.sendRedirect("index.jsp?message=Invalid_email");
			}
			else 
			{
				if(faculty.getPassword().equals(password))
				{
					HttpSession session=request.getSession();
					session.setAttribute("Faculty", faculty);
					response.sendRedirect("welcomefaculty.jsp");
				}
				else 
				{
					response.sendRedirect("index.jsp?message=Invalid_password");
				}
			}
		}
		else 
		{
			StudentDBHandler db=new StudentDBHandler();
			Student student=db.getStudent(email);
			
			if(student==null)
			{
				response.sendRedirect("index.jsp?message=Invalid_email");
			}
			else 
			{
				if(student.getPassword().equals(password))
				{
					HttpSession session=request.getSession();
					session.setAttribute("Student", student);
					response.sendRedirect("welcomestudent.jsp");
				}
				else 
				{
					response.sendRedirect("index.jsp?message=Invalid_password");
				}
			}
		}
		
		
	}

}
