package DAY14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class JDBC_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="jdbc:mysql://127.0.0.1:3306/aug4_2025";
		String user="root";
		String password="Arshad@2003";
		try(Connection con=DriverManager.getConnection(url,user,password))
		{
			System.out.println("Server Successfully Connected");
			String sql1="INSERT INTO Students(id,name,Age) VALUES(?,?,?)";
			try(PreparedStatement stmt=con.prepareStatement(sql1)){
				stmt.setInt(1, 101);
				stmt.setString(2, "Shadab");
				stmt.setString(3, "22");
				int rows=stmt.executeUpdate();
				System.out.println("Inserted row: "+rows);
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}

	}

}
