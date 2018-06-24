package MagFM;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class log4 {
 
	WebDriver driver;
	
	public log4(WebDriver driver)
	{ 
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	/*public log4() {
		// TODO Auto-generated constructor stub
	}*/
	//static log4  lo = new log4();
	
	public void loggi() {
		
		
		
		
	}
	
	/*public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	}
*/
}
