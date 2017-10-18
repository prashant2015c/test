package MagFM;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Sqlse {

	
	
	public Connection connectDB() throws IOException, SQLException, ClassNotFoundException{
		 
		
		try {
			
	    	   Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	    	   
		} catch (Exception e) {
			// TODO: handle exception
		}  
		
		
		// Create a connection with swat database
		//Class.forName("com.mysql.jdbc.Driver");
		
		//String dbURL =getPropertyValue("Swat_Dev_connection");
		
		String dbURL= "jdbc:sqlserver://localhost:1433;databaseName=pr;";
				Connection con=DriverManager.getConnection(dbURL,"sa","123");
    
        return con;
        
        
	}
	
	public ArrayList getkeyID(Connection con,String item,String SelectQuery) throws SQLException, IOException{
			
	        String CUSTOMER_ID = null;
	        String LAST_NAME=null;
	        String CITY = null;
	        Statement smt = con.createStatement();

		    // Now execute the query
		    //System.out.println("query to be executed = "+ SelectQuery+"'"+ item+"'");
	        ResultSet rs = smt.executeQuery("select * from pr");
		    //ResultSet rs= smt.executeQuery(SelectQuery+"'"+item+"'");
		    
		    while (rs.next()) {
		    	
			     CUSTOMER_ID = rs.getString("Id");
				 LAST_NAME= rs.getString("Name");
				 CITY = rs.getString("Addresss");
				String Country = rs.getString("Country");
				System.out.println("CUSTOMER_ID=" + CUSTOMER_ID);
			    System.out.println("LAST_NAME=" + LAST_NAME);
			    System.out.println("CITY=" + CITY);
			    System.out.println("STATE=" + Country);
		    }
	        
			return null;
			
	 }
	
	/*public static void main(String[] args) throws SQLException, Throwable {
		// TODO Auto-generated method stub

		//Sqlse sq = new Sqlse();
		//sq.getkeyID(null, null, null);
		
		//String dbURL =getPropertyValue("Swat_Dev_connection");
				
		   String CUSTOMER_ID = null;
	        String LAST_NAME=null;
	        String CITY = null;
	        Connection con2 = null;
			
	       try {
			
	    	   Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
	    	   
		} catch (Exception e) {
			// TODO: handle exception
		}  
		    // Now execute the query
		    //System.out.println("query to be executed = "+ SelectQuery+"'"+ item+"'");
	        //Class.forName("com.mysql.jdbc.Driver").newInstance();
		 	try
		  {
			  
			  String dbURL= "jdbc:sqlserver://localhost:1433;databaseName=pr;";
			 // String dbURL= "jdbc:sqlserver://HP/SQLSER/pr";
				
			   con2 = DriverManager.getConnection(dbURL,"sa","123");
				Statement smt = con2.createStatement(); 
				ResultSet rs = smt.executeQuery("select * from Test1 ");
			
		    //ResultSet rs= smt.executeQuery(SelectQuery+"'"+item+"'");
		    
		    while (rs.next()) {
		    	
			     CUSTOMER_ID = rs.getString("Id");
				 LAST_NAME= rs.getString("Name");
				 CITY = rs.getString("Addresss");
				String Country = rs.getString("Country");
				System.out.println("CUSTOMER_ID=" + CUSTOMER_ID);
			    System.out.println("LAST_NAME=" + LAST_NAME);
			    System.out.println("CITY=" + CITY);
			    System.out.println("STATE=" + Country);
		    }
			}
		  
		  catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}*/

}
