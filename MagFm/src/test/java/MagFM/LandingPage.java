package MagFM;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import Magaz.MagFm.AppTest;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import MagFM.log4;


public class LandingPage 
{
	//Landingpage landing;
	
			WebDriver driver;
			AppTest app = new AppTest();
			Logger log = Logger.getLogger("LandingPage");
			//BasicConfigurator.configure();
			
			//log4 lo = new log4();
			
					
			
	@Given("^Go to the link$")
	public void go_to_the_link() {
		
		BasicConfigurator.configure();
		PropertyConfigurator.configure("Log4j.properties");
	    // Write code here that turns the phrase above into concrete actions
    
		//System.setProperty("webdriver.chrome.driver", "C:\\eclipse\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", "./src/main/resource/Driver/chromedriver.exe");
		
		 driver = new ChromeDriver();
     	
		driver.get("https://staging.magsformiles.com/20002996");
		log.info("driver open");
		//https://staging.magsformiles.com/20003001/
		//https://staging.magsformiles.com/20002746/
		
			
	}
	
	@And("^check all images$")
	public void check_all_images()  {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	
	@And("^check all select buttons$")
	public void check_all_select_buttons()  {
		 
		//driver.manage().window().maximize();
		List<WebElement> listimg = driver.findElements(By.xpath("//*[@class='client-case button-cart button button-primary']"));
		
					//class='client-case-action button-cart button button-primary
				System.out.println("Number of Magazines displaying on a web Page:" +listimg.size());
				
				for (int i = 0 ; i< listimg.size()-10 ; i++)
				{
									 
					                                    //for (WebElement Element : listimg)
					
				    	listimg.get(i).click();
				    	//WebDriverWait wait = new WebDriverWait(driver, TimeSpan.FromSeconds(30));
				        //wait.Until(ExpectedConditions.ElementIsVisible(By.Id("csclose")));

				        //driver.FindElement(By.Id("csclose")).Click();
					
				    /*System.out.println(listimg.get(i).getTagName());
				    System.out.println(listimg.get(i).getText());
				    System.out.println(listimg.get(i).isDisplayed());
				 
				    String link = listimg.get(i).getAttribute("alt");*/
									    
				}
				
				
				 driver.findElement(By.xpath("//*[@id='myform']/div/div/div[4]/div[7]/div/a")).click();
							
				driver.findElement(By.xpath("//*[@id='myform']/div/div/div[4]/div[3]/div/a")).click(); //xpath of alert
				
				
				//System.out.println(driver.findElements(By.xpath("//*[@class='client-case button-cart button button-primary']")).get(3).toString());
				
				
				//listimg.add(3, element);	
				//driver.findElement(By.xpath("//*[@id='myform']/div/div/div[4]/div[3]/div/a")).click(); // xpath of checkout button
				
				
		
				 {
						
					   System.out.println("Number of Magazines displaying on a web Page error:" );
						
				   }
	}


@And("^select two buttons$")
public void select_two_buttons()  {
    // Write code here that turns the phrase above into concrete actions
	
	driver.navigate().to("https://staging.magsformiles.com/20002996");
	
	List<WebElement> listimg = driver.findElements(By.xpath("//*[@class='client-case button-cart button button-primary']"));
	//*[@id="myform"]/div/div/div[4]/div[5]/ul/li[1]/a
	
     
	for (int i = 0 ; i< listimg.size()-38 ; i++)
	{
						 
		                                    //for (WebElement Element : listimg)
		
	    	listimg.get(i).click();
	}
	
	
}

@And("^select checkout button$")
public void select_checkout_button()  {
    // Write code here that turns the phrase above into concrete actions
	 driver.findElement(By.xpath("//*[@id='myform']/div/div/div[4]/div[7]/div/a")).click();
	
}

@And("^enters \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"  \"([^\"]*)\"  \"([^\"]*)\"  \"([^\"]*)\"$")
public void enters(String First_name , String Last_name, String Address1, String City, String State, String zip_code, String Email, String Reference_ID) throws InterruptedException  {
    // Write code here that turns the phrase above into concrete actions
   
	Thread.sleep(5000);
	
	driver.findElement(By.xpath("//*[@id='myform']/input[1]")).sendKeys(First_name);
    driver.findElement(By.xpath("//*[@id='myform']/input[2]")).sendKeys(Last_name);
    driver.findElement(By.xpath("//*[@id='myform']/input[4]")).sendKeys(Address1); //*[@id="myform"]/input[4]
    driver.findElement(By.xpath("//*[@id='myform']/input[6]")).sendKeys(City);//*[@id="myform"]/input[6]
    //driver.findElement(By.name("State")).sendKeys(State);
    Select Sta = new Select(driver.findElement(By.xpath("//*[@id='myform']/div[13]/select"))); //*[@id="myform"]/div[13]/select //*[@id="myform"]/div[13]/select
    Sta.selectByVisibleText(State);
    driver.findElement(By.xpath("//*[@id='myform']/input[7]")).sendKeys(zip_code);//*[@id="myform"]/input[7]
    driver.findElement(By.xpath("//*[@id='myform']/input[8]")).sendKeys(Email);//*[@id="myform"]/input[8]
    
    driver.findElement(By.xpath("//*[@id='myform']/div[20]/input")).sendKeys(Reference_ID);  //*[@id="myform"]/div[20]/input
	
     driver.findElement(By.xpath("html/body/div[2]/div[3]/div[6]/div/a")).click();  
     
     //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
 	//*[@id="myform"]/div/div/div[4]/div[5]/ul/li[1]/a
 	
 	

      //*[@id="myform"]/div[1]/div/div[1]/div[2]/a[1]
 	
 	//List<WebElement> rabsel = driver.findElements(By.xpath("//li[@class='custom-mags renewal-mags million  hundred thousand  thousand  undefinedhundred and four columns']")); //client-case button-cart button button-primary //data-offerpk
	//System.out.println("Rab Mag number=" + rabsel.size());
 	
}
	
 @And("^select magazines from STFpage$")
public void select_magazines_from_STFpage()  {
	
	
	System.out.println("Stf");
 	List<WebElement> listimgstf = driver.findElements(By.xpath("//*[text()='Select']")); //client-case button-cart button button-primary //*[@class='client-case button-cart button button-primary']

	System.out.println("Stf select butt=" + listimgstf.size());
    
 	for (int i = 0 ; i< listimgstf.size()-8 ; i++)
 	{
 						 
 		                                    //for (WebElement Element : listimg)
 		
 	    	listimgstf.get(i).click();
 	}
 	     
 	
	
	//html/body/div[1]/div/div[6]/div[3]/div/a[1] /html/body/div[1]/div/div[6]/div[3]/div/a[1]

    }

@And("^click STFpage submit button$")
public void click_STFpage_submit_button()  {
   
	driver.findElement(By.xpath("html/body/div[1]/div/div[6]/div[3]/div/a[1]")).click(); 
}

@And("^select one RAB magazine$")
public void select_one_RAB_magazine() throws InterruptedException  {
    Thread.sleep(3000);
    
    try
    {
	
	List<WebElement> rabsel = driver.findElements(By.xpath("//*[@class='custom-mags renewal-mags million  hundred thousand  thousand  undefinedhundred and four columns']//*[@class='client-case button-cart button button-primary']")); //client-case button-cart button button-primary //data-offerpk
	System.out.println("Rab Mag number= " + rabsel.size());
	rabsel.get(2).click();
    }
    
    catch (Exception e)
    {
    	System.out.println("NOt found");
    	
    }
    
/*	Vector<WebElement> rab = new Vector();
	rab = (Vector) driver.findElements(By.xpath("//li[@class='custom-mags renewal-mags million  hundred thousand  thousand  undefinedhundred and four columns']"));
		Iterator<WebElement> ite = rab.iterator();
	
	if(ite.hasNext())
	{
	System.out.println("Rab Mag name" + ite.next());
	
	WebElement table = driver.findElement(By.xpath("your path"));
List<WebElement> rows = table.findElements(By.tagName("your tagName"));
java.util.Iterator<WebElement> i = rows.iterator();
while(i.hasNext()) {
    WebElement row = i.next();
    System.out.println(row.getText());
}
	}*/
}

@And("^select three Upsell magazines$")
public void select_three_Upsell_magazines()  {
	
	try
	{
	List<WebElement> upsellbutton = driver.findElements(By.xpath("//*[@class='magazine-list-button']//*[@class='client-case button-cart button button-primary']")); //client-case button-cart button button-primary //data-offerpk
	System.out.println("Upsell Magazine number= " + upsellbutton.size());
	
	upsellbutton.get(5).click();
	upsellbutton.get(8).click();
	upsellbutton.get(10).click();
	}
	 catch (Exception e)
	    {
	    	System.out.println("NOt found");
	    	
	    }

   
}

@Then("^enter \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
public void enter(String creditcard_number, String month, String year)  {
	driver.findElement(By.name("credit_card_number")).sendKeys(creditcard_number);

	
	Select months = new Select(driver.findElement(By.name("credit_card_expiration_month")));
	List<WebElement> e = months.getOptions();
	int itemCount = e.size();

	for(int l = 0; l < itemCount; l++)
	{
	    System.out.println(e.get(l).getText());
	}
	
	months.selectByVisibleText("08");	
	
	Select years = new Select(driver.findElement(By.name("credit_card_expiration_year")));
	years.selectByVisibleText("2020");
	
	driver.findElement(By.xpath("html/body/div[1]/div/div[7]/div[9]/div/a[1]")).click();
	
}

}


