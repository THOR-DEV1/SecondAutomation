package connection2_0;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class dbconnection {
public static ResultSet data(String un,String pw) throws ClassNotFoundException, SQLException {
	String url="jdbc:mysql://localhost:3306/emp";
	String user="root";
	String pass="root";
	String query="Select * from employee";
	Class.forName("com.mydsql.jdbc.driver");
	Connection cn=DriverManager.getConnection(url,user,pass);
	Statement st=cn.createStatement();
	ResultSet rs=st.executeQuery(query);
	ArrayList <String> ss=new ArrayList<String>();
	while(rs.next()) {
		String us=rs.getString(1);
		String pw1=rs.getString(2);
		ss.add(us);
		ss.add(pw1);
		break;
	}
	return rs;
	
}
}
