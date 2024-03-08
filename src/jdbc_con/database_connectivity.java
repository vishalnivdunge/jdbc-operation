package jdbc_con;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class database_connectivity {

	public static void main(String[] args) throws ClassNotFoundException,SQLException {
		
	
		Class.forName("com.mysql.c.jdbc.Driver");
		
		System.out.println("Driver load succesfully");
		
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vishal" ,"root", "root");
	
	Statement st = con.createStatement();
  
	//st.execute("create table stud(id int primary key,name varchar(25),Age int)");

	//System.out.println("Table created succesfully");
	
st.execute("insert into stud(id,name,Age) values(111,'chirat',111 )");
	System.out.println("Value inserted");
	
	st.execute("update stud set name='vishal' where id=103");
	System.out.println("Value Updated");	
	
	
	st.execute("delete from stud where id=111");
	System.out.println("Record deleted");

	}

}
