package com.database;

public class Main {
	
	public static void main(String[] args) {
		
		
		String jdbcUrl="jdbc:postgresql://localhost:5432/Demo";
		String username="postgres";
		String password="root";
		
		
		DBFunctions dbFunctions=new DBFunctions();
		dbFunctions.createConnection(jdbcUrl,username,password);
		
	}
}
