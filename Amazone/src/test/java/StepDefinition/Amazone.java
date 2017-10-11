package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.SkipException;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Amazone {

	
	
	WebDriver driver;
	WebDriverWait wait;
	//Exel ex = new Exel(driver);
	  Exel ex;  
	
	
	@Given("^go to the amzone link$")
	public void go_to_the_amzone_link() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		/*System.out.println(ex.add1());
		 System.out.println(ex.sub1());*/
		System.setProperty("webdriver.chrome.driver", "E:\\pmishra.TIME-INC-CORP\\downloads\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
		
	  
	}

	@When("^click on login button$")
	public void click_on_login_button() throws InterruptedException {
	    // Write code here that turns the phrase above into concrete actions
		
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
		
		//WebElement el = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class = 'nav-action-inner' and contains(text(), 'Sign in')]")));
		//driver.findElement((By.cssSelector("#nav-link-accountList >span.nav-line-1"))).click(); /
		
		
		
		//driver.switchTo().frame(arg0) > span.nav-action-inner
		
		//WebElement ele = driver.findElement(By.cssSelector("#nav-link-accountList"));  //*[@id="nav-flyout-ya-signin"]/a/span  //*[text()='Sign in'] //nav-action-button
		 WebElement ele = driver.findElement(By.cssSelector("#nav-link-accountList")); 
		  Actions action = new Actions(driver);
		   action.moveToElement(ele).build().perform();
		  // ex.hov();
		   Thread.sleep(2000); 
		  driver.findElement((By.cssSelector(".nav-action-inner"))).click(); //.nav-text  .nav-action-inner
		   
		  throw new SkipException("dfrftfgyfyjfjyf");
		   
		//driver.findElement(By.linkText("Your Orders")).click();
		
	    
	}

	@Then("^login page get displayed$")
	public void login_page_get_displayed() throws Throwable {
		//driver.findElement((By.xpath("//a[@class = 'nav-line-1' and contains(text(), 'Sign in')]"))).click();
	}

	@When("^submitting \"([^\"]*)\" and \"([^\"]*)\"$")
	public void submitting_and(String loginid, String password) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		
		driver.findElement(By.id("ap_email")).sendKeys(loginid);
		driver.findElement(By.id("ap_password")).sendKeys(password);
		driver.findElement(By.xpath(".//*[@id='signInSubmit']")).click();
		
	}

	@Then("^main page get displayed$")
	public void main_page_get_displayed()  {
	   
		//*[@id="image-shoveler-ns_E67GCV0PKHAZ906HZJCX_1934_"]/div[2]/div/ul/li[3]/span/a/img
	}

	@Then("^go to department$")
	public void go_to_department() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^click on Amazone video$")
	public void click_on_Amazone_video() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^open video page$")
	public void open_video_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^check more outcomes$")
	public void check_more_outcomes() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
}
