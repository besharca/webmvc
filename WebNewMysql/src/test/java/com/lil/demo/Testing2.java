package com.lil.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Base64; 

public class Testing2 {

	public static void main(String[] args)  throws Exception {
		 
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String url="jdbc:mysql://localhost:3306/dog?useSSL=false&allowPublicKeyRetrieval=true";
		String username="root";
		String password="root";  
		byte[] b= null;
		
		Connection con = DriverManager.getConnection(url, username, password);
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select * from imgtable");
		while(rs.next()) {
			b = rs.getBytes(3);
		}
		String s = Base64.getEncoder().encodeToString(b);
		System.out.println(s);
	}

}
