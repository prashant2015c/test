package Magaz.MagFm;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    
	public static void main(String[] args) throws IOException {

        WebDriver driver = new ChromeDriver();
        //driver.get("http://www.google.com"); 
        driver.manage().window().maximize(); 

            FileInputStream file = new FileInputStream(".src/test/java/Magaz.MagFm/selenium.xlsx"); 
            XSSFWorkbook workbook = new XSSFWorkbook(file);
            XSSFSheet sheet = workbook.getSheetAt(0);
            int noOfColumns = sheet.getRow(0).getLastCellNum();
            //System.out.println(noOfColumns);
            String[] Headers = new String[noOfColumns];
            for (int j=0;j<noOfColumns;j++){
                Headers[j] = sheet.getRow(0).getCell(j).getStringCellValue();
            }
                for (int a=0;a<noOfColumns;a++){
                    if(Headers[a].equals("Address")){
                        driver.findElement(By.id("lst-ib")).sendKeys(sheet.getRow(1).getCell(a).getStringCellValue());
                        break;
                        }
}
      //workbook.close();
      file.close();
      driver.close();
      System.exit(0);
	}

  /*  public AppTest(  ) //String testName
    {
        super(  ); //testName
    }
    public void testApp()
    {
        assertTrue( true );
    }*/
}
