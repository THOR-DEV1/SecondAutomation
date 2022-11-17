package demojava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class exception {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/emp", "root", "root");
		Statement st=con.createStatement();
		ResultSet rt=st.executeQuery("select * from employee");
		System.out.println("-----Creditionals-----");
		while(rt.next()) {
			System.out.println(rt.getNString(1)+" "+rt.getNString(2));
		}
		ResultSet rt1=st.executeQuery("select * from entrylogin");
		System.out.println("------LoginDetails-----");
		while(rt1.next()) {
			System.out.println(rt1.getString(1)+" "+rt1.getNString(2)+" "+rt1.getNString(3)+" "+rt1.getNString(4)+" "+rt1.getNString(5));
		}
		con.close();
	} 
}
