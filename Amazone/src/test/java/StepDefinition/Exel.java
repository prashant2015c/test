package StepDefinition;


import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.Driver;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Exel  {
	
	WebDriver driver;
	
	  public  Exel ( WebDriver driver)
	  {
		 this.driver = driver ;
		 PageFactory.initElements(driver, this);
		  
	  }
	 
	  
	  /*public int add1 ()
	  {
		  int x=5;
		  int y=7;
		  
		  return( x+y);
	  }
	  
	  public int sub1 ()
	  {
		  int x=5;
		  int y=7;
		  
		  return( x-y);
	  }*/
	  
	  @FindBy(css = "#nav-link-accountList")
		public WebElement loginBtn;
	  
	  public void hov()
	  {
	 
	  }
	 
	  //ChromeDriver  driver =  new ChromeDriver();
	 
 /*
	 public static void main(String []args){
	  
	  try {
	  // Specify the path of file
	  File src=new File("./src/main/sele.xlsx");
	 
	  
	   // load file
	   FileInputStream fis=new FileInputStream(src);
	 
	   // Load workbook
	   XSSFWorkbook wb=new XSSFWorkbook(fis);
	   
	   // Load sheet- Here we are loading first sheetonly
	      XSSFSheet sh1= wb.getSheetAt(0);
	  System.out.println(sh1.getRow(0).getCell(0).getStringCellValue());
	  System.out.println(sh1.getRow(0).getCell(1).getStringCellValue());
	 System.out.println(sh1.getRow(1).getCell(0).getStringCellValue());
	 System.out.println(sh1.getRow(1).getCell(1).getStringCellValue());
	  System.out.println(sh1.getRow(2).getCell(0).getStringCellValue());
	  System.out.println(sh1.getRow(2).getCell(1).getStringCellValue());
	 System.out.println(sh1.getFirstRowNum());
	 
	      for (Iterator<Row> iterator = sh1.iterator(); iterator.hasNext();) 
	      {
	            Row row = (Row) iterator.next();
	            for (Iterator<Cell> iterator2 = row.iterator(); iterator2.hasNext();)
	            {
	                Cell cell = (Cell) iterator2.next();
	                
	                System.out.println(cell.getStringCellValue());              
	            }               
	        }         
	        	      
	  } catch (Exception e) {
	 
	   System.out.println(e.getMessage());
	 
	  }
	  
	 }
	 */
		
	}


