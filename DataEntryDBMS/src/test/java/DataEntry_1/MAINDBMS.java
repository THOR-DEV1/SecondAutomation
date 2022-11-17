package DataEntry_1;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import excel.excelreader;
public class MAINDBMS {
	String Url = "jdbc:mysql://localhost:3306/PolicyDB1_0";
    String user="root";
    String pass="root";
	public MAINDBMS logout(String PolicyHoldername,String PolicyNum,double InsuranceAmount,String Address) throws SQLException, InterruptedException {
		  DriverManager.registerDriver(new com.mysql.jdbc.Driver());
	      //Getting the connection
	      Connection con = DriverManager.getConnection(Url, user, pass);
	      System.out.println("Connection established......");
	      //Creating a Sttement object
	      Statement stmt = con.createStatement();
	      //Inserting values to a table
	      String query = "insert into policyholderdata(PolicyHoldername,PolicyNum,InsuranceAmount,Address)values(?,?,?,?)";
	      //Creating a Prepared Statement object
	      PreparedStatement pstmt = con.prepareStatement(query);
	      pstmt.setString(1,PolicyHoldername);
//	      pstmt.setString(2,PolicyType);
	      pstmt.setString(2,PolicyNum);
	      pstmt.setDouble(3, InsuranceAmount);
	      pstmt.setString(4,Address);
	      pstmt.execute();
	      System.out.println("Action Record");
		return this;
		
	}

	public static void main(String[] args) throws SQLException, InterruptedException, IOException {
		MAINDBMS db=new MAINDBMS();
		excelreader ex=new excelreader();
		int i=ex.totalCell();
		for(int j=1;j<=i;j++) {
		db.logout(ex.PolicyHoldername(j), ex.PolicyNum(j), ex.InsuranceAmount(j), ex.Address(j));
		}

	}

}
