package com.Marathon.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import pojoclassesess.Registraion_pojo;
import pojoclassesess.login_pojo;

public class DaoClassesss 
{
	private String dburl ="jdbc:mysql://localhost:3306/marathon";
	private String uname ="root";
	private String pwd ="@n@ndA@321";
	private String DBdriver ="com.mysql.cj.jdbc.Driver";
	
	public void loadingDriver(String DBdriver)
	{
		try {
			Class.forName(DBdriver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public Connection getconnectioncreation()
	{
		Connection con =null;
		try {
			con = DriverManager.getConnection(dburl, uname, pwd);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
		
	}

	public void insert(Registraion_pojo register)
	{
		loadingDriver(DBdriver);
		Connection con = getconnectioncreation();
		String sql = "insert into registration (first_name,Email_id,password)values(?,?,?)";
		
		
		PreparedStatement pre;
		try {
			pre = con.prepareStatement(sql);

			pre.setString(1, register.getFirst_name());
			pre.setString(2, register.getEmail_ID());
			pre.setString(3, register.getPassword());
			pre.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
	
	public ResultSet LoginpageSelect(login_pojo loginpage)
	{
		loadingDriver(DBdriver);
		Connection conn = getconnectioncreation();
		String sql_select = "select * from registration where Email_id=? and password=?";
		PreparedStatement prep ;

		ResultSet rs = null ;
		try {
			prep =conn.prepareStatement(sql_select);
			prep.setString(1, loginpage.getEmailid());
			prep.setString(2, loginpage.getPassword());
		 //value=prep.executeUpdate(sql_select);
		 rs = prep.executeQuery();
		// System.out.println("This is resultset ----------"+rs.getString(1));
		 //System.out.println("This is result set --------"+ rs.getString(2));
		
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			return rs;
	}
	
	public List<Registraion_pojo> AllUsersList() throws SQLException
	{
		List<Registraion_pojo> lis = new ArrayList<Registraion_pojo>();
	
		loadingDriver(DBdriver);
		Connection con = getconnectioncreation();
		String str = "select * from registration";
		Statement stm = con.createStatement();
		
		ResultSet rs = stm.executeQuery(str);
		
		while(rs.next())
		{
			String f_nmae= rs.getString(1);
			String email = rs.getString(2);
			String pass = rs.getString(3);
			lis.add(new Registraion_pojo(f_nmae, email, pass));
		}
		
		
		return lis;
		
	}
}
