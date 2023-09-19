package com.Marathon.Controller;

import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.DispatcherType;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.Dispatch;
import javax.xml.ws.Response;

import org.omg.CORBA.Request;

import com.Marathon.DAO.DaoClassesss;

import pojoclassesess.Registraion_pojo;
import pojoclassesess.login_pojo;

/**
 * Servlet implementation class loginpage
 */
@WebServlet("/loginpage")
public class loginpage extends HttpServlet 
{
	//DaoClassesss dao = new DaoClassesss();
	private static DaoClassesss dao_login1 ;
	private static final long serialVersionUID = 1L;
       
	public void init()
	{
		dao_login1= new DaoClassesss();
	}
   /* public loginpage() {
        super();
        // TODO Auto-generated constructor stub
    }*/

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		//RequestDispatcher rd = request.getRequestDispatcher("loginpage.jsp");
		
		/*String email = request.getParameter("email");
		String password = request.getParameter("passwd");
		System.out.println("================="+email);
		
		
		DaoClassesss dao_login = new DaoClassesss();
		login_pojo loginpojo = new login_pojo();
		
		loginpojo.setEmailid(email);
		loginpojo.setPassword(password);
		
		ResultSet aa =dao_login.LoginpageSelect(loginpojo);
		boolean returned_result = false ;
		try {
			returned_result = aa.next();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			if(returned_result == true)
			{
				RequestDispatcher rd = request.getRequestDispatcher("Text_123.jsp");
				rd.forward(request, response);

			
			}
			else
			{
				

				RequestDispatcher rd = request.getRequestDispatcher("loginpage1.jsp");
				rd.forward(request, response);
			}

*/	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);


		String email = request.getParameter("email");
		String password = request.getParameter("passwd");
		System.out.println("================="+email);
		
		
		DaoClassesss dao_login = new DaoClassesss();
		login_pojo loginpojo = new login_pojo();
		
		loginpojo.setEmailid(email);
		loginpojo.setPassword(password);
		
		ResultSet aa =dao_login.LoginpageSelect(loginpojo);
		boolean returned_result = false ;
		/*try {
			returned_result = aa.next();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
			if(returned_result == true)
			{
				RequestDispatcher rd = request.getRequestDispatcher("Text_123.jsp");
				rd.forward(request, response);

			
			}
			else
			{
				
				try {
					alluser(request,response);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				//RequestDispatcher rd = request.getRequestDispatcher("loginpage1.jsp");
				//rd.forward(request, response);
			}


	
	}
	
	public static void alluser(HttpServletRequest req, HttpServletResponse resp) throws SQLException, ServletException, IOException
	{
	//DaoClassesss dddd = new DaoClassesss();
	List<Registraion_pojo> aaa =dao_login1.AllUsersList();
	req.setAttribute("list", aaa);
	RequestDispatcher reqdisp = req.getRequestDispatcher("Text_123.jsp");
	reqdisp.forward(req, resp);
			
	}
}
	
