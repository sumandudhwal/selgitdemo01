package Excelpoi;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoopExcel {

	   WebDriver driver;
			FileInputStream FRead;
			FileOutputStream FWrite;
			XSSFWorkbook wb;
			
			XSSFSheet sh;
			String d1,d2,login,pwd,wbmsg,xlmsg;
			int rowval;
			String pass="Test is passed";
			String fail="Test is failed";
			int rowcount;

     
		
	  @Test
	  public void f() throws Exception {
	
		  for(rowval=1;rowval<rowcount;rowval++)
		  {
			  login=sh.getRow(rowval).getCell(0).getStringCellValue();
			  pwd=sh.getRow(rowval).getCell(1).getStringCellValue();
			  xlmsg=sh.getRow(rowval).getCell(2).getStringCellValue();
		  
		  
		  driver.get("http://demowebshop.tricentis.com/login");
			driver.findElement(By.name("Email")).sendKeys(login);
			driver.findElement(By.name("Password")).sendKeys(pwd);
			driver.findElement(By.cssSelector("input[value='Log in']")).click();
			Thread.sleep(1000);
			wbmsg=driver.findElement(By.cssSelector("a.account")).getText();
			System.out.println(wbmsg);
			System.out.println("Login id is " +login);
			
			driver.findElement(By.linkText("Log out")).click();
			  Thread.sleep(2000);
			  FWrite=new FileOutputStream("C:\\Users\\n.a.pasupuleti\\Downloads\\ReadWrite.xlsx");
			  sh.getRow(rowval).createCell(3).setCellValue(wbmsg);
			  
			  if(wbmsg.equals(xlmsg))
			  {
				  System.out.println(pass);
				  sh.getRow(rowval).createCell(4).setCellValue(pass);
			  }
			  else
			  {
				  System.out.println(fail);
				  sh.getRow(rowval).createCell(4).setCellValue(fail);
			  }
			  wb.write(FWrite);
			
		  }  
	  }
	  @BeforeTest
	  public void beforeTest() throws InvalidFormatException, IOException {
		  System.setProperty("webdriver.chrome.driver", "C:\\sum\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
				  FRead=new FileInputStream("C:\\Users\\n.a.pasupuleti\\Downloads\\ReadWrite.xlsx");
		  wb=new XSSFWorkbook(FRead);
		  sh=wb.getSheetAt(0);
		  d1=sh.getRow(0).getCell(0).getStringCellValue();
		  d2=sh.getRow(0).getCell(1).getStringCellValue();
		  rowcount=sh.getPhysicalNumberOfRows();
		  
	  }
	  
	  @BeforeMethod
	  public void beforeMethod() {
		
	  }
	  @AfterTest
	  public void afterTest() throws Exception{
		  Thread.sleep(2000);
		  driver.close();
		  wb.close();
	  }
	  
	  @AfterMethod
	  public void afterMethod() throws Exception {
		  
		  
	  }

	}
