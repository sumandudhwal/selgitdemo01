package Excelpoi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadWriteExcel01 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\sum\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/login");
		driver.findElement(By.name("Email")).sendKeys("sum01@gmail.com");
		driver.findElement(By.name("Password")).sendKeys("sum01@");
		//driver.switchTo().alert().accept();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[value='Log in']")).click();
		
	}

}
