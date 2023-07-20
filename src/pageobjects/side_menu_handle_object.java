package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class side_menu_handle_object {

	@FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]")
	public static WebElement dashboardmenu;
	
	@FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/*[1]")
	public static WebElement sidemenumousehover;
	
	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[2]")
	public static WebElement dashboadclick;
	
	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/section[1]/div[2]/div[3]/a[1]/div[2]")
	public static WebElement bannermanagementpage;
	
	@FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/section[1]/div[2]")
	public static WebElement host_managementsidemenu;
}