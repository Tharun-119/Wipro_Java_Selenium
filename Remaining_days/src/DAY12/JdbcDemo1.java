package DAY12;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;

// 1. We need to import a package 
// 2. Load and register the driver  -> com.mysql.jdbc.driver
// 3. Establish the connection 
// 4. Create the statement 
// 5. Execute the Query 
// 6. Process results 
// 7. Close the connection 

public class JdbcDemo1
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		String url = "jdbc:mysql://localhost:3306/ecommerce";
		String userName = "root"; 
		String pwd = "Naveen@1503"; 
		//String query= "SELECT * FROM users LIMIT 1";
		String query = "SELECT * FROM users LIMIT 1 OFFSET 2";
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,userName,pwd);
		Statement stmt = con.createStatement();
	//	stmt.executeQuery("SELECT * FROM users"); 
		ResultSet rs = stmt.executeQuery(query);
		
		while(rs.next())
		{
		    int user_id = rs.getInt("user_id");
			String email = rs.getString("email");
			String password = rs.getString("password");
			String name = rs.getString("username");
			// System.out.println("Id: "+ id +"Name: " + name + " Email: " + email);
			
			System.out.println("Name: " + name + "\nEmail: " + email + "\nPassword: " + password);
		}
		stmt.close();
		con.close();
		
		
	}
}