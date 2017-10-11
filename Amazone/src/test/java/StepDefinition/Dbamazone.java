package StepDefinition;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.gl.E;

public class Dbamazone {

	 Properties prop;
	 static WebDriver driver;
	
	
	public String getPropertyValue(String key) throws IOException {
		
		prop = new Properties();
	    FileReader reader = new FileReader("./src/main/resources/config/object.properties");
		prop.load(reader);
		String value = prop.getProperty(key);
		return value;
	}
	
	 public void verifyDB(String email){
			
			try{
										
				Class.forName("oracle.jdbc.driver.OracleDriver");
				
				String dbURL = getPropertyValue("Swat_Dev_connection");
				
	            Connection con=DriverManager.getConnection(dbURL,"SWATREAD","SynreadQ1jan!7");
			
				Statement smt = con.createStatement();

				// Now execute the query

				ResultSet rs = smt.executeQuery(getPropertyValue("query")+"'" + email+"'");

				

				// Iterate the result set now

				while (rs.next()) {

					
					String Dbemail= rs.getString("EMAIL");
					System.out.println("Email" + Dbemail);
					

			} 
				}catch (Exception e) {
				
				e.printStackTrace();
			
			}
		}
	
	 public ArrayList getkeyID(Connection con ,String item ,String SelectQuery) throws SQLException, IOException{
			
		 	 
	        String CUSTOMER_ID = null;
	        String LAST_NAME=null;
	        String CITY = null;
	        String STATE = null;
	        String ZIP   = null;
	        String EMAIL_ADDRESS = null;
	        ArrayList<String> customerrecord = new ArrayList<String>();
		    Statement smt = con.createStatement();

		   
		    
		    // Now execute the query
		    System.out.println("query to be executed = "+ SelectQuery+"'"+ item+"'");
		    ResultSet rs= smt.executeQuery(SelectQuery+"'"+item+"'");
		    while (rs.next()) {
		    	
		     CUSTOMER_ID = rs.getString("CUSTOMER_ID");
			 LAST_NAME= rs.getString("LAST_NAME");
			 CITY = rs.getString("CITY");
			 STATE = rs.getString("STATE");
			 ZIP = rs.getString("ZIP");
			 EMAIL_ADDRESS =  rs.getString("EMAIL_ADDRESS");
		     } 
		    
		    System.out.println("CUSTOMER_ID=" + CUSTOMER_ID);
		    System.out.println("LAST_NAME=" + LAST_NAME);
		    System.out.println("CITY=" + CITY);
		    System.out.println("STATE=" + STATE);
		    System.out.println("ZIP=" + ZIP);
		    System.out.println("EMAIL_ADDRESS=" + EMAIL_ADDRESS);
		    
		    customerrecord.add(CUSTOMER_ID);
		    customerrecord.add(LAST_NAME);
		    customerrecord.add(CITY);
		    customerrecord.add(STATE);
		    customerrecord.add(ZIP);
		    customerrecord.add(EMAIL_ADDRESS);
		    return customerrecord;
		}

	public void pras(String pr)
	{
		System.out.println("pasr");
	}
	
	
	public static void main(String[] args) throws SQLException, IOException {
		// TODO Auto-generated method stub
	
		//String email ;
		 
		String item=null, 
					
		SelectQuery= "select * from Table" ;
		
	//Connection con=DriverManager.getConnection(dbURL,"SWATREAD","SynreadQ1jan!7");
		
		
			new Dbamazone().getkeyID(null, item, SelectQuery);
						
		new Dbamazone().verifyDB("prashant1.mishra@birlasoft.com");
	new	Dbamazone().pras(null);
	}	

}
