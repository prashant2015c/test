package naukari.Naukari.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Allelements {
	
	/*WebDriver driver;
	public Allelements( WebDriver driver)
	{
	this.driver = driver;
	PageFactory.initElements(driver, this);
	}
*/
	//@FindBy(xpath(""))  /html/body/div[2]/div[2]/ul[1]/li[2]/a/div //  ////div[contains(text() , Recruiters)]
	
	//@FindBy(xpath="//*[contains(@class,'subMenu')]//*[contains(@class,'mTxt')]")
	
	@FindBy(xpath="//a[@href='https://www.naukri.com/recruiters']")
	public WebElement rec ;
		 @FindBy(xpath="//div[@id='geoLocPopUp']//*[@id='block']")
		 public WebElement pop;
}
