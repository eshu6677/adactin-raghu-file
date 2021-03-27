package com.SR;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import com.RS.Homepage;
import com.RS.SearchHotel;
import com.adactin.abc;
import com.google.common.io.Files;


public class TestScript extends abc {
	private static final String Outputype = null;
@Test
	public  void test() throws Exception {
	Homepage obj=new Homepage();
	SearchHotel obj1=new SearchHotel();
    lunch();
	driver.findElement(obj.usernameTextBox).sendKeys("RameshAdepu");
	driver.findElement(obj.pwdTextBox).sendKeys("ramesh");
	driver.findElement(obj.loginbutton).click();
    new Select(driver.findElement(obj1.Locationlistbox)).selectByVisibleText("Melbourne");
    new Select(driver.findElement(obj1.Locationlistbox)).selectByVisibleText("London");
	new Select(driver.findElement(obj1.Noofrooms)).selectByValue("8");
	driver.findElement(obj1.checkindateText).clear();
	driver.findElement(obj1.checkindateText).sendKeys("12/03/2021");
	driver.findElement(obj1.checkoutdatetext).clear();
	driver.findElement(obj1.checkoutdatetext).sendKeys("13/03/2021");
	new Select(driver.findElement(obj1.AdultsperroomListBox)).selectByVisibleText("3 - Three");
	new Select(driver.findElement(obj1.AdultsperroomListBox)).selectByValue("4");

	driver.findElement(obj1.searchbutton).click();
	Thread.sleep(3000);
	EventFiringWebDriver scr=new EventFiringWebDriver(driver);
	File take=scr.getScreenshotAs(OutputType.FILE);
	File save= new File("C:\\Users\\rm21174\\eclipse-workspace\\adactin\\Screenshot\\abc.jpg");
	Files.move(take, save);
	abc.close();
	}
	
}
