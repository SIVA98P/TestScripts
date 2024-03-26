package irpWebModulePackage;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.html5.LocalStorage;
import org.openqa.selenium.html5.WebStorage;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Base.Base_class;


public class task extends Base_class {
	
	@BeforeSuite
	public void browserlaunch() throws Exception {
		RequestedBrowserWillBelaunch("chrome");
		driver.manage().window().maximize();
		RequestedUrlwillBeLaunch("https://amazon.com");
	}
	@Test
	public void runTask() {
		implicitWait(5000);
		WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
		
		searchbox.sendKeys("iphone 14");
		WebElement searchInput = driver.findElement(By.id("nav-search-submit-button"));
		searchInput.click();
		
		WebElement phone = driver.findElement(By.xpath("(//span[text()='Apple iPhone 14 Plus (128 GB) - Midnight'])[1]"));
		phone.click();
		String parentWindow = driver.getWindowHandle();
		System.out.println(parentWindow);
		Set<String> childWindow = driver.getWindowHandles();
		System.out.println(driver.getTitle());
		
		for(String id: childWindow) {
			System.out.println(id);
			
			if(parentWindow.equals(id)) {
				
			}else {
				driver.switchTo().window(id);
			}
		}

		WebElement rating = driver.findElement(By.id("acrPopover"));
		rating.click();
		
		WebElement starFive = driver.findElement(By.xpath("(//a[@class='a-link-normal s-underline-text s-underline-link-text s-link-style a-text-normal'])[3]/ancestor::div[3]/child::a[@title\"78% of reviews have 5 stars\"]"));
		String totalRating = 	starFive.getText();
		System.out.println("5 Star rating: " +totalRating);
		
		
	}
	
	// ****** Log Out Logic ********

//	locator.getEmployeeCheckInMenuButton().click();
//	functionCall.callRoomDetails();
//
//	int j;
//	for(j=0; j<9; j++) {
//		locator.getKeyPad().get(j).click();
//	}
//	Thread.sleep(2000);
//	locator.getKeyNine().click();
//	Thread.sleep(2000);
//	locator.getSubmitButton().click();
//	
//	boolean logOutButtonDisplay = false;
//	
//	try {
//		logOutButtonDisplay = locator.getLoginButton().isDisplayed();
//	} catch (Exception e) {
//		e.printStackTrace();
//	}
//	if(logOutButtonDisplay) {
//		locator.getLogOutButton().click();
//
//	}else {
//		locator.getLoginButton().click();
//	}
//	if(locator.getActivityLoggedAlertMessage().isDisplayed()) {
//		System.out.println("User Logout");
//		back();
//		back();
//
//	}else {
//		System.out.println("Activity Logged Message not displaying, So page going to refresh");
//		refresh();
//	}
//}else {
//	int i;
//	Thread.sleep(2000);
//	for(i=0; i<8; i++) {
//		locator.getKeyPad().get(i).click();
//	}
//	locator.getKeyNine().click();
//	if(locator.getEmployeeUserName().isDisplayed()) {
//		locator.getLoginButton().click();
//
//	}else {
//		back();
//	}
//	if(locator.getActivityLoggedAlertMessage().isDisplayed()) {
//		back();
//		back();
//	}else {
//		System.out.println("Activity Logged Message not displaying, So page going to refresh");
//		refresh();
//	}

// }
// Same Log Out Logic Written here for handling Loading screen time out.
//		locator.getEmployeeCheckInMenuButton().click();
//		functionCall.callRoomDetails();
//
//		int j1;
//		for(j1=0; j1<8; j1++) {
//			locator.getKeyPad().get(j1).click();
//		}
//		locator.getKeyNine().click();
//		if(locator.getEmployeeUserName().isDisplayed()) {
//			locator.getLogOutButton().click();
//
//		}else {
//			back();
//		}
//		if(locator.getActivityLoggedAlertMessage().isDisplayed()) {
//			System.out.println("User Logout successfully");
//			back();
//			back();
//
//		}else {
//			System.out.println("Activity Logged Message not displaying, So page going to refresh");
//			refresh();
//		}

}
