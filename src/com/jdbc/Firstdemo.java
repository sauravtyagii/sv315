package com.jdbc;
import java.sql.*;

public class Firstdemo {

	public static void main(String[] args) {
		
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url = "jdbc:mysql://localhost:3306/collage";
		String username = "root";
		String pass="Tgtgtg@123";
		Connection con= DriverManager.getConnection(url,username,pass);
		if(con.isClosed())
		{
			System.out.println("connection not created");
			
			con.close();
		}
		else {
			System.out.println(con);
		}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		

	}

}
