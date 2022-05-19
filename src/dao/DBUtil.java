package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
		// singleton design pattern
		static Connection conn;
			
		static {
			try {
				//step 1
				Class.forName("org.postgresql.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		/*
		// connected to AWS Database
		static Connection makeConnection() throws SQLException {
			//step 2
			String connectionUrl = "jdbc:postgresql://my-project0-db.crv9kmc3fltq.us-east-1.rds.amazonaws.com:5432/bas";
			String userName = "postgres";
			String password = "rootroot";
			if(conn == null) {
				conn = DriverManager.getConnection(connectionUrl, userName, password);	
			}
			return conn;
		}
		*/
		
		  // connected to local database
		static Connection makeConnection() throws SQLException {
			//step 2
			String connectionUrl = "jdbc:postgresql://localhost:5432/bas";
			String userName = "postgres";
			String password = "root";
			if(conn == null) {
				conn = DriverManager.getConnection(connectionUrl, userName, password);	
			}
			return conn;
		}
		
}
