package form;

import java.awt.*;
import java.sql.*;
public class ConnectionJDBC {
	
	//private String username ,password;
	
//---------------------method to receive value from LoginPage---------------------
	
	public String data(String name, String pass) {
		//-----------------Connection Established-----------------
				
				try {
					String url = "jdbc:mysql://localhost:3306/jdbc_login";
					String username = "root";
					String password = "";
					
					Connection con = DriverManager.getConnection(url,username,password);
					
					Statement stm = con.createStatement();
					/*
					String query = "create database jdbc_login";
					stm.execute(query);
					System.out.println("Database Create successfully");
					*/
					/*
					String query1 = "create table login(username varchar(50), password varchar(50))";
					stm.execute(query1);
					System.out.println("table Create successfully");
					*/
					
		//-----------------------Insert value to database------------------
					String query3 = "insert into login(username, password)values('"+name+"','"+pass+"')";
					stm.execute(query3);
					
					//System.out.println("data insert successfully");
					
					
					//System.out.println(name+ " "+pass);
				}catch(Exception e) {
					System.out.println(e);
				}
			return "-Account Created SuccessFully-";
	}
	
	ConnectionJDBC(){

	

	}

	public static void main(String[] args) {
		ConnectionJDBC cj = new ConnectionJDBC();
		
	
		
		
	}

}
