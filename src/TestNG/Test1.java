package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test1 {
public static WebDriver driver;
	@BeforeClass
	public void lunch() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\rm21174\\Downloads\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
	}
	@Test(priority=1)
	public void Login() {
		driver.findElement(By.id("username")).sendKeys("RameshAdepu");
		driver.findElement(By.id("password")).sendKeys("ramesh");
		driver.findElement(By.id("login")).click();
	}
	@Test(priority=2)
	public void searchHotel(){
		new Select(driver.findElement(By.id("location"))).selectByVisibleText("Sydney");
		new Select(driver.findElement(By.id("hotels"))).selectByVisibleText("Hotel Hervey");
		new Select(driver.findElement(By.id("room_type"))).selectByVisibleText("Standard");  
	    new Select(driver.findElement(By.id("room_nos"))).selectByValue("3");
	 	driver.findElement(By.id("datepick_in")).sendKeys("12/03/2021");
	 	driver.findElement(By.id("datepick_out")).sendKeys("14/03/2021");
	 	new Select(driver.findElement(By.id("adult_room"))).selectByVisibleText("4 - Four");
	 	driver.findElement(By.id("Submit")).click();
		
	}
	
	@Test(priority=3)
	public void logout() {
		driver.findElement(By.linkText("Logout")).click();
	
	}
	@AfterClass
	public void Close(){
		
	driver.close();
	}
	

}


