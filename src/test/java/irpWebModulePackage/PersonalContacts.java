package irpWebModulePackage;

import static org.testng.Assert.assertTrue;
import java.awt.AWTException;
import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;
import Base.Base_class;
import Locators.webModuleElementLocator;
public class PersonalContacts extends Base_class {
	roomDetails functionCall = new roomDetails();

	@Test(priority = 1)
	public void creatingpersonalContactProfile() throws Exception {

		RequestedBrowserWillBelaunch("chrome");
		driver.manage().window().maximize();
		RequestedUrlwillBeLaunch("https://e2testing.mycatie.com/ccrc_v2/personalContacts/");

		webModuleElementLocator locator = new webModuleElementLocator();
		functionCall.callRoomDetails();

		boolean newContactButtonDisplay = false;
		Thread.sleep(2000);
		try {
			newContactButtonDisplay = locator.getCreateNewContactsButton().isDisplayed();
		}catch(Exception e) {
			System.out.println("New Contact button locator not displaying");
		}
		if(newContactButtonDisplay) {
			Thread.sleep(2000);
			locator.getCreateNewContactsButton().click();
			Thread.sleep(2000);
			//WebdriverWaitClickable(locator.getFirstNameField());
			locator.getFirstNameField().sendKeys("Steve");
			locator.getLastNameField().sendKeys("Devic");
			locator.getPhoneNumberField().sendKeys("7489102356");
			locator.getZipCodeField().sendKeys("631002");

			boolean addToGroupOption = false;

			Thread.sleep(2000);
			try {
				addToGroupOption = locator.getAddToGroupButton().isDisplayed();
			}catch(Exception e) {
				System.out.println("Add to group button locator not found");
			}

			if(addToGroupOption) {
				Thread.sleep(2000);
				locator.getAddToGroupButton().click();

				boolean GroupAvailable = false;
				Thread.sleep(2000);
				//*****Checking Group is exist or not ******
				try {
					GroupAvailable = locator.getGroupAvailable().isDisplayed();
				}catch(Exception e) {
					System.out.println("Add to group button locator not found");
				}
				if(GroupAvailable) {
					Thread.sleep(2000);
					locator.getGroupAvailable().click();
					Thread.sleep(2000);
					locator.getSaveToContactButton().click();
					Thread.sleep(2000);
					locator.getCloseButton().click();
				}else {
					System.out.println("*****"+locator.getNoGroupAvailableTextMessage().getText()+"*******");
					Thread.sleep(2000);
					locator.getSaveToContactButton().click();
					Thread.sleep(2000);
					locator.getCloseButton().click();
				}
			}

		}else {
			System.out.println("New Contact Button not displaying");
		}

		// Favorites
	}

	@Test(priority = 2)
	public void shouldAbleToCreateFavouritesProfile() throws InterruptedException {
		
		String CreateContactFirstnameField = "Aravind";
		String CreateContactLastnameField = "Srinivasan";
		String CreateContactPhonenumberField = "04422673189";
		String CreateContactMobilenumberField = "9632014578";
		String CreateContactEmailAddress = "aravind123@gmail.com";
		String CreateContactAddressField = "Flat w, kanguva flats erode main road erode 644012";
		String CreateContactCityStateZipField = "erode";
		String CreateContactSecondphoneField = "8844774411";
		String CreateContactSecondmobileField = "7354784120";
		String CreateContactSecondEmailAddress = "aravind4785@gmail.com";
		String CreateContactThirdEmailAddress = "aravind2564@gmail.com";
		String CreateContactJobtitleField = "Form";
		String CreateContactDepartmentField = "ECE";

		webModuleElementLocator locator = new webModuleElementLocator();

		Thread.sleep(2000);
		locator.getClickFavouritesMenu().click();
		Thread.sleep(3000);
		locator.getClicknewcontact().click();
		sendkeys(locator.getCreateContactFirstnameField(), CreateContactFirstnameField);
		sendkeys(locator.getCreateContactLastnameField(), CreateContactLastnameField);
		locator.getCreateContactRelationshipsField().click();
		Thread.sleep(2000);
		locator.getCreateContactRelationshipDropdownField().click();
		sendkeys(locator.getCreateContactPhonenumberField(), CreateContactPhonenumberField);
		sendkeys(locator.getCreateContactMobilenumberField(), CreateContactMobilenumberField);
		sendkeys(locator.getCreateContactEmailAddress(), CreateContactEmailAddress);
		Thread.sleep(2000);
		sendkeys(locator.getCreateContactAddressField(), CreateContactAddressField);
		sendkeys(locator.getCreateContactCityStateZipField(), CreateContactCityStateZipField);
		sendkeys(locator.getCreateContactSecondphoneField(), CreateContactSecondphoneField);
		Thread.sleep(5000);
		sendkeys(locator.getCreateContactSecondmobileField(), CreateContactSecondmobileField);
		sendkeys(locator.getCreateContactSecondemailField(), CreateContactSecondEmailAddress);
		sendkeys(locator.getCreateContactThirdemailField(), CreateContactThirdEmailAddress);
		Thread.sleep(3000);
		sendkeys(locator.getCreateContactJobtitleField(), CreateContactJobtitleField);
		sendkeys(locator.getCreateContactDepartmentField(), CreateContactDepartmentField);
		locator.getAddToGroupButton().click();
		Thread.sleep(3000);
		locator.getCreateContactSaveContactbtn().click();

		Thread.sleep(3000);

		assertTrue(locator.getCreateContactSuccessMessage().isDisplayed());
		Thread.sleep(3000);
		locator.getCloseButton().click();
		
	}

