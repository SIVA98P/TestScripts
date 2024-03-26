package irpWebModulePackage;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import Base.Base_class;
import Locators.webModuleElementLocator;

public class CommunityDirectoryWebModule extends Base_class{

	@BeforeSuite
	public void browserLaunch() {
		RequestedBrowserWillBelaunch("chrome");
		maximize();
		RequestedUrlwillBeLaunch("https://e2testing.mycatie.com/ccrc_v2/communityDirectory/");
		roomDetails functionCall = new roomDetails();
		
		functionCall.callRoomDetails();
	}

	//@Test( priority = 1)
	public void validatingTheResidentListDisplayInThePage() throws Exception {
		implicitWait(10);
		
		Thread.sleep(2000);
		webModuleElementLocator locator = new webModuleElementLocator();
		if(locator.getResidentList()!=null) {
			System.out.println("Resident List available");
		}else {
			System.out.println("Resident's List is blank here");
			driver.close();
		}
	}



	//@Test( priority = 2)
	public void ableToViewResidentListInGridAndListMode() throws Exception {
		implicitWait(10);
		boolean gridModeSelected = false;
		boolean listModeSelected = false;

		webModuleElementLocator locator = new webModuleElementLocator();

		Thread.sleep(3000);
		locator.getGridIconButton().click();
		try {
			gridModeSelected = locator.getGridIconButton().isDisplayed();
		}catch(Exception e) {
			System.out.println("Grid locator not found here");
		}

		if(gridModeSelected) {
			int i;
			for (i = 0; i <locator.getResidentListInGridMode().size(); i++) {//Get the Resident List size

				//	Thread.sleep(2000);
				// WebdriverWaitVisible(locator.getResidentList().get(i));
				locator.getResidentListInGridMode().get(i).click();
				locator.getCancelIconResidentList().click();
			}
			locator.getListIconButton().click();//Return to the default list view...
			try {
				listModeSelected = locator.getListIconButton().isDisplayed();
			}catch(Exception e) {
				System.out.println("List locator not found here");
			}
			if(listModeSelected) {
				System.out.println("List View selected");
			}else {
				System.out.println("List view not selected");
			}
		}else {
			System.out.println("Grid Mode Not selected");
		}
	}
//	@Test( priority = 3)
	public void ableToViewEnlargeResidentProfileImg() throws Exception {
		
		webModuleElementLocator locator = new webModuleElementLocator();
		
		int i;
		for (i = 0; i <locator.getResidentList().size(); i++) {//Get the Resident List size
			
			boolean profileImgAvailable = false;
			boolean enlargeDisplay = false;
			
			locator.getResidentList().get(i).click();

			try {
				profileImgAvailable = locator.getAvailableImg().isDisplayed();
				if(profileImgAvailable) {
					System.out.println("Profile Image Available");
					locator.getAvailableImg().click();
					
				}else {
					System.out.println("Dedfault Image available");
					locator.getCancelIconResidentList().click();
				}
			}catch(Exception e) {
				System.out.println("Default Image Locator not found");
			}
			
			try {
				enlargeDisplay = locator.getEnLargedImgDisplay().isDisplayed();
				
				if(enlargeDisplay) {
					System.out.println("Image enLarged");
					Thread.sleep(2000);
					locator.getCloseEnlargeImg().click();
				}else {
					System.out.println("Image not enLarged");
				}
			}catch(Exception e) {
				System.out.println("EnLarged Image locator not found");
			}
			locator.getCancelIconResidentList().click();

		}
	}
	@Test( priority = 4)
	public void ableToAddResidentsToPersonalContact() throws Exception {
		webModuleElementLocator locator = new webModuleElementLocator();
		int i;
		for(i=0; i<locator.getResidentList().size(); i++) {
			
			locator.getResidentList().get(i).click();
			
			boolean addToContactButtonDisplay = false;	
			boolean addedContactPopupMessageDisplaying = false;
			Thread.sleep(3000);
			try {
				addToContactButtonDisplay = locator.getAddToContactButton().isDisplayed();
			} catch (Exception e) {
				System.out.println("Add to contact button Locator not displaying");
			}
			if (addToContactButtonDisplay) {
				
				System.out.println("Add To Contact Option Available");
				Thread.sleep(2000);
				locator.getAddToContactButton().click();
				
				try {
					addedContactPopupMessageDisplaying = locator.getAddToContactPopupMessage().isDisplayed();
					if(addedContactPopupMessageDisplaying) {
						locator.getCloseButton().click();
						locator.getCancelIconResidentList().click();
					}
				}catch(Exception e) {
					System.out.println("Added To Contact success Popup Locator not found");
				}
				
			
			}else {
				
				System.out.println("Add to contact button option is not displaying here,so returning to Community Directory home page");
				Thread.sleep(3000);
				// need to handle intereptedException
				locator.getCancelIconResidentList().click();
			}
		}
	}

