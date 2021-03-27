package com.adactin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class abc {
public static WebDriver driver;
public static void lunch() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\rm21174\\Downloads\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("https://adactinhotelapp.com/");
	driver.manage().window().maximize();
}
	public static void  close()
	{
		driver.close();
	}
	
}