	@Test(priority = 3)
	public void shouldErrorThrownWhenUserSubmitWithoutFirstNameLastName() throws InterruptedException {
		String expectedMessage = "First name or Last name is required";

		webModuleElementLocator locator = new webModuleElementLocator();
		Thread.sleep(3000);
		locator.getClicknewcontact().click();
		Thread.sleep(2000);
		locator.getCreateContactSaveContactbtn().click();
		Assert.assertEquals(locator.getChooseCustomizationToContinuePopup().getText(), expectedMessage);
		Thread.sleep(3000);
		locator.getCloseButton().click();

	}

	@Test(priority = 4)
	public void shouldAbleToCreateContactWithoutPhoneNumberEmailAddress() throws InterruptedException {
		// String expectedMessage = "Phone Number or Email-ID is required";
		String createContactFirstnameField = "Aravind";
		String createContactLastnameField = "Srinivasan";

		webModuleElementLocator locator = new webModuleElementLocator();
		Thread.sleep(3000);
		sendkeys(locator.getCreateContactFirstnameField(), createContactFirstnameField);
		sendkeys(locator.getCreateContactLastnameField(), createContactLastnameField);
		Thread.sleep(2000);
		locator.getCreateContactSaveContactbtn().click();

		// Assert.assertEquals(locator.getChooseCustomizationToContinuePopup().getText(),
		// expectedMessage);
		Thread.sleep(3000);
		locator.getCloseButton().click();;

	}

