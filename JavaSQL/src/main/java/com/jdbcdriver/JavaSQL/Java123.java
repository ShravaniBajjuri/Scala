package com.jdbcdriver.JavaSQL;

//import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Java123 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    try {
    	Class.forName("com.mysql.jdbc.Driver");
    	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/sakila", "root", "password");
    Statement stmnt = con.createStatement();
    ResultSet rs = stmnt.executeQuery("select * from category ");
    while(rs.next())
    	System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getDate(3));
       con.close();
    }
    catch(Exception e)
    {
    	System.out.println(e);
    
    
    		}
	}

}
