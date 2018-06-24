package naukari.Naukari.com;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.Iterator;
import java.util.Set;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.apache.logging.log4j.core.config.Property;
import org.apache.logging.log4j.core.util.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import naukari.Naukari.com.Allelements;

public class Stepdefinition {
	
	static WebDriver driver;
	 //String driver1;
	// CommonUtil comm = new CommonUtil();
	//Allelements Allel ;
	Simpele simple ;
	String logpath = System.getProperty("user.dir")+"\\target\\log4j.properties";
	Logger logg= Logger.getLogger(Stepdefinition.class.getName());
	
	@Given("^Go to the site \"(.*?)\",\"(.*?)\"$")
	public void go_to_the_site(String Driver , String Homepage) throws Throwable {
		/*	for(String spi:Homepage.split("-"))
		{
			System.out.println("Value of xpath===="+spi);
		}*/
	//driver = CommonUtil.getDriver("driver1");// when we don't get data from feature file
		PropertyConfigurator.configure(logpath);
		driver = CommonUtil.getDriver(Driver);// getting data from feature files
		Thread.sleep(2000);	   
	   driver.get(CommonUtil.getproperty(Homepage));  //get(String) then it is necessary to make the method like string in CommonUtil
	   
	   String pagetitle = driver.getTitle();
	   
	   System.out.println("Page Title====" +pagetitle);
	/*   
	  // Allel = new Allelements(driver);
	  
	   Thread.sleep(2000);
	   Actions actt = new Actions(driver);
	  // actt.moveToElement(Allel.rec).build().perform();
	     // Allel.rec.click();
	   //Thread.sleep(10000);
	  // Allel.pop.click();
	*/
	/*   Thread.sleep(2000);
	   String actual= "Jobs - Recruitment - Job Search - Employment - Job Vacancies - Naukri.com";
	  String expected = "Jobs - Recruitment - Job Search - Employment - Job Vacancies - Naukri.com";
	 simple = new Simpele(driver);
	 assertEquals(actual, expected);*/
	 Thread.sleep(2000);
	  driver.findElement(By.cssSelector("body > div.headGNBWrap > div > ul > li:nth-child(2) > a > div")).click();//body > div.headGNBWrap > div > ul > li:nth-child(2) > a > div
	  Thread.sleep(2000);
	//a[@href='https://www.naukri.com/recruiters']
	  //simple.elemethod().click();
	  	   //System.out.println("Element name---"+e);
	  
	   
	   /* String job=null ;
	   Propele pro1 = new Propele();
	 		  
			  pro1.proele(job);
			  pro1.getClass();*/
	   
	  	   
	} 

	@When("^Popup comes handle it$")
	public void popup_comes_handle_it(){
	   // try {
		/*String Fwin =  driver.getWindowHandle();
		
		System.out.println("First window code" + Fwin);
		// set--hashset, list--arraylist, map-hashmap
		Set<String> Owin = driver.getWindowHandles();
		System.out.println("Other window codes" + Owin);
	    Iterator<String> it = Owin.iterator();*/

	  /*  }
	    catch ( Exception e){
	    	
	    }*/
	    //Iterator it = Owin.
	    
	   // String nwin = Owin.iterator()
	   
	 /*   for(String winn : driver.getWindowHandles())
	    {
	    	if (winn != Fwin)
			{
	    	
	    String wintitle = driver.switchTo().window(winn).getTitle();
	    		
	    		System.out.println("New winn title::"+wintitle);
		  // assertTrue(condition);
		    
			} else
			{
				System.out.println("ok");
			}
	    }*/
	    
		   //Allel.rec.click();
	    
	}

	@Then("^close it$")
	public void close_it() throws Throwable {
	   //driver.quit();
	   System.out.println("ok");
	   //driver.findElement(By.xpath("//*a[@href='https://w28.naukri.com/advertiser/bms_hits.php?banner=4262290&othersrcp=']")).click();
	   //driver.quit(); ///html/body/div[1]/div/ul/li[2]/a/span
	}

}
