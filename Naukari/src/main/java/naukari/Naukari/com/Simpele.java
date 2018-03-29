package naukari.Naukari.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class Simpele {
	
	WebDriver driver; //defined global variable which will apply for all methods
	public Simpele(WebDriver driver ) {
		// TODO Auto-generated constructor stub
		
		this.driver = driver;
		//PageFactory.initElements(driver, this);
	}
 
	public WebElement elemethod()
	{
		
	WebElement el= driver.findElement(By.xpath("//a[@href='https://www.naukri.com/recruiters']"));
	//String ell = el.toString();
		return el;
	}
}
