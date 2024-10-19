package com.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBFunctions {

	public void createConnection(String jdbcUrl,String username,String password) {
	
		
		Connection con=null;
		
		try {
			
			Class.forName("org.postgresql.Driver");
			
			con = DriverManager.getConnection(jdbcUrl,username,password);
		
			if(con != null) {
				System.out.println("Connected Succefully");
				
				Statement statement=con.createStatement();
	
//Create Table 				
//				String query= "CREATE TABLE IF NOT EXISTS public.\"test_table\"\n"
//						+ "(\n"
//						+ "    id integer NOT NULL,\n"
//						+ "    name text COLLATE pg_catalog.\"default\",\n"
//						+ "    CONSTRAINT \"test_table_pkey\" PRIMARY KEY (id)\n"
//						+ ")";
//				
//				statement.execute(query);
//				
//				System.out.println("Table Created Success ! ");		
				
				
// Insert Into Table 			
//				String query="INSERT INTO public.test_table(\n"
//						+ "	id, name)\n"
//						+ "	VALUES (?, ?)";
//				
//				PreparedStatement preparedStatement=con.prepareStatement(query);
//				preparedStatement.setInt(1, 2);
//				preparedStatement.setString(2, "Run");
//				
//				int rowEffected=preparedStatement.executeUpdate();
//				
//				System.out.println(rowEffected + " Row Effected");
	
				
				
				
// View Table Data 			
				ResultSet rs=statement.executeQuery("SELECT * FROM test_table");
				
				System.out.println("Id "+"   "+"Name");
				while(rs.next()) {
					System.out.println(rs.getInt("id")+"   "+rs.getString("name"));
				}
		
				
			}else {
				System.out.println("Connection Failde");
			}
				
			
		}
		
		catch (Exception e) {
			System.out.println(e);
		}
		
		
	}
	

}
