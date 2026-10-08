package level3;

import java.sql.*;

public class Database1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("driver accepted");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javats","root","admin");
			System.out.println("connection success");
			//statement to write sql query
			Statement st  =con.createStatement();
			// resultset to store sql data row wise
			ResultSet rs = st.executeQuery("select * from student");
			
			while(rs.next()) {
				System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
				
			}
			rs.close();
			}
	
		
		catch(Exception e)
		{
			System.out.println("Error Reason:"+e.toString());
		}
		

	}

}