	@Test(priority = 5)
	public void shouldErrorThrownWhenReachingMaximumCharacter() throws InterruptedException {
		boolean errorMessageForCityStateField = false;
		String expectedErrorMessage = "Only 30 characters allowed";
		String expectedErrorMessageForAddress = "Only 50 characters allowed";
		webModuleElementLocator locator = new webModuleElementLocator();
		Thread.sleep(3000);
		locator.getClicknewcontact().click();
		Thread.sleep(2000);
		locator.getFirstNameField().sendKeys("SteveJohnPersonalContactNameinCATIE");
		Assert.assertEquals(locator.getMaximumCharacterReached().getText(), expectedErrorMessage);
		Thread.sleep(2000);
		locator.getCloseButton().click();

		locator.getLastNameField().sendKeys("SteveJohnPersonalContactNameinCATIE");
		Assert.assertEquals(locator.getMaximumCharacterReached().getText(), expectedErrorMessage);
		Thread.sleep(2000);
		locator.getCloseButton().click();
		locator.getPhoneNumberField().sendKeys("3222222222222222223233223434323");
		Assert.assertEquals(locator.getMaximumCharacterReached().getText(), expectedErrorMessage);
		Thread.sleep(2000);
		locator.getCloseButton().click();
		locator.getCreateContactMobilenumberField().sendKeys("3222222222222222223233223434323");
		Assert.assertEquals(locator.getMaximumCharacterReached().getText(), expectedErrorMessage);
		locator.getCloseButton().click();
		locator.getCreateContactEmailAddress().sendKeys("SteveJohnPersonal@e2infosystems.com");
		Assert.assertEquals(locator.getMaximumCharacterReached().getText(), expectedErrorMessage);
		Thread.sleep(2000);
		locator.getCloseButton().click();
		locator.getCreateContactAddressField().sendKeys("Flat w, kanguva flats erode main road erode 6440128787787");

		Assert.assertEquals(locator.getMaximumCharacterFiftyReached().getText(), expectedErrorMessageForAddress);
		locator.getCloseButton().click();
		Thread.sleep(2000);
		locator.getCreateContactSecondphoneField().sendKeys("3222222222222222223233223434323");
		Assert.assertEquals(locator.getMaximumCharacterReached().getText(), expectedErrorMessage);
		Thread.sleep(2000);
		locator.getCloseButton().click();
		locator.getCreateContactSecondmobileField().sendKeys("90230239239049023023223232323345345345345");
		Assert.assertEquals(locator.getMaximumCharacterReached().getText(), expectedErrorMessage);
		locator.getCloseButton().click();
		Thread.sleep(2000);
		locator.getCreateContactSecondemailField().sendKeys("SteveJohnPersonal@e2infosystems.com");
		Assert.assertEquals(locator.getMaximumCharacterReached().getText(), expectedErrorMessage);
		locator.getCloseButton().click();
		locator.getCreateContactThirdemailField().sendKeys("SteveJohnPersonal@e2infosystems.com");
		Assert.assertEquals(locator.getMaximumCharacterReached().getText(), expectedErrorMessage);
		locator.getCloseButton().click();
		Thread.sleep(2000);
		locator.getCreateContactCityStateZipField().sendKeys("Flat w 17/1, kanguva flats erode main road erode 6");
		try {
			errorMessageForCityStateField = locator.getMaximumCharacterReached().isDisplayed();
		} catch (Exception e) {
			System.out.println("Eror Message locator for CityState Field not found here");
		}
		Thread.sleep(2000);
		locator.getCreateContactJobtitleField().sendKeys("Web Developer at E2infostystems Private limited");
		Assert.assertEquals(locator.getMaximumCharacterReached().getText(), expectedErrorMessage);
		locator.getCloseButton().click();
		Thread.sleep(2000);
		locator.getCreateContactDepartmentField().sendKeys("Web Developer at E2infostystems Private limited");
		Assert.assertEquals(locator.getMaximumCharacterReached().getText(), expectedErrorMessage);
		locator.getCloseButton().click();
	}

@Test(priority = 6)
	public void shouldErrorThrownAlphaNumericAndNumericErrorMessage() throws InterruptedException, AWTException {
		implicitWait(10);
		webModuleElementLocator locator = new webModuleElementLocator();

		String expectedErrorMessage = "Allowed alphanumeric only";
		String expectedErrorMessageForNumericField = "Only numeric characters allowed";
		Thread.sleep(3000);
	//	locator.getFirstNameField().click();
		clearData(locator.getFirstNameField());

		locator.getFirstNameField().sendKeys("#@#%$##");
		Assert.assertEquals(locator.getAlphaNumericErrorMessage().getText(), expectedErrorMessage);
		locator.getCloseButton().click();
	//	locator.getLastNameField().click();
		clearData(locator.getLastNameField());
		locator.getLastNameField().sendKeys("#@#%$##");
		Thread.sleep(2000);
		Assert.assertEquals(locator.getAlphaNumericErrorMessage().getText(), expectedErrorMessage);
		locator.getCloseButton().click();
		//locator.getPhoneNumberField().click();
		clearData(locator.getPhoneNumberField());
		locator.getPhoneNumberField().sendKeys("#$#^&");
		Thread.sleep(2000);
		Assert.assertEquals(locator.getNumericCharacterErrorMessage().getText(), expectedErrorMessageForNumericField);
		locator.getCloseButton().click();

	//	locator.getCreateContactAddressField().click();
		clearData(locator.getCreateContactAddressField());
		locator.getCreateContactAddressField().sendKeys("Flat 203@T nagar");
	//	locator.getCreateContactSecondphoneField().click();
		clearData(locator.getCreateContactSecondphoneField());
		locator.getCreateContactSecondphoneField().sendKeys("^%&^");
		Thread.sleep(2000);
		Assert.assertEquals(locator.getNumericCharacterErrorMessage().getText(), expectedErrorMessageForNumericField);
		locator.getCloseButton().click();
		//locator.getCreateContactSecondmobileField().click();
		clearData(locator.getCreateContactSecondmobileField());
		locator.getCreateContactSecondmobileField().sendKeys("^%&^");
		Thread.sleep(2000);
		Assert.assertEquals(locator.getNumericCharacterErrorMessage().getText(), expectedErrorMessageForNumericField);
		locator.getCloseButton().click();
	//	locator.getCreateContactCityStateZipField().click();
		clearData(locator.getCreateContactCityStateZipField());
		locator.getCreateContactCityStateZipField().sendKeys("^%$^^%");

	//	locator.getCreateContactJobtitleField().click();
		clearData(locator.getCreateContactJobtitleField());
		locator.getCreateContactJobtitleField().sendKeys("<:>");

		Thread.sleep(2000);
		Assert.assertEquals(locator.getAlphaNumericErrorMessage().getText(), expectedErrorMessage);
		locator.getCloseButton().click();

	//	locator.getCreateContactDepartmentField().click();
		clearData(locator.getCreateContactDepartmentField());
		locator.getCreateContactDepartmentField().sendKeys("Web#$%#$%");

		Thread.sleep(2000);
		Assert.assertEquals(locator.getAlphaNumericErrorMessage().getText(), expectedErrorMessage);
		locator.getCloseButton().click();

	}

