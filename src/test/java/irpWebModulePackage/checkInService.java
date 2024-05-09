package irpWebModulePackage;
import static org.junit.Assert.assertEquals;

import org.testng.annotations.Test;
import Base.Base_class;
import Locators.checkInLocator;

public class checkInService extends Base_class {
	browserLauch launchBrowser = new browserLauch();
	roomDetails functionCall = new roomDetails();
	checkInLocator locator = new checkInLocator(driver);
	
	@Test(description = "Check whether that CheckIn Popup title is available", priority = 1)
	public void isCheckInPopupTitleDisplay() throws InterruptedException {
		//launchBrowser.callingBrowser();
		Thread.sleep(2000);
		locator.getCheckInMenuButton().click();
		functionCall.callRoomDetails("irp_e2test", "9LLY43GTQRGO", "PERCONT");
		Thread.sleep(2000);

		String expectedCheckINPopupTitle = "Check In";
		String actualCheckInPopupTitle = locator.getCheckInPopupTitle().getText();

		assertEquals(expectedCheckINPopupTitle, actualCheckInPopupTitle);
	}

	@Test(description = "Check whether that Check In Now button is displayed", priority = 2)
	public void isCheckInNowButtonDisplay() throws InterruptedException {
		
		String expectedCheckInNowButton = "Check In Now";
		Thread.sleep(2000);
		String actualCheckInNowButton = locator.getCheckInNowButton().getText();

		assertEquals(expectedCheckInNowButton, actualCheckInNowButton);
	}
	@Test(description = "Check whether able to CheckIn for a day", priority = 3)
	public void isAbleToCheckInForTheDay() throws InterruptedException {
		
		// normalClick(locator.getCheckInMenuButton());
		// functionCall.callRoomDetails("irp_e2test", "9LLY43GTQRGO", "PERCONT");
		Thread.sleep(2000);
		locator.getCheckInNowButton().click();

		String expectedCheckInMessageSentPopup = "Check-In message sent.";
		String actualCheckInMessageSentPopup = locator.getCheckInMessageSentPopup().getText();

		assertEquals(expectedCheckInMessageSentPopup, actualCheckInMessageSentPopup);

	}

	@Test(description = "Check whether the CheckIn message already sent popup is displayed", priority = 4)
	public void isCheckInAlreadySentPopupDisplayed() throws InterruptedException {
	
		//normalClick(locator.getCheckInMenuButton());
		//functionCall.callRoomDetails("irp_e2test", "9LLY43GTQRGO", "PERCONT");
		//Thread.sleep(2000);
		//locator.getCheckInNowButton().click();

		String expectedCheckInMessageAlreadySentPopup = "Check-In message already sent";
		String actualCheckInMessageAlreadySentPopup = locator.getCheckInAlreadySent().getText();

		assertEquals(expectedCheckInMessageAlreadySentPopup, actualCheckInMessageAlreadySentPopup);
	}
}

