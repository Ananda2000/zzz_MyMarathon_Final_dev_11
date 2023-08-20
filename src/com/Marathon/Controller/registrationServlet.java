package com.Marathon.Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.Marathon.DAO.DaoClassesss;

import pojoclassesess.Registraion_pojo;

/**
 * Servlet implementation class registrationServlet
 */
@WebServlet("/registrationServlet")
public class registrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		String fname = request.getParameter("usernmae");
		String Emailid = request.getParameter("emailid");
		String passwdd = request.getParameter("passwd");
		//doGet(request, response);
	
		Registraion_pojo regist= new Registraion_pojo(fname,Emailid,passwdd);
		
		regist.setFirst_name(fname);
		regist.setEmail_ID(fname);
		
		regist.setPassword(passwdd);
		
		DaoClassesss dao = new DaoClassesss();
		dao.insert(regist);
		//RequestDispatcher rd = request.getRequestDispatcher("loginpage/loginpage1.jsp");
		//RequestDispatcher rd = request.getRequestDispatcher("Text_123.jsp");
		RequestDispatcher rd = request.getRequestDispatcher("loginpage1.jsp");
		
		rd.forward(request, response);
		
	
	}
	

}
