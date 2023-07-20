package commonfunction;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import net.bytebuddy.implementation.FieldAccessor.PropertyConfigurable;
import pageobjects.banner_management_object;

public class CommonFunctions {

	public static WebDriver driver = null;
	public static Properties properties = null;

	public Properties loadpropertyFile() throws IOException {

		FileInputStream fileinputstream = new FileInputStream("config.properties");
		properties = new Properties();
		properties.load(fileinputstream);
		return properties;

	}

	@BeforeSuite
	public void launchbrowser() throws IOException {
		
		loadpropertyFile();
		
		String browser = properties.getProperty("broWser");
		String url = properties.getProperty("url");
		String driverlocation=properties.getProperty("driverlocation");

		if(browser.equalsIgnoreCase("Chrome")){
			System.setProperty("webdriver.chrome.driver",driverlocation);
			driver = new ChromeDriver();
		}else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("Webdriver.gecko.driver",driverlocation);
			driver = new FirefoxDriver();
		} else if(browser.equalsIgnoreCase("Edge")) {
			System.setProperty("Webdriver.", driverlocation);
		}
		driver.manage().window().maximize();
		driver.get(url);
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		 
		
		 
	}
	

	
	@AfterSuite
	public void closebrowser() {
		
//		driver.quit();

	}
}