	@Test(priority = 7)
	public void shouldErrorThrownInvalidEmailIdErrorMessage() throws Exception {
		implicitWait(10);

		webModuleElementLocator locator = new webModuleElementLocator();
		String expectedErrorMessageForPrimaryMailId = "Invalid Primary Email-ID";
		String expectedFirstLetterCannotSpace = "First letter cannot be space.";
		String expectedErrorMessageForSecondMailId = "Invalid Secondary Email-ID";
		String expectedErrorMessageForThirdMailId = "Invalid Third Email-ID";
		//locator.getCreateNewContactsButton().click();
		//locator.getFirstNameField().click();
		clearData(locator.getFirstNameField());
		locator.getFirstNameField().sendKeys("siva");
		//locator.getCreateContactSecondemailField().click();
		clearData(locator.getCreateContactSecondemailField());
		//locator.getCreateContactThirdemailField().click();
		clearData(locator.getCreateContactThirdemailField());

		String emailValue[] = { "qagmail.com", " qa@e2infosystems. com", "123_qa@gmail", "@QA@gMaIl.co.in" };
		// Primary Email ID
		for (int i = 0; i <= emailValue.length-1; i++) {
			boolean firstLetterCannotBeSpace = false;
			locator.getCreateContactEmailAddress().click();
			clearData(locator.getCreateContactEmailAddress());

			sendkeys(locator.getCreateContactEmailAddress(), emailValue[i]);

			try {
				firstLetterCannotBeSpace = locator.getFirstLetterCannotSpaceErrorMessage().isDisplayed();
			} catch (Exception e) {
				System.out.println("First Letter Cannot Be Space Locator not found here 1");
			}

			if (firstLetterCannotBeSpace) {
				Assert.assertEquals(locator.getFirstLetterCannotSpaceErrorMessage().getText(),
						expectedFirstLetterCannotSpace);

				locator.getCloseButton().click();
			} else {

				locator.getCreateContactSaveContactbtn().click();
				Assert.assertEquals(locator.getInvalidPrimaryEmailIDErrorMessage().getText(),
						expectedErrorMessageForPrimaryMailId);
				locator.getCloseButton().click();
			}

			if (i == emailValue.length-1) {
				locator.getCreateContactCancelBtn().click();
				locator.getCreateNewContactsButton().click();
				locator.getFirstNameField().sendKeys("siva");
			}
		}
		// Secondary Email ID
		for (int j = 0; j <= emailValue.length - 1; j++) {
			boolean firstLetterCannotBeSpace = false;
			locator.getCreateContactSecondemailField().click();
			clearData(locator.getCreateContactSecondemailField());
			Thread.sleep(2000);
			sendkeys(locator.getCreateContactSecondemailField(), emailValue[j]);

			try {
				firstLetterCannotBeSpace = locator.getFirstLetterCannotSpaceErrorMessage().isDisplayed();
			} catch (Exception e) {
				System.out.println("First Letter Cannot Be Space Locator not found here 2");
			}
			if (firstLetterCannotBeSpace) {
				Assert.assertEquals(locator.getFirstLetterCannotSpaceErrorMessage().getText(),
						expectedFirstLetterCannotSpace);
				Thread.sleep(2000);	
				locator.getCloseButton().click();
			} else {

				locator.getCreateContactSaveContactbtn().click();
				Assert.assertEquals(locator.getInvalidSecondaryEmailIDErrorMessage().getText(),
						expectedErrorMessageForSecondMailId);
				locator.getCloseButton().click();
			}
			if (j == emailValue.length-1) {
				locator.getCreateContactCancelBtn().click();
				locator.getCreateNewContactsButton().click();
				locator.getFirstNameField().sendKeys("siva");
			}
		}

		//// Third Email ID
		for (int k = 0; k <= emailValue.length - 1; k++) {
			boolean firstLetterCannotBeSpace = false;
			locator.getCreateContactThirdemailField().click();
			clearData(locator.getCreateContactThirdemailField());
			Thread.sleep(2000);
			sendkeys(locator.getCreateContactThirdemailField(), emailValue[k]);

			try {
				firstLetterCannotBeSpace = locator.getFirstLetterCannotSpaceErrorMessage().isDisplayed();
			} catch (Exception e) {
				System.out.println("First Letter Cannot Be Space Locator not found here 3");
			}
			if (firstLetterCannotBeSpace) {
				Thread.sleep(2000);
				Assert.assertEquals(locator.getFirstLetterCannotSpaceErrorMessage().getText(),
						expectedFirstLetterCannotSpace);
				locator.getCloseButton().click();
			} else {

				locator.getCreateContactSaveContactbtn().click();
				Assert.assertEquals(locator.getInvalidThirdEmailIDErrorMessage().getText(),
						expectedErrorMessageForThirdMailId);
				Thread.sleep(2000);
				locator.getCloseButton().click();
			}

		}
		locator.getCreateContactCancelBtn().click();
	}

@Test(priority = 8)
public void editingThePersonalContact() throws Exception {
	
//	RequestedBrowserWillBelaunch("chrome");
//	driver.manage().window().maximize();
//	RequestedUrlwillBeLaunch("https://e2testing.mycatie.com/ccrc_v2/personalContacts/");
//
//	functionCall.callRoomDetails();
	implicitWait(10);
	
	String ContactFirstnameField = "e2staff";
	String ContactLastnameField = "Admin";
	String ContactPhonenumberField = "7894561230";
	String ContactMobilenumberField = "5698214532";
	String ContactEmailAddress = "gh@gmail.com";
	String ContactAddressField = "no 187 middle street";
	String ContactCityStateZipField = "631002";
	String ContactSecondphoneField = "8489780681";
	String ContactSecondmobileField = "45698712305";
	String ContactSecondEmailAddress = "e2@gmail.com";
	String ContactThirdEmailAddress = "staff@gmail.com";
	String ContactJobtitleField = "developer";
	String ContactDepartmentField = "Backend";
	
	webModuleElementLocator locator = new webModuleElementLocator();
	
	
	if(locator.getPersonalContactList().isEmpty()) {
		System.out.println("Personal Contact Not available");
	}else {
		locator.getSingleContact().click();
		locator.getEditIcon().click();
		clearData(locator.getCreateContactFirstnameField());
		sendkeys(locator.getCreateContactFirstnameField(), ContactFirstnameField);
		
		clearData(locator.getCreateContactLastnameField());
		sendkeys(locator.getCreateContactLastnameField(), ContactLastnameField);
		
		clearData(locator.getCreateContactPhonenumberField());
		sendkeys(locator.getCreateContactPhonenumberField(), ContactPhonenumberField);
		
		clearData(locator.getCreateContactMobilenumberField());
		sendkeys(locator.getCreateContactMobilenumberField(), ContactMobilenumberField);
		
		clearData(locator.getCreateContactEmailAddress());
		sendkeys(locator.getCreateContactEmailAddress(), ContactEmailAddress);
		Thread.sleep(2000);
		clearData(locator.getCreateContactAddressField());
		sendkeys(locator.getCreateContactAddressField(), ContactAddressField);
		
		clearData(locator.getCreateContactCityStateZipField());
		sendkeys(locator.getCreateContactCityStateZipField(), ContactCityStateZipField);
		
		clearData(locator.getCreateContactSecondphoneField());
		sendkeys(locator.getCreateContactSecondphoneField(), ContactSecondphoneField);
//		Thread.sleep(5000);
		clearData(locator.getCreateContactSecondmobileField());
		sendkeys(locator.getCreateContactSecondmobileField(), ContactSecondmobileField);
		
		clearData(locator.getCreateContactSecondemailField());
		sendkeys(locator.getCreateContactSecondemailField(), ContactSecondEmailAddress);
		
		clearData(locator.getCreateContactThirdemailField());
		sendkeys(locator.getCreateContactThirdemailField(), ContactThirdEmailAddress);
		Thread.sleep(3000);
		clearData(locator.getCreateContactJobtitleField());
		sendkeys(locator.getCreateContactJobtitleField(), ContactJobtitleField);
		
		clearData(locator.getCreateContactDepartmentField());
		sendkeys(locator.getCreateContactDepartmentField(), ContactDepartmentField);
		Thread.sleep(2000);
		locator.getCreateContactSaveContactbtn().click();
		Thread.sleep(2000);

		assertTrue(locator.getCreateContactSuccessMessage().isDisplayed());
		Thread.sleep(2000);
		locator.getCloseButton().click();
		
		//Asserting first name
		String availableName = locator.getContactName().getText();
		String newValue = availableName.substring(0);
		Thread.sleep(2000);
		Assert.assertTrue(availableName.contains(newValue));
		
		//Asserting First phoneNumber
		String availableFirstPhoneNumber = locator.getPhoneNumber1TextName().getText();
		Thread.sleep(2000);
		Assert.assertTrue(availableFirstPhoneNumber.contains(ContactPhonenumberField));
		
		//Asserting Second phoneNumber
		String availableSecondPhoneNumber = locator.getPhoneNumber2TextName().getText();
		Thread.sleep(2000);
		Assert.assertTrue(availableSecondPhoneNumber.contains(ContactPhonenumberField));
		
		//Asserting First MobileNumber
				String availabeFirstMobileNumber = locator.getMobileNumber1TextName().getText();
				Thread.sleep(2000);
				Assert.assertTrue(availabeFirstMobileNumber.contains(ContactMobilenumberField));
				
				//Asserting Second MobileNumber
				String availabeSecondMobileNumber = locator.getMobileNumber2TextName().getText();
				Thread.sleep(2000);
				Assert.assertTrue(availabeSecondMobileNumber.contains(ContactSecondmobileField));
				
				//Asserting First EmailId
				String availabeFirstEmailId = locator.getEmail1TextName().getText();
				Thread.sleep(2000);
				Assert.assertTrue(availabeFirstEmailId.contains(ContactEmailAddress));
				
				//Asserting Second EmailId
				String availabeSecondEmailId = locator.getEmail2TextName().getText();
				Thread.sleep(2000);
				Assert.assertTrue(availabeSecondEmailId.contains(ContactSecondEmailAddress));
				
				//Asserting Third EmailId
				String availabeThirdEmailId = locator.getEmail3TextName().getText();
				Thread.sleep(2000);
				Assert.assertTrue(availabeThirdEmailId.contains(ContactThirdEmailAddress));
				
				//Asserting Job Title
				String availabeJobTitle = locator.getJobTitleTextName().getText();
				Thread.sleep(2000);
				Assert.assertTrue(availabeJobTitle.contains(ContactJobtitleField));
				//Asserting Department
				
				String availabeDepartment = locator.getDepartmentTextName().getText();
				Thread.sleep(2000);
				Assert.assertTrue(availabeDepartment.contains(ContactDepartmentField));
		
		locator.getContactViewCancelIcon().click();
		
	}
}
	@Test(priority = 9)
	public void AbleToDeletePersonalContact() throws InterruptedException {
		boolean contactAvailable = false;
		boolean deleteIconAvailable = false;

		webModuleElementLocator locator = new webModuleElementLocator();
		try {
			contactAvailable = locator.getSingleContact().isDisplayed();
			if (contactAvailable) {
				locator.getSingleContact().click();
				try {
					deleteIconAvailable = locator.getDeleteIcon().isDisplayed();
				} catch (Exception e) {
					System.out.println("Delete Icon locator not found");
				}
				if (deleteIconAvailable) {
					Thread.sleep(2000);
					
					String availableName = locator.getContactName().getText();
					String newValue = availableName.substring(0);
					
					locator.getDeleteIcon().click();
					locator.getClickingonDeleteButton().click();
					Thread.sleep(2000);
					locator.getCloseButton().click();
		
					//Validating the deleted contact
					Thread.sleep(2000);
					sendkeys(locator.getPersonalsearchBox(), newValue);
					if(locator.getPersonalContactList().isEmpty()) {
						System.out.println("Contact deleted Successfully");
					}else {
						System.out.println("Contact still available, Might be with Same name");
					}
					//clearing the searched deleted Contact
					clearData(locator.getPersonalsearchBox());
					
				} else {
					System.out.println("Delete Option is missing here");
					locator.getCancelIconButton().click();
				}
			} else {
				System.out.println("No Contact Available in the Personal Contact");
			}
		} catch (Exception e) {
			System.out.println("Available Contact locator not found");
		}

	}


