package javafullstackcourse;

import java.sql.; 

public class JdbcDemo 
{

	public static void main(String[] args) throws Exception{
		
		String url="jdbc:mysql://localhost:3306/######";
		String username="root";
		String password="";
		String query="select empName from employee where empId = 2;";
		
		Class.forName("com.mysql.cj.jdbc.Driver"); 
		Connection con = DriverManager.getConnection(url,username,password); 
		Statement st = con.createStatement();
		
		ResultSet rs = st.executeQuery(query); 
		
		rs.next();
		
		String name= rs.getString("empName");
		System.out.println(name); 
		
		st.close();  
		con.close();  
		
	}

}