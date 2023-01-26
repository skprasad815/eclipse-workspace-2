package datadriven;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class mysql {

	public static void main(String[] args) throws Exception {
		String Driver="com.mysql.jdbc.Driver";
		//Connection URL Syntax: "jdbc:mysql://ipaddress:portnumber/db_name"        
        String dbUrl = "jdbc:mysql://localhost:3306/selenium";
        		//"jdbc:mysql://localhost:3036/selenium";                   

        //Database Username     
        String username = "root";   
         
        //Database Password     
        String password = "mysql";             

        //Query to Execute      
        String query = "select *  from emp;";  
         
        //Load mysql jdbc driver 
        Class.forName(Driver);
       
      
        //Create Connection to DB       
        Connection con = DriverManager.getConnection(dbUrl,username,password);
   
        //Create Statement Object       
       Statement stmt = con.createStatement();                  

        // Execute the SQL Query. Store results in ResultSet        
        ResultSet rs= stmt.executeQuery(query);                         
  
        // While Loop to iterate through all data and print results     
        while (rs.next()){
                    String name = rs.getString(1);                                        
                    String design = rs.getString(2); 
                    int sal=rs.getInt(3);
                    System. out.println(name+"    "+design+"     "+sal);     
            }       
         // closing DB Connection       
        con.close();            
}
		
	}