	@Test(priority = 10)
	public void shouldAbleToCreategroupsWhenNoGroupAvailable() throws InterruptedException {

		String expectedTitle = "CREATE NEW GROUP";
		String expectedErrorMessage = "Enter Group name";
		String createNewGroupGroupNameField = "AravindGroups";
		String expectedSuccessMessage = "AravindGroups group has been added successfully.";
		String createContactFirstnameField = "Aravind";
		String createContactLastnameField = "S";
		String contactUpdateSuccessfullMessage = "Contact updated successfully";

		webModuleElementLocator locator = new webModuleElementLocator();

		locator.getClicknewcontact().click();
		sendkeys(locator.getCreateContactFirstnameField(), createContactFirstnameField);
		sendkeys(locator.getCreateContactLastnameField(), createContactLastnameField);
		locator.getAddToGroupButton().click();
		Thread.sleep(2000);

		boolean noGroupsAvailableText = false;
		try {
			noGroupsAvailableText = locator.getReadingNoGroupsAvailable().isDisplayed();
		} catch (Exception e) {
			System.out.println("No Group Available Here");
		}
		if (noGroupsAvailableText) {
			locator.getCreateContactCancelBtn().click();
			Thread.sleep(1000);
			locator.getClickGroupsMenu().click();
			locator.getClickNewGroup().click();
			Thread.sleep(2000);
			Assert.assertEquals(locator.getVerifyingtheCreateNewGroupTitle().getText(), expectedTitle);
			Thread.sleep(2000);
			locator.getSelectingavalueFromAddContactsToGroup().click();
			locator.getClickOnSaveBtn().click();
			Assert.assertEquals(locator.getEnterGroupnameDisplayCheck().getText(), expectedErrorMessage);
			Thread.sleep(3000);
			locator.getOkButton().click();
			sendkeys(locator.getCreateNewGroupGroupNameField(), createNewGroupGroupNameField);
			locator.getClickOnSaveBtn().click();
			Thread.sleep(2000);
			Assert.assertEquals(locator.getEnterGroupnameDisplayCheck().getText(), expectedSuccessMessage);
			Thread.sleep(2000);
			locator.getOkButton().click();
			Thread.sleep(2000);
			locator.getClickFavouritesMenu().click();
			locator.getClicknewcontact().click();
			sendkeys(locator.getCreateContactFirstnameField(), createContactFirstnameField);
			Thread.sleep(3000);
			sendkeys(locator.getCreateContactLastnameField(), createContactLastnameField);
			Thread.sleep(3000);
			locator.getAddToGroupButton().click();
			locator.getSelectingcheckboxinsidegroupfield().click();
			Thread.sleep(2000);
			locator.getSaveToContactButton().click();
			Thread.sleep(2000);
			Assert.assertEquals(locator.getEnterGroupnameDisplayCheck().getText(), contactUpdateSuccessfullMessage);
			Thread.sleep(2000);
			locator.getCloseButton().click();

		} else {

			locator.getSelectingcheckboxinsidegroupfield().click();
			Thread.sleep(2000);
			locator.getCreateContactSaveContactbtn().click();
			Thread.sleep(2000);
			Assert.assertEquals(locator.getEnterGroupnameDisplayCheck().getText(), contactUpdateSuccessfullMessage);
			Thread.sleep(2000);
			locator.getCloseButton().click();

		}

	}


