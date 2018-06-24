package naukari.Naukari.com;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Propele {
	public String  proele(String b) throws IOException
	{
		Properties profile1 = new Properties();
		FileReader fileread = new FileReader("./repo/object.properties");
		profile1.load(fileread);
		
		String a = profile1.getProperty(b);
		return a;
	}

}
