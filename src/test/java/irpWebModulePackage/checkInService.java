package irpWebModulePackage;
import org.testng.annotations.Test;
import Base.Base_class;
import Locators.webModuleElementLocator;


public class checkInService extends Base_class {
	@Test(priority = 1)
	public void checkInWebModule() throws InterruptedException {
 
		RequestedBrowserWillBelaunch("chrome");
		maximize();
		RequestedUrlwillBeLaunch("https://e2testing.mycatie.com/ccrc_v2/");

		webModuleElementLocator locator = new webModuleElementLocator();
		roomDetails functionCall = new roomDetails();

		normalClick(locator.getCheckInMenuButton());
		functionCall.callRoomDetails();
		Thread.sleep(2000);
		locator.getCheckInNowButton().click();

		// need to change the logic
		boolean checkInOkButtonDisplay = false;
		Thread.sleep(2000);
		try {
			checkInOkButtonDisplay = locator.getCheckInOkButton().isDisplayed();
		} catch (Exception e) {
			e.printStackTrace();
		}
		if (checkInOkButtonDisplay) {
			System.out.println("User have Checkin for the day");
			back();
		} else if (locator.getCheckInAlreadySent().isDisplayed()) {
			System.out.println(locator.getCheckInAlreadySent().getText());
			back();
			System.out.println("*******");
		} else {
			System.out.println("");
		}
	}
	
