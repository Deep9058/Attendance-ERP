package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.Student;
import beans.StudentDBHandler;

@WebServlet("/SearchStudent")
public class SearchStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String st=request.getParameter("searchText");
		StudentDBHandler db=new StudentDBHandler();
		ArrayList<Student> students=db.getAllStudents(st);
		RequestDispatcher rd= request.getRequestDispatcher("searchstudents.jsp");
		request.setAttribute("students",students);
		rd.forward(request, response);
		
	}

}
