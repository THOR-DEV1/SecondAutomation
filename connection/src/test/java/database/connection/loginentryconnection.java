package database.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;


public class loginentryconnection {
	String Url = "jdbc:mysql://localhost:3306/emp";
    String user="root";
    String pass="root";
    Date times=new Date();
	public loginentryconnection connect(String us) throws SQLException, InterruptedException {
		  DriverManager.registerDriver(new com.mysql.jdbc.Driver());
	      //Getting the connection
	      Connection con = DriverManager.getConnection(Url, user, pass);
	      System.out.println("Connection established......");
	      //Creating a Sttement object
	      Statement stmt = con.createStatement();
	      //Inserting values to a table
	      String query = "INSERT INTO entrylogin(loginTIme,username) VALUES (?,?)";
	      //Creating a Prepared Statement object
	      PreparedStatement pstmt = con.prepareStatement(query);
	      pstmt.setString(1,times.toString());
	      pstmt.setString(2,us);
	      pstmt.execute();
	      System.out.println("Action Recorded");
		return this;
		
	}
	public loginentryconnection logout(String time) throws SQLException, InterruptedException {
		  DriverManager.registerDriver(new com.mysql.jdbc.Driver());
	      //Getting the connection
	      Connection con = DriverManager.getConnection(Url, user, pass);
	      System.out.println("Connection established......");
	      //Creating a Sttement object
	      Statement stmt = con.createStatement();
	      //Inserting values to a table
	      String query = "update entrylogin set logoutTIme=? where loginTIme=?";
	      //Creating a Prepared Statement object
	      PreparedStatement pstmt = con.prepareStatement(query);
	      pstmt.setString(1,time);
	      pstmt.setString(2,times.toString());
	      pstmt.execute();
	      System.out.println("Action Record");
		return this;
		
	}
}