	@Test(priority = 2)
	public void employeeCheckInWebModule() throws InterruptedException {

//				RequestedBrowserWillBelaunch("chrome");
//				driver.manage().window().maximize();
//				RequestedUrlwillBeLaunch("https://e2testing.mycatie.com/ccrc_v2/");

		webModuleElementLocator locator = new webModuleElementLocator();
		roomDetails functionCall = new roomDetails();

		locator.getEmployeeCheckInMenuButton().click();
		functionCall.callRoomDetails();

		int i;
		for (i = 0; i < 9; i++) {
			Thread.sleep(2000);
			locator.getKeyPad().get(i).click();

		}
		Thread.sleep(2000);
		locator.getKeyNine().click();
		Thread.sleep(2000);
		locator.getSubmitButton().click();
		boolean loginButtonDisplay = false;
		Thread.sleep(2000);
		try {
			loginButtonDisplay = locator.getLoginButton().isDisplayed();
		} catch (Exception e) {
			System.out.println("Login Button not displaying, User already logged in");
		}

		if (loginButtonDisplay) {
			System.out.println("User LogIn successfully");
			locator.getLoginButton().click();
		} else {
			locator.getLogOutButton().click();
			System.out.println("User Logout successfully");
			back();
			back();

		}
	}


//	@Test(priority = 2)
//	public void communityDirectoryWebModule() throws Exception {
//
//		RequestedBrowserWillBelaunch("chrome");
//		maximize();
//		RequestedUrlwillBeLaunch("https://e2testing.mycatie.com/ccrc_v2/");
//
//		webModuleElementLocator locator = new webModuleElementLocator();
//		roomDetails functionCall = new roomDetails();
//
//		locator.getCommunityDirectoryMenuButton().click();
//		functionCall.callRoomDetails();
//		// *****Viewing the resident details as a Grid mode******
//		Thread.sleep(2000);
//		// locator.getGridIconButton().click();
//		Thread.sleep(2000);
//		int i;
//		for (i = 0; i <= locator.getResidentList().size(); i++) {
//
//			Thread.sleep(5000);
//			// WebdriverWaitVisible(locator.getResidentList().get(i));
//			locator.getResidentList().get(i).click();
//			boolean addContactButton = false;
//			boolean addedContactPopupMessageDisplaying = false;
//			Thread.sleep(3000);
//			try {
//				addContactButton = locator.getAddToContactButton().isDisplayed();
//			} catch (Exception e) {
//				System.out.println("Add to contact button not displaying");
//			}
//
//			if (addContactButton) {
//
//				locator.getAddToContactButton().click();
//				locator.getCloseButton().click();
//				locator.getCancelIconButton();
//			} else {
//				System.out.println(
//						"Add to contact button option is not displaying here,so returning to Community Directory home page");
//				Thread.sleep(10000);
//				// need to handle intereptedException
//				locator.getCancelIconButton();
//			}
//		}
//		// ***********Sorting the Resident List using the Sort By Option*************
//		Thread.sleep(2000);
//		locator.getSortByDropDown().click();
//		int k;
//		for (k = 0; k < locator.getSortByOptionList().size(); k++) {
//			Thread.sleep(3000);
//			locator.getSortByOptionList().get(k).click();
//		}
//
//		// ****** Searching the Resident's Name Using Search Option ******
//		Thread.sleep(2000);
//		locator.getSortByDropDown().click();
//		locator.getSortByOption().click();
//		int j;
//		for (j = 0; j < locator.getResidentName().size(); j++) {
//			// String name = locator.getResidentName().get(j).getText();
//			locator.getSearchBox().sendKeys(locator.getResidentName().get(j).getText());
//			Thread.sleep(2000);
//			normalClick(locator.getSearchBox());
//			robotDelete();
//		}
//
//		Thread.sleep(3000);
//		back();
//		back();
//	}
//
//	@Test(priority = 3)
//	public void diningWebModule() throws InterruptedException {
//
//		RequestedBrowserWillBelaunch("chrome");
//		maximize();
//		RequestedUrlwillBeLaunch("https://e2testing.mycatie.com/ccrc_v2/");
//
//		webModuleElementLocator locator = new webModuleElementLocator();
//		roomDetails functionCall = new roomDetails();
//
//		locator.getDiningServiceMenuButton().click();
//		functionCall.callRoomDetails();
//		Thread.sleep(2000);
//		boolean dataUnavailableMessage = false;
//		// ******Find and Navigate to the Dining Active Event from the Calendar
//		// View*******
//		int i = 0;
//		for (i = 0; i < locator.getDiningActiveEvent().size(); i++) {
//			System.out.println("Dining" + i);
//
//			locator.getDiningActiveEvent().get(i).click();
//			Thread.sleep(2000);
//			try {
//				dataUnavailableMessage = locator.getDataUnavailableMessage().isDisplayed();
//			} catch (Exception e) {
//				System.out.println("Data Unavailable popup not displaying");
//			}
//			if (!dataUnavailableMessage) {
//				Thread.sleep(2000);
//				locator.getRestaurantDropDownButton().click();
//				locator.getHospice().click();
//				locator.getMealTypeDropDownButton().click();
//				// Menu xpath is same for here
//				locator.getHospice().click();
//				// *****Get the menu Item List to add it in the cart list*****
//				int j;
//				for (j = 0; j < locator.getMenuItemList().size(); j++) {
//					System.out.println("Menu" + j);
//					locator.getMenuItemList().get(j).click();
//					// need to handle logic if order not configured for current day
//					boolean customizationOption = false;
//					try {
//						customizationOption = locator.getRareOption().isDisplayed();
//					} catch (Exception e) {
//						System.out.println("Customization option locator not found");
//					}
//					if (customizationOption) {
//						locator.getRareOption().click();
//						locator.getNotesOption().sendKeys("Need Fresh");
//						Thread.sleep(3000);
//						locator.getAddCartButton().click();
//						Thread.sleep(3000);
//						boolean maximumSelectionExceedMessage = false;
//						try {
//							maximumSelectionExceedMessage = locator.getMaximumSelectionExceedMessage().isDisplayed();
//						} catch (Exception e) {
//							System.out.println("MaximumSelectionExceedMessage locator not found");
//						}
//						if (maximumSelectionExceedMessage) {
//							System.out.println("MaximumSelectionExceedMessage found");
//							Thread.sleep(3000);
//							locator.getCloseButton().click();
//							Thread.sleep(3000);
//							locator.getMenuItemCancelIconButton().click();
//							Thread.sleep(3000);
//							locator.getCartIconButton().click();
//							Thread.sleep(3000);
//							locator.getCheckOutButton().click();
//							Thread.sleep(3000);
//							boolean RestaurantDropDownButton = false;
//							try {
//								RestaurantDropDownButton = locator.getRestaurantDropDownButton().isDisplayed();
//							} catch (Exception e) {
//								System.out.println("RestaurantDropDownButton locator not found");
//							}
//							if (RestaurantDropDownButton) {
//								Thread.sleep(3000);
//								locator.getRestaurantDropDownButton().click();
//								Thread.sleep(3000);
//								locator.getSelectAvailableTime().click();
//								Thread.sleep(3000);
//								boolean LocationCheckBox = false;
//								try {
//									LocationCheckBox = locator.getLocationCheckBox().isDisplayed();
//								} catch (Exception e) {
//									System.out.println("LocationCheckBox Button locator not found");
//								}
//								if (LocationCheckBox) {
//									Thread.sleep(3000);
//									locator.getLocationCheckBox().click();
//									Thread.sleep(3000);
//									locator.getPlaceOrderButton().click();
//									Thread.sleep(3000);
//									locator.getCloseButton().click();
//									Thread.sleep(3000);
//									doubleClick(locator.getBackButton());
//									Thread.sleep(3000);
//									boolean PaymentOption = false;
//									try {
//										PaymentOption = locator.getPaymentOption().isDisplayed();
//									} catch (Exception e) {
//										System.out.println("LocationCheckBox Button locator not found");
//									}
//									if (PaymentOption) {
//										// need to add click event for the payment option.locator is missing
//									} else {
//										Thread.sleep(3000);
//										locator.getPlaceOrderButton().click();
//										System.out.println(
//												"Your Ordered Date1, " + locator.getOrderSuccessMessage().getText());
//										Thread.sleep(3000);
//										locator.getCloseButton().click();
//										doubleClick(locator.getBackButton());
//									}
//								} else {
//									Thread.sleep(3000);
//									locator.getPlaceOrderButton().click();
//									// System.out.println("Your Ordered Date12, " +
//									// locator.getOrderSuccessMessage().getText());
//									Thread.sleep(3000);
//									locator.getCloseButton().click();
//									doubleClick(locator.getBackButton());
//								}
//							} else {
//								Thread.sleep(3000);
//								locator.getPlaceOrderButton().click();
//								System.out
//										.println("Your Ordered Date13, " + locator.getOrderSuccessMessage().getText());
//								Thread.sleep(3000);
//								locator.getCloseButton().click();
//								doubleClick(locator.getBackButton());
//							}
//						}
//					} else {
//						Thread.sleep(2000);
//						locator.getMenuItemCancelIconButton().click();
//						back();
//						back();
//					}
//				}
//				back();
//			} else {
//				System.out.println("Dining sheet not uploaded for the current week!");
//				Thread.sleep(3000);
//				locator.getCloseButton().click();
//
//				Thread.sleep(3000);
//				back();
//
//			}
//		}
//
//		// back();
//		// Pending - Edit and delete Order List.
//		// ****** Editing the Dining Order List*****
////		back();
////		back();
//	}
//
//	
//	@Test(priority = 5)
//	public void surveyWebModule() throws InterruptedException {
//
//		RequestedBrowserWillBelaunch("chrome");
//		driver.manage().window().maximize();
//		RequestedUrlwillBeLaunch("https://e2testing.mycatie.com/ccrc_v2/");
//
//		webModuleElementLocator locator = new webModuleElementLocator();
//		roomDetails functionCall = new roomDetails();
//
//		locator.getSurveyMenuButton().click();
//		functionCall.callRoomDetailsForSurvey();
//		boolean takeSurveyButtonDisplay = false;
//		int i = 0, j = 0;
//		Thread.sleep(2000);
//		try {
//			takeSurveyButtonDisplay = locator.getTakeSurveyButton().get(i).isDisplayed();
//		} catch (Exception e) {
//			System.out.println("New Survey locator not found here");
//		}
//
//		// *********Taking Survey for the newly received.*********
//		if (takeSurveyButtonDisplay) {
//			System.out.println("Take Survey Button available");
//
//			while (i <= locator.getTakeSurveyButton().size()) {
//				System.out.println("Available survey Size" + locator.getTakeSurveyButton().size());
//
//				locator.getTakeSurveyButton().get(i).click();
//
//				while (j <= locator.getSurveyOption().size()) {
//
//					System.out.println("Available survey's option Size" + locator.getSurveyOption().size());
//					locator.getSurveyOption().get(j).click();
//
//					boolean openTextFieldDisplay = false;
//					Thread.sleep(2000);
//
//					try {
//						openTextFieldDisplay = locator.getOpenTextField().isDisplayed();
//					} catch (Exception e) {
//						System.out.println("Open Text field locator not found");
//
//					}
//					if (openTextFieldDisplay) {
//
//						System.out.println("Open text field available");
//						locator.getOpenTextField().sendKeys("I need more options");
//						// *********Checking next button is option is displaying*********
//
//						boolean nextButtonDisplay = false;
//						Thread.sleep(2000);
//						try {
//							nextButtonDisplay = locator.getSkipButton().isDisplayed();
//						} catch (Exception e) {
//							System.out.println("Skip button locator not found");
//						}
//
//						if (nextButtonDisplay) {
//							System.out.println("Next Button display");
//							Thread.sleep(2000);
//							locator.getSkipButton().click();
//							Thread.sleep(2000);
//							locator.getSurveyOption().get(j).click();
//						}
//						else {
//						System.out.println("Submit Button display");
//						Thread.sleep(2000);
//						locator.getSurveySubmitButton().click();
//						Thread.sleep(2000);
//						locator.getCloseButton().click();
//					}
//					boolean secondnextButtonDisplay = false;
//					Thread.sleep(2000);
//					try {
//						secondnextButtonDisplay = locator.getSkipButton().isDisplayed();
//					} catch (Exception e) {
//						System.out.println("Skip button locator not found");
//					}
//					if (secondnextButtonDisplay) {
//
//						System.out.println("Again Next Button display");
//						Thread.sleep(2000);
//
//						randomchooser(locator.getSurveyOption());
//						Thread.sleep(2000);
//						locator.getSurveySubmitButton().click();
//						locator.getCloseButton().click();
//					} 
//					else {
//						System.out.println("Submit Button display");
//						Thread.sleep(2000);
//						locator.getSurveySubmitButton().click();
//						Thread.sleep(2000);
//						locator.getCloseButton().click();
//					}
//					}else {
//						System.out.println("Custom option not available here");
//					}
//
//					j++;
//					 if(j == locator.getSurveyOption().size()) {
////						Thread.sleep(2000);
////						randomchooser(locator.getSurveyOption());
//						Thread.sleep(2000);
//						locator.getSurveySubmitButton().click();
//						Thread.sleep(2000);
//						locator.getCloseButton().click();
//						break;
//					 }
//					 
//					 
//				}
//
//				i++;
//
//			}
//
//		} else {
//			// **********ReTaking the Survey....**************
//			System.out.println("No New Survey not available here,So Retaking the Survey");
//			boolean retakingSurveyButtonDisplay = false;
//			Thread.sleep(2000);
//			try {
//				retakingSurveyButtonDisplay = locator.getRetakeSurveyButton().isDisplayed();
//			} catch (Exception e) {
//				System.out.println("Skip button locator not found");
//			}
//			if (retakingSurveyButtonDisplay) {
//				Thread.sleep(2000);
//				locator.getRetakeSurveyButton().click();
//				Thread.sleep(2000);
//				locator.getSkipButton().click();
//				Thread.sleep(2000);
//				locator.getCloseButton().click();
//				//back();
//
//			} 
//			else {
//				System.out.println("Previous Survey not available here,So Redirecting to the Menu Page");
//				back();
//
//			}
//
//		}
//
//	}
//	
//	//@Test(priority = 5)
//	public void bulletinBoardModule() throws InterruptedException {
//		RequestedBrowserWillBelaunch("chrome");
//		driver.manage().window().maximize();
//		RequestedUrlwillBeLaunch("https://e2testing.mycatie.com/ccrc_v2/");
//
//		webModuleElementLocator locator = new webModuleElementLocator();
//		roomDetails functionCall = new roomDetails();
//		
//		functionCall.callRoomDetailsForBulletinBoard();
//
//		
//		
//	}
//	
//	@Test(priority = 6)
//	public void personalContactsModule() throws Exception {
//		RequestedBrowserWillBelaunch("chrome");
//		driver.manage().window().maximize();
//		RequestedUrlwillBeLaunch("https://e2testing.mycatie.com/ccrc_v2/");
//
//		webModuleElementLocator locator = new webModuleElementLocator();
//		roomDetails functionCall = new roomDetails();
//		
//		boolean personalContactsMenuNameDisplay = false;
//		
//		Thread.sleep(2000);
//		
//		try {
//			personalContactsMenuNameDisplay = locator.getPersonalContactsMenuButton().isDisplayed();
//		}catch(Exception e) {
//			System.out.println("Personal Contact Menu name locator not found");
//		}
//		//*****Personal Contact Menu name Checking*********
//		if(personalContactsMenuNameDisplay) {
//			Thread.sleep(2000);
//			locator.getPersonalContactsMenuButton().click();
//			functionCall.callRoomDetails();
//			
//			boolean newContactButtonDisplay = false;
//			Thread.sleep(2000);
//			try {
//				newContactButtonDisplay = locator.getCreateNewContactsButton().isDisplayed();
//			}catch(Exception e) {
//				System.out.println("New Contact button locator not displaying");
//			}
//			if(newContactButtonDisplay) {
//				Thread.sleep(2000);
//				locator.getCreateNewContactsButton().click();
//				Thread.sleep(2000);
//				//WebdriverWaitClickable(locator.getFirstNameField());
//				locator.getFirstNameField().sendKeys("Steve");
//				locator.getLastNameField().sendKeys("Devic");
//				locator.getPhoneNumberField().sendKeys("7489102356");
//				locator.getZipCodeField().sendKeys("631002");
//				
//				boolean addToGroupOption = false;
//				
//				Thread.sleep(2000);
//				try {
//					addToGroupOption = locator.getAddToGroupButton().isDisplayed();
//				}catch(Exception e) {
//					System.out.println("Add to group button locator not found");
//				}
//				
//				if(addToGroupOption) {
//					Thread.sleep(2000);
//					locator.getAddToGroupButton().click();
//					
//					boolean GroupAvailable = false;
//					Thread.sleep(2000);
//					//*****Checking Group is exist or not ******
//					try {
//						GroupAvailable = locator.getGroupAvailable().isDisplayed();
//					}catch(Exception e) {
//						System.out.println("Add to group button locator not found");
//					}
//					if(GroupAvailable) {
//						Thread.sleep(2000);
//						locator.getGroupAvailable().click();
//						Thread.sleep(2000);
//						locator.getSaveToContactButton().click();
//						Thread.sleep(2000);
//						locator.getCloseButton().click();
//					}else {
//						System.out.println("*****"+locator.getNoGroupAvailableTextMessage().getText()+"*******");
//						Thread.sleep(2000);
//						locator.getSaveToContactButton().click();
//						Thread.sleep(2000);
//						locator.getCloseButton().click();
//					}
//				}
//				 	 	
//			}else {
//				System.out.println("New Contact Button not displaying");
//			}
//			
//			//Favorites
//		}else {
//			System.out.println("Personal Contacts Menu Name not available Here");
//		}
//		
//	
//	
//	}


}

