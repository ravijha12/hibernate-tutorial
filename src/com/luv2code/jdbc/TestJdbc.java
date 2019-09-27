package com.luv2code.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJdbc {
	
	public static void main(String [] args){
		String jdbcurl = "jdbc:mysql://localhost:3306/hb_student_tracker?useSSL=false";
		String user = "hbstudent";
		String password = "hbstudent";
		try{
			System.out.println("connecting to database");
			 Connection conn = DriverManager.getConnection(jdbcurl,user,password);
			if(conn!=null)
				System.out.println("Successfull");
			else
				System.out.println("Failed");
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			
		}
	}
}
