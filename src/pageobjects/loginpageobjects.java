package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class loginpageobjects {
	
	@FindBy(xpath = "/html/body/div[2]/div[2]/div/div/div[2]/div/form/div[1]/div/div/input")
	public static WebElement username;
	
	@FindBy(id = "myInput")
	public static WebElement password;
	
	@FindBy(xpath = "//button[contains(text(),'Sign in')]")
	public static WebElement clickloginbutton;
	
}
