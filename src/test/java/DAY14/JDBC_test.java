package DAY14;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_test {

	public static void main(String[] args) throws SQLException {
		
		String url="jdbc:mysql://127.0.0.1:3306/aug4_2025";
		String user="root";
		String password="Arshad@2003";
		
		try(Connection con=DriverManager.getConnection(url,user,password))
		{
			System.out.println("Successfully Connected to DB");

			
			String insertSql="INSERT INTO students(id,name,age) VALUES(?,?,?)";
			try(PreparedStatement pstmt=con.prepareStatement(insertSql))
			{
				pstmt.setInt(1, 106);
				pstmt.setString(2, "Riya");
				pstmt.setInt(3, 21);
				
				int rows=pstmt.executeUpdate();
				System.out.println(" Inserted: "+rows);
			}
			catch(SQLException e)
			{
				System.out.println(" Insert Error:");
				e.printStackTrace();
			}
			
			
			String readSql="SELECT * FROM students";
			try(Statement stmt=con.createStatement())
			{
				ResultSet rs=stmt.executeQuery(readSql);
				
				System.out.println("\n Student Table:");
				while(rs.next())
				{
					System.out.println("ID: "+rs.getInt("id"));
					System.out.println("Name: "+rs.getString("name"));
					System.out.println("Age: "+rs.getInt("age"));
					System.out.println("----------");
				}
			}
			catch(SQLException e)
			{
				System.out.println(" Read Error:");
				e.printStackTrace();
			}
			
			
			String updateSql="UPDATE students SET name=? WHERE id=?";
			try(PreparedStatement pstmt1=con.prepareStatement(updateSql))
			{
				pstmt1.setString(1, "UpdatedRiya");
				pstmt1.setInt(2, 106);
				
				int rows=pstmt1.executeUpdate();
				System.out.println(" Updated: "+rows);
			}
			catch(SQLException e)
			{
				System.out.println(" Update Error:");
				e.printStackTrace();
			}
			
			
			String deleteSql="DELETE FROM students WHERE id=?";
			try(PreparedStatement pstmt2=con.prepareStatement(deleteSql))
			{
				pstmt2.setInt(1, 106);
				
				int rows=pstmt2.executeUpdate();
				System.out.println("Deleted: "+rows);
			}
			catch(SQLException e)
			{
				System.out.println("Delete Error:");
				e.printStackTrace();
			}
		}
		catch(SQLException e)
		{
			System.out.println(" Connection Error:");
			e.printStackTrace();
		}
	}
}
