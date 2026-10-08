package level3;
import java.sql.*;
import java.util.Scanner;

public class Database2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("driver accepted");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javats","root","admin");
			System.out.println("connection success");
			//statement to write sql query
			Statement st  =con.createStatement();
			System.out.println("enter rno , student name and mark:");
			int rno=scan.nextInt();
			String sname=scan.next();
			float mark = scan.nextFloat();
			int Result = st.executeUpdate("insert into student values("+rno+",'"+sname+"',"+mark+")");
			if (Result>0)
			{
				System.out.println("record inserted successfully ");
			}
			else
			{
				System.out.println("no records inserted");
			}
			
			
			
			
			
			st.close();con.close();
			}
	
		
		catch(Exception e)
		{
			System.out.println("Error Reason:"+e.toString());
		}
		

	}

}
