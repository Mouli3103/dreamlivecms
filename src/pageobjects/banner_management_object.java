package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class banner_management_object {

//	@FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[1]")
//	public static WebElement dashboardmenu;
//	
//	@FindBy(xpath = "//body/div[@id='root']/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/*[1]")
//	public static WebElement sidemenumousehover;
//	
//	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/section[1]/div[1]/div[1]/div[2]")
//	public static WebElement dashboadclick;
//	
//	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[1]/div[1]/div[1]/div[1]/section[1]/div[2]/div[3]/a[1]/div[2]")
//	public static WebElement bannermanagementpage;
	
	@FindBy(xpath = "//button[contains(text(),'Upload Image')]")
	public static WebElement uploadbannerimage;
	
	@FindBy(xpath = "//body/div[4]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]")
	public static WebElement selecttype;
	
	@FindBy(id = "react-select-5-option-0")
	public static WebElement selectbanner;
	
	@FindBy(id = "react-select-5-option-1")
	public static WebElement selectevent;
	
	@FindBy(id = "react-select-5-option-2")
	public static WebElement selectwallet;
	
	@FindBy(id = "react-select-5-option-3")
	public static WebElement selectannouncement;
	
	@FindBy(xpath = "//input[@id='formFile']")
	public static WebElement uploadimagelocal;
	
	
	@FindBy(id = "formBasicPassword")
	public static WebElement pageurl;
	
	@FindBy(xpath = "//body/div[4]/div[1]/div[1]/form[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[1]/div[2]/*[1]")
	public static WebElement allcountrydeselect;
	
	@FindBy(xpath = "//body/div[4]/div[1]/div[1]/form[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]")
	public static WebElement clickcountrydropdown;
	
	@FindBy(xpath = "react-select-6-option-98")
	public static WebElement selectcountryindia;
	
	@FindBy(id = "formBasicPassword")
	public static WebElement countryinclude_exclude;
	
	@FindBy(xpath = "//body/div[4]/div[1]/div[1]/form[1]/div[1]/div[5]/select[1]/option[3]")
	public static WebElement includecountry;
	
	@FindBy(xpath = "//body/div[4]/div[1]/div[1]/form[1]/div[1]/div[5]/select[1]/option[2]")
	public static WebElement excludecountry;
	
	@FindBy(xpath = "//body/div[@id='root']/div[1]/div[2]/main[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]")
	public static WebElement select_type_fetch;
	
	@FindBy(id = "react-select-2-option-0")
	public static WebElement selectall;
	
	@FindBy(id = "react-select-2-option-1")
	public static WebElement select_banner_fetch;
	
	@FindBy(id = "react-select-2-option-2")
	public static WebElement select_event_fetch;
	
	@FindBy(id = "react-select-2-option-3")
	public static WebElement select_waller_fecth;
	
	
	
	
	
}
