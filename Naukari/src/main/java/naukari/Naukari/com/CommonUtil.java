package naukari.Naukari.com;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class CommonUtil {

	static WebDriver driver;
	
	//static String driver1;
	
public static WebDriver getDriver(String driver1) throws IOException{
	String st = CommonUtil.getproperty(driver1);
	
	if(st.equalsIgnoreCase("chrome"))
	{
		System.out.println("Chrome value===="+st);
		System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
	}
	else if(st.equalsIgnoreCase("IE"))
	{
		System.setProperty("webdriver.ie.driver", "./Drivers/IEDriverServer.exe");
		 driver = new InternetExplorerDriver();
		
	}
	
	/*	if (driver == null){
			
			System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\chromedriver_win32\\chromedriver.exe");
			driver= new ChromeDriver();
			}*/
		
		return driver;
}

public static String  getproperty(String key) throws IOException
{
	Properties pro = new Properties();
	FileReader reader = new FileReader("./repo/object.properties");
	pro.load(reader);
	
	String value = pro.getProperty(key);

	String[] spl = value.split("-");
	String type = spl[0];
	String mainvalue = spl[1];
	
	System.out.println("Mian value===="+mainvalue);
	return mainvalue;
	}
}








