package dreamlivetestcase;

import java.util.Properties;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import commonfunction.CommonFunctions;
import pageobjects.loginpageobjects;


public class login_pages extends CommonFunctions {

	
	@Test
	public void login() throws InterruptedException {
		PageFactory.initElements(driver, loginpageobjects.class);
		
		loginpageobjects.username.sendKeys(properties.getProperty("username"));
		loginpageobjects.password.sendKeys(properties.getProperty("password"));
		
		
		loginpageobjects.clickloginbutton.click();
		
		Thread.sleep(5000);
		
		String actualUrl="https://dcms.dreamlive.co.in/Dashboard";
		
		String expectedUrl= driver.getCurrentUrl();
		
		System.out.println(expectedUrl.length());
		
	}

}