	@Test( priority = 5)
	public void ableToIncludeResidentInPersonalInterest() throws Exception {
		webModuleElementLocator locator = new webModuleElementLocator();

		int i;
		for (i = 0; i <locator.getResidentList().size(); i++) {//Get the Resident List size
                                   
			Thread.sleep(2000);
			locator.getResidentList().get(i).click();
			boolean personalInterestEditIconDisplay = false;
			boolean personalInterestEditIconDisplayAgain = false;
			try {
				personalInterestEditIconDisplay = locator.getPersonalInterestEditOption().isDisplayed();

				if(personalInterestEditIconDisplay) {
					System.out.println("Personal Interest option available");
					locator.getPersonalInterestEditOption().click();
					Thread.sleep(2000);
					locator.getAvailablePersonalInterest().click();
					Thread.sleep(2000);
					locator.getPersonalInterestUpdate().click();
					locator.getCloseButton().click();
					try {
						personalInterestEditIconDisplayAgain = locator.getPersonalInterestEditOption().isDisplayed();
					}catch(Exception e) {
						System.out.println("Personal Interest locator not available, after updating");
					}

					if(personalInterestEditIconDisplayAgain) {
						System.out.println("Personal Interest Updated, Edit icon not available");
					}else {
						System.out.println("Personal Interest Still available");
					}
					locator.getCancelIconResidentList().click();

				}else {
					System.out.println("Personal Interest option not Available");
					locator.getCancelIconResidentList().click();
				}
			}catch(Exception e) {
				System.out.println("Personal Interest Edit Locator not found");
			}
		}
	}
	
	@Test( priority = 6)
	public void mailOptionIsDisplayWhenMailIdAvailable() throws Exception {
		
		
		webModuleElementLocator locator = new webModuleElementLocator();
		
		int i;
		for (i = 0; i <locator.getResidentList().size(); i++) {//Get the Resident size
			
			boolean primaryEmail = false;
			boolean secondaryEmail = false;
			boolean thirdEmail = false;
			
			locator.getResidentList().get(i).click();
			
			
			
		}
	}

		// ***********Sorting the Resident List using the Sort By Option*************
	//	@Test( priority = 2)
		public void searchingResident() throws Exception {
			webModuleElementLocator locator = new webModuleElementLocator();
			Thread.sleep(2000);
			locator.getSortByDropDown().click();
			int k;
			for (k = 0; k < locator.getSortByOptionList().size(); k++) {
				Thread.sleep(3000);
				locator.getSortByOptionList().get(k).click();
				
				
			}

			// ****** Searching the Resident's Name Using Search Option ******
			Thread.sleep(2000);
			locator.getSortByDropDown().click();
			locator.getSortByOption().click();
			int j;
			for (j = 0; j < locator.getResidentName().size(); j++) {
				// String name = locator.getResidentName().get(j).getText();
				locator.getSearchBox().sendKeys(locator.getResidentName().get(j).getText());
				Thread.sleep(2000);
				normalClick(locator.getSearchBox());
				robotDelete();

			}

		}
		
		
			
}
