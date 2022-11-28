package com.user;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;
public class Jdbc_Mysql {
	Jdbc_Mysql que = new Jdbc_Mysql();
	Scanner sc = new Scanner(System.in);
	int count=0;
		public void fetchData() {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/quiz", "root", "root");
			System.out.println("enter your question number");
		
			int QueNum =sc.nextInt();
		     PreparedStatement ps = con.prepareStatement("select * from questiontable where Question_No=?");
		     ps.setInt(1, QueNum);
		     ResultSet rs = ps.executeQuery();
		      for(int i=0;i<10;i++){
		    	  while(rs.next()) {
		    		  System.out.println(rs.getString("Questions"));
		    		  System.out.println(rs.getString("Option_1"));
		    		  System.out.println(rs.getString("Option_2"));
		    		  System.out.println(rs.getString("Option_3"));
		    		  System.out.println(rs.getString("Option_4"));	 
		    		  System.out.println("Enter your answer");
		    		  Scanner sc1 = new Scanner(System.in);
		  			String ans= sc.next();
		  			} 
		    	  }
		}
		 catch (Exception e) {
			e.printStackTrace();
		}	
}
}