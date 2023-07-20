package dreamlivetestcase;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonfunction.CommonFunctions;

import org.openqa.selenium.WebDriver;
import pageobjects.banner_management_object;
import pageobjects.loginpageobjects;
import pageobjects.side_menu_handle_object;

public class banner_management extends CommonFunctions{
	
	public void pagefactory() {
	PageFactory.initElements(driver, loginpageobjects.class);
	PageFactory.initElements(driver, banner_management_object.class);
	PageFactory.initElements(driver, side_menu_handle_object.class);
	
	}
	
	@Test
	public void banner_test() {
		pagefactory();
		
		loginpageobjects.username.sendKeys(properties.getProperty("username"));
		loginpageobjects.password.sendKeys(properties.getProperty("password"));
		loginpageobjects.clickloginbutton.click();
		
		//side menu handle
		side_menu_handle_object.dashboardmenu.click();
		side_menu_handle_object.bannermanagementpage.click();
		
		//banner management page
		banner_management_object.uploadbannerimage.click();
		banner_management_object.selecttype.click();
		banner_management_object.selectbanner.click();
		banner_management_object.uploadimagelocal.sendKeys("D:\\diwali1_1670410038359.webp");
		banner_management_object.pageurl.sendKeys("https://www.google.com/");
		banner_management_object.uploadbannerimage.click();

		
		//select type
//		banner_management_object.
	}
	
	

}
