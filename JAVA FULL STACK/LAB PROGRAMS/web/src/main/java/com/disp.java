package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.ResultSet;

@WebServlet("/disp")
public class disp extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public disp() {
        super();
        // TODO Auto-generated constructor stub
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html"); 
		PrintWriter out = response.getWriter(); 
		try{  
		Class.forName ("com.mysql.jdbc.Driver"); 
		Class.forName("com.mysql.jdbc.Driver"); 
		Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3308/emp1","root","");  
		Statement stmt=con.createStatement();
		ResultSet rs=(ResultSet) stmt.executeQuery("select * from empinfo");  
        while(rs.next())  
          
           out.println("<p>"+rs.getString(1)+"  "+rs.getInt(2)+"  "+rs.getInt(3)+"</p>");  
		}
		catch (Exception e2) {e2.printStackTrace();} 
		finally{out.close();} 

}

}
