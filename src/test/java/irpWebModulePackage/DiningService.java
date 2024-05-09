package irpWebModulePackage;

import org.testng.annotations.Test;

import Base.Base_class;
import Locators.webModuleElementLocator;

public class DiningService extends Base_class{
	@Test
	public void diningWebModule() throws InterruptedException {

		RequestedBrowserWillBelaunch("chrome");
		maximize();
		RequestedUrlwillBeLaunch("https://e2testing.mycatie.com/ccrc_v2/");

		webModuleElementLocator locator = new webModuleElementLocator();
		roomDetails functionCall = new roomDetails();

		locator.getDiningServiceMenuButton().click();
		functionCall.callRoomDetails("irp_e2test", "9LLY43GTQRGO", "PERCONT");
		Thread.sleep(2000);
		boolean dataUnavailableMessage = false;
		// ******Find and Navigate to the Dining Active Event from the Calendar
		// View*******
		int i = 0;
		for (i = 0; i < locator.getDiningActiveEvent().size(); i++) {
			System.out.println("Dining" + i);

			locator.getDiningActiveEvent().get(i).click();
			Thread.sleep(2000);
			try {
				dataUnavailableMessage = locator.getDataUnavailableMessage().isDisplayed();
			} catch (Exception e) {
				System.out.println("Data Unavailable popup not displaying");
			}
			if (!dataUnavailableMessage) {
				Thread.sleep(2000);
				locator.getRestaurantDropDownButton().click();
				locator.getHospice().click();
				locator.getMealTypeDropDownButton().click();
				// Menu xpath is same for here
				locator.getHospice().click();
				// *****Get the menu Item List to add it in the cart list*****
				int j;
				for (j = 0; j < locator.getMenuItemList().size(); j++) {
					System.out.println("Menu" + j);
					locator.getMenuItemList().get(j).click();
					// need to handle logic if order not configured for current day
					boolean customizationOption = false;
					try {
						customizationOption = locator.getRareOption().isDisplayed();
					} catch (Exception e) {
						System.out.println("Customization option locator not found");
					}
					if (customizationOption) {
						locator.getRareOption().click();
						locator.getNotesOption().sendKeys("Need Fresh");
						Thread.sleep(3000);
						locator.getAddCartButton().click();
						Thread.sleep(3000);
						boolean maximumSelectionExceedMessage = false;
						try {
							maximumSelectionExceedMessage = locator.getMaximumSelectionExceedMessage().isDisplayed();
						} catch (Exception e) {
							System.out.println("MaximumSelectionExceedMessage locator not found");
						}
						if (maximumSelectionExceedMessage) {
							System.out.println("MaximumSelectionExceedMessage found");
							Thread.sleep(3000);
							locator.getCloseButton().click();
							Thread.sleep(3000);
							locator.getMenuItemCancelIconButton().click();
							Thread.sleep(3000);
							locator.getCartIconButton().click();
							Thread.sleep(3000);
							locator.getCheckOutButton().click();
							Thread.sleep(3000);
							boolean RestaurantDropDownButton = false;
							try {
								RestaurantDropDownButton = locator.getRestaurantDropDownButton().isDisplayed();
							} catch (Exception e) {
								System.out.println("RestaurantDropDownButton locator not found");
							}
							if (RestaurantDropDownButton) {
								Thread.sleep(3000);
								locator.getRestaurantDropDownButton().click();
								Thread.sleep(3000);
								locator.getSelectAvailableTime().click();
								Thread.sleep(3000);
								boolean LocationCheckBox = false;
								try {
									LocationCheckBox = locator.getLocationCheckBox().isDisplayed();
								} catch (Exception e) {
									System.out.println("LocationCheckBox Button locator not found");
								}
								if (LocationCheckBox) {
									Thread.sleep(3000);
									locator.getLocationCheckBox().click();
									Thread.sleep(3000);
									locator.getPlaceOrderButton().click();
									Thread.sleep(3000);
									locator.getCloseButton().click();
									Thread.sleep(3000);
									doubleClick(locator.getBackButton());
									Thread.sleep(3000);
									boolean PaymentOption = false;
									try {
										PaymentOption = locator.getPaymentOption().isDisplayed();
									} catch (Exception e) {
										System.out.println("LocationCheckBox Button locator not found");
									}
									if (PaymentOption) {
										// need to add click event for the payment option.locator is missing
									} else {
										Thread.sleep(3000);
										locator.getPlaceOrderButton().click();
										System.out.println(
												"Your Ordered Date1, " + locator.getOrderSuccessMessage().getText());
										Thread.sleep(3000);
										locator.getCloseButton().click();
										doubleClick(locator.getBackButton());
									}
								} else {
									Thread.sleep(3000);
									locator.getPlaceOrderButton().click();
									// System.out.println("Your Ordered Date12, " +
									// locator.getOrderSuccessMessage().getText());
									Thread.sleep(3000);
									locator.getCloseButton().click();
									doubleClick(locator.getBackButton());
								}
							} else {
								Thread.sleep(3000);
								locator.getPlaceOrderButton().click();
								System.out
										.println("Your Ordered Date13, " + locator.getOrderSuccessMessage().getText());
								Thread.sleep(3000);
								locator.getCloseButton().click();
								doubleClick(locator.getBackButton());
							}
						}
					} else {
						Thread.sleep(2000);
						locator.getMenuItemCancelIconButton().click();
						back();
						back();
					}
				}
				back();
			} else {
				System.out.println("Dining sheet not uploaded for the current week!");
				Thread.sleep(3000);
				locator.getCloseButton().click();

				Thread.sleep(3000);
				back();

			}
		}

		// back();
		// Pending - Edit and delete Order List.
		// ****** Editing the Dining Order List*****
//		back();
//		back();
	}
}
