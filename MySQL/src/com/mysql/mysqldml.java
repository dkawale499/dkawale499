package com.mysql;
import java.sql.*;


/*
1) Create Connection
2) Create statement
3) Execute statement/Query
4) Close the Connection
*/

public class mysqldml 
{

	public static void main(String[] args) throws SQLException
	{
		try
		{
		//1) Create Connection
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/tcs","root","rutuja@12345");
		
		//2) Create statement/Query
		Statement stmt=con.createStatement();
		
					//Create Table
					//String s="INSERT INTO EMP VALUES(2337896,'Madhavn','Mumbai')";
		
					//Update record
					String s="Update emp set Id=2337898,Name='Dnyaneshwar',Location='Pune'where id=2337895";
					//Delete Record
					//String s="Delete from emp where id=2337896";
					
					
		stmt.executeUpdate(s);
		System.out.println("Record has Added...");
		}
		catch(SQLIntegrityConstraintViolationException E)
		{
			System.out.println(E);
		}
		//System.out.println("Table has been Created");
		
		
	
	}
}
