package ex;
import java.sql.*;
public class stud
{
	public static void main(String args[])throws Exception
	{
        read();
	}
	public static void read()throws Exception
	{
		String url ="jdbc:mysql://localhost:3306/ta" ;
		String userName ="root";
		String password ="Tamil@090";
		String query ="select * from student";
		Connection con = DriverManager.getConnection(url,userName,password);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		while(rs.next())
		{
		System.out.println("ID IS:" + rs.getInt(1));
		System.out.println("Name IS:" + rs.getString(2));
		System.out.println("Gpa IS:" + rs.getFloat(3));
		}
		con.close();
	}
	public static void insert()throws Exception
	{
		String url ="jdbc:mysql://localhost:3306/ta" ;
		String userName ="root";
		String password ="Tamil@090";
		String query ="insert into student";
		Connection con = DriverManager.getConnection(url,userName,password);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		while(rs.next())
		{
		System.out.println("ID IS:" + rs.getInt(1));
		System.out.println("Name IS:" + rs.getString(2));
		System.out.println("Gpa IS:" + rs.getFloat(3));
		}
		con.close();
	}
}