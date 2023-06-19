package com;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSet;
import com.mysql.jdbc.ResultSetMetaData;

@WebServlet("/insertData")
public class insertData extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try{ 
		Class.forName ("com.mysql.jdbc.Driver"); 
		Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3308/emp1","root",""); 
		PreparedStatement st = (PreparedStatement) con.prepareStatement("insert into empinfo values(?, ?, ?)");
		st.setString(1, request.getParameter("name"));
		st.setInt(2,  Integer.valueOf(request.getParameter("age")));
		st.setInt(3,  Integer.valueOf(request.getParameter("num1")));
		st.executeUpdate();
		st.close();
		con.close(); 
		PrintWriter out = response.getWriter();
		out.println("<html><body><b>Successfully Inserted"
		+ "</b></body></html>");
		}catch(Exception e){ System.out.println(e);} 
		}
	 
}
