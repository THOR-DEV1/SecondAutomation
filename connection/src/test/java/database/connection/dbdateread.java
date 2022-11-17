package database.connection;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class dbdateread {
       public static ResultSet data(String userName , String passWord) throws ClassNotFoundException, SQLException {
    	   String dbUrl = "jdbc:mysql://localhost:3306/emp";					

   		//Database Username		
   		String username = "root";	
           
   		//Database Password		
   		String password = "root";				

   		//Query to Execute		
   		String query = "select *  from employee;";	
           
    	    //Load mysql jdbc driver		
      	    Class.forName("com.mysql.jdbc.Driver");			
      
      		//Create Connection to DB		
       	Connection con = DriverManager.getConnection(dbUrl,username,password);
     
     		//Create Statement Object		
   	   Statement stmt = con.createStatement();					

   			// Execute the SQL Query. Store results in ResultSet		
    		ResultSet rs= stmt.executeQuery(query);							
    		ArrayList<String> sqlData = new ArrayList<String>(); 
    		// While Loop to iterate through all data and print results		
   		while (rs.next()){
   	        		String user = rs.getString(1);								        
                    String pass = rs.getString(2);
                    sqlData.add(user);
                    sqlData.add(pass);
                    break;
                       		
               }		
   			 // closing DB Connection	
   			return rs;
   			
       
	}

}
