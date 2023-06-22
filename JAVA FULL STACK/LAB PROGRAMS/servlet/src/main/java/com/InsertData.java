package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

 
@WebServlet("/InsertData")
public class InsertData extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try{ 
		Class.forName ("com.mysql.jdbc.Driver"); 
		Connection con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3308/god1","root",""); 
		PreparedStatement st = (PreparedStatement) con.prepareStatement("insert into mark values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
		st.setInt(1, Integer.valueOf(request.getParameter("rollno")));
		st.setString(2, request.getParameter("name"));
		st.setString(3, request.getParameter("section"));
		st.setInt(4, Integer.valueOf(request.getParameter("sub1")));
		st.setInt(5, Integer.valueOf(request.getParameter("sub2")));
		st.setInt(6, Integer.valueOf(request.getParameter("sub3")));
		st.setInt(7, Integer.valueOf(request.getParameter("sub4")));
		st.setInt(8, Integer.valueOf(request.getParameter("sub5")));
		st.setInt(9, Integer.valueOf(request.getParameter("sub6")));
		st.setInt(10, Integer.valueOf(request.getParameter("lab1")));
		st.setInt(11, Integer.valueOf(request.getParameter("lab2")));
		st.executeUpdate();
		st.close();
		con.close(); 
		PrintWriter out = response.getWriter();
		out.println("<html><body><b>Successfully Inserted"
		+ "</b></body></html>");
		}catch(Exception e){ System.out.println(e);} 
		}
		}