	@Test(priority = 11)
	public void AbleTocreateNewGroup() throws InterruptedException {
		boolean groupNameExistsMessageDisplay = false;
		boolean noGroupAvailableTextMessageDisplay = false;
		String verifyingGroupsAvailable = "No Groups Have Been Added";
		String createNewGroupGroupNameField = "Aravind";
		String expectedSuccessMessage = "Aravind group has been added successfully.";
		String enterGroupNameMessage = "Enter Group name";
		webModuleElementLocator locator = new webModuleElementLocator();
		Thread.sleep(2000);
		locator.getClickGroupsMenu().click();
		try {
			noGroupAvailableTextMessageDisplay = locator.getVerifyingGroupAvailableorNot().isDisplayed(); 
		}catch(Exception e) {
			System.out.println("No Groups Have been added Text Message Locator not found here");
		}
		if(noGroupAvailableTextMessageDisplay) {
			Assert.assertEquals(locator.getVerifyingGroupAvailableorNot().getText(), verifyingGroupsAvailable);
		}else {
			System.out.println("*******Groups Available******");
		}
		Thread.sleep(2000);
		locator.getClickNewGroup().click();
		locator.getClickOnSaveBtn().click();
		Assert.assertEquals(locator.getEnterGroupnameDisplayCheck().getText(), enterGroupNameMessage);
		Thread.sleep(2000);
		locator.getOkButton().click();

		Thread.sleep(2000);
		sendkeys(locator.getCreateNewGroupGroupNameField(), createNewGroupGroupNameField);
		locator.getSelectingavalueFromAddContactsToGroup().click();
		Thread.sleep(2000);
		locator.getClickOnSaveBtn().click();
		try {
			groupNameExistsMessageDisplay = locator.getGroupNameAlreadyExistMessage().isDisplayed();
		}catch(Exception e) {
			System.out.println("Group Name Already Exist locator not found");
		}
		if(groupNameExistsMessageDisplay) {
			System.out.println("Entered Group Name is already available");
			locator.getOkButton().click();
			//locator.getCreateNewGroupGroupNameField().click();
			clearData(locator.getCreateNewGroupGroupNameField());
			sendkeys(locator.getCreateNewGroupGroupNameField(), "FrontDoorGroup");
			locator.getClickOnSaveBtn().click();
			locator.getOkButton().click();
		}else {
			Thread.sleep(2000);
			Assert.assertEquals(locator.getEnterGroupnameDisplayCheck().getText(), expectedSuccessMessage);
			Thread.sleep(2000);
			locator.getOkButton().click();
		}
	}

	@Test(priority = 12)
	public void ShouldErrorThrownEditingGroupWithMaximumCharacter() throws InterruptedException {
		
		
		
		boolean removeUserOptionDisplay = false;
		boolean addedUserDisplayInGroupPage = false;
		boolean maximumGroupNamePopupDisplay = false;
		String editValue = "StaffFrontDoorGroupForE2Team";
		String createNewGroupGroupNameField = "Aravind";
		webModuleElementLocator locator = new webModuleElementLocator();
		
		Thread.sleep(2000);
//		locator.getClickNewGroup().click();
//		Thread.sleep(2000);
		if(locator.getgroupList().isEmpty()) {
			System.out.println("Group List is Empty here");
			locator.getClickNewGroup().click();
			Thread.sleep(2000);
			locator.getOkButton().click();
			sendkeys(locator.getCreateNewGroupGroupNameField(), createNewGroupGroupNameField);
			locator.getSelectingavalueFromAddContactsToGroup().click();
			Thread.sleep(2000);
			locator.getClickOnSaveBtn().click();
			locator.getOkButton().click();
		}else {

		locator.getgroupList().get(0).click();
		Thread.sleep(2000);
		locator.getEditIconGroupSection().click();
		clearData(locator.getEditTextBoxGroupsField());
		Thread.sleep(2000);

		sendkeys(locator.getEditTextBoxGroupsField(), editValue);

		try {
			removeUserOptionDisplay = locator.getRemoveUser().isDisplayed();
		} catch (Exception e) {
			System.out.println("Remove Option locator not found");
		}

		if (removeUserOptionDisplay) {
			Thread.sleep(2000);
			locator.getRemoveUser().click();

			locator.getClickOnSaveBtn().click();
			try {
				maximumGroupNamePopupDisplay = locator.getInvalidGroupNamePopup().isDisplayed();
			}catch(Exception e) {
				System.out.println("Inavlid Group Name Popup Locator not found here");
			}
			if(maximumGroupNamePopupDisplay) {
				Thread.sleep(2000);
				locator.getCloseButton().click();
				
				clearData(locator.getCreateNewGroupGroupNameField());
				sendkeys(locator.getCreateNewGroupGroupNameField(), "Developer Group");
				Thread.sleep(2000);
				locator.getAddUserbuttonOnGroup().click();
				Thread.sleep(2000);
				locator.getSelectingcheckboxinsidegroupfield().click();
				locator.getAddUserButton().click();
				try {
					addedUserDisplayInGroupPage = locator.getAddedUserListOnGroup().isDisplayed();
				} catch (Exception e) {
					System.out.println("User List locator not found");
				}
				if (addedUserDisplayInGroupPage) {
					System.out.println("User Added in the Group List");
					Thread.sleep(2000);
					locator.getClickOnSaveBtn().click();
					Thread.sleep(2000);
					locator.getCloseButton().click();
				} else {
					System.out.println("User not added");
					Thread.sleep(2000);
					locator.getClickOnSaveBtn().click();
					Thread.sleep(2000);
					locator.getCloseButton().click();
				}
			}

		} else {
			Thread.sleep(2000);
			locator.getAddUserbuttonOnGroup().click();
			Thread.sleep(2000);
			locator.getSelectingcheckboxinsidegroupfield().click();
			locator.getAddUserButton().click();
			try {
				addedUserDisplayInGroupPage = locator.getAddedUserListOnGroup().isDisplayed();
			} catch (Exception e) {
				System.out.println("User List locator not found");
			}
			if (addedUserDisplayInGroupPage) {
				System.out.println("User Added in the Group List");
				Thread.sleep(2000);
				locator.getClickOnSaveBtn().click();
				Thread.sleep(2000);
				locator.getCloseButton().click();
			} else {
				System.out.println("User not added");
				Thread.sleep(2000);
				locator.getClickOnSaveBtn().click();
				Thread.sleep(2000);
				locator.getCloseButton().click();
			}
		}
		}

	}
	@Test(priority = 13)
	public void shouldAbleToSearchContact() throws AWTException, InterruptedException {
		
//		RequestedBrowserWillBelaunch("chrome");
//		driver.manage().window().maximize();
//		RequestedUrlwillBeLaunch("https://e2testing.mycatie.com/ccrc_v2/personalContacts/");
//		functionCall.callRoomDetails();

		webModuleElementLocator locator = new webModuleElementLocator();
		
		locator.getContactsMenuTabButton().click();
		Thread.sleep(2000);
		if(locator.getPersonalContactList().isEmpty()) {
			System.out.println("Personal Contact empty");
		}else {
				
				String actualValue = locator.getSearchedContact().getText();
				String SearchName = actualValue.substring(0);
				
				sendkeys(locator.getPersonalsearchBox(), SearchName);
				
			int j=0;
			while(j<=locator.getPersonalContactList().size()) {
				Thread.sleep(2000);
				if(locator.getPersonalContactList().get(j).getText().contains(SearchName)) {
		
					System.out.println("*******Searched Contact Available*****"+ locator.getPersonalContactList().get(0).getText());
				}else {
					System.out.println("***********Searched Contact not available***********");
				}
				j++;
			}	
	
			clearData(locator.getSearchBox());
		}
	}

//	@Test(priority = 14)
	public void shouldAbleToSortContact() throws AWTException, InterruptedException {
		
		webModuleElementLocator locator = new webModuleElementLocator();
		int j=1;
		if(j<locator.getSortBy().size()) {
			System.out.println(locator.getSortBy().get(j));
			locator.getSortByButton().click();
		locator.getSortBy().get(j).click();
	
		for (int i = 0; i < locator.getPersonalContactList().size()-1; i++) {
		    if (locator.getPersonalContactList().get(i).getText().toLowerCase().compareTo(locator.getPersonalContactList().get(i + 1).getText().toLowerCase()) == 1) {
		        System.out.println("Personal Contact not in ascending order"); // If any element is greater than the next one, the list is not sorted.
		    }else {
		    	System.out.println("Personal contact in Ascending order");
		    }
		}
		j++;
		}
	}
	
	
}






