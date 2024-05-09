package Locators;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Base.Base_class;

public class webModuleElementLocator extends Base_class{
		public webModuleElementLocator() {

			PageFactory.initElements(driver, this);
		}
		
		
		//**********Community Directory************
		
		
		
		
		@FindBy(xpath = "//a[text()='communityDirectory/']")
		private WebElement communityDirectoryMenuButton;
		
		@FindBy(xpath = "//div[@class='community-directory-list-resident-details-container']")
		private List<WebElement> residentList;
			@FindBy(xpath="//div[@class='community-directory-grid-item-container ']")
			private List<WebElement> residentListInGridMode;
		
		
		@FindBy(id = "community-directory-grid-nav-container")
		private WebElement gridIconButton;
		
		@FindBy(id = "community-directory-list-nav-container")
		private WebElement listIconButton;
		
		@FindBy(xpath = "//div[text()='Sort By']")
		private WebElement sortByDropDown;
		
		@FindBy(xpath = "//div[@class='select-dropdown-item']")
		private WebElement sortByOption;
		
		@FindBy(xpath = "//div[@class='select-dropdown-item']")
		private List<WebElement> sortByOptionList;
		@FindBy(id = "community-directory-resident-modal-close-icon")
		private WebElement cancelIconButton;
		
		@FindBy(xpath = "//div[@class='community-directory-resident-modal-add-contact flexAlignCenterJustifyCenter']")
		private WebElement addToContactButton;
		@FindBy(xpath = "//div[text()='This resident has been added to your personal contacts']")
		private WebElement addToContactPopupMessage;
		
		@FindBy(id = "popup-close-callback")
		private WebElement closeButton;
		
		@FindBy(id = "community-directory-resident-modal-photo")
		private WebElement TapToEnlarge;
		
		@FindBy(xpath = "//div[text()='Click to view Details']")
		private List<WebElement> residentProfileViewOption;
		
		@FindBy(xpath = "//div[@class='community-directory-grid-resident-name']")
		private List<WebElement> residentName;
		
		@FindBy(id = "community-directory-search-input")
		private WebElement searchBox;
		
		@FindBy(id = "community-directory-resident-modal-default-photo")
		private WebElement defaultImg;
		
		@FindBy(id = "community-directory-resident-modal-photo")
		private WebElement availableImg;
		
		@FindBy(xpath = "//img[@data-testid='edit-icon-14']")
		private WebElement personalInterestEditOption;
		
		@FindBy(xpath = "(//div[@class='community-directory-resident-interest-list-item'])[1]")
		private WebElement availablePersonalInterest;
		
		@FindBy(xpath = "(//div[@class='community-directory-interest-update-action'])[1]")
		private WebElement PersonalInterestUpdate;
		
		@FindBy(id = "community-directory-resident-modal-close-icon")
		private WebElement cancelIconResidentList;
		
		@FindBy(xpath = "//div[@class='overlay community-directory-photo-preview flexAlignCenterJustifyCenter']")
		private WebElement enLargedImgDisplay;
		
		@FindBy(xpath = "//img[@data-testid='close-image']")
		private WebElement closeEnlargeImg;
		
		// @FindBy(xpath = "//img[@data-testid='first-email-15']")
		// private WebElement closeEnlargeImg;
		
		
		
		
		
		
		//********* Dining Service **********
		
		@FindBy(xpath = "//a[text()='dining/']")
		private WebElement diningServiceMenuButton;
		
		@FindBy(xpath = "//div[@class='calendar-event-day']")
		private List<WebElement> diningActiveEvent;
		
		
		@FindBy(xpath = "//div[text()='Data Unavailable']")
		private WebElement dataUnavailableMessage;
		
		@FindBy(xpath = "(//div[@class='select-label'])[1]")
		private WebElement restaurantDropDownButton;
		
		@FindBy(xpath = "(//div[@class='select-dropdown-item'])[1]")
		private WebElement hospice;
		
		@FindBy(xpath = "(//div[@class='select-label'])[2]")
		private WebElement mealTypeDropDownButton;
		
		@FindBy(xpath = "(//img[@class='header-right-icon'])")
		private WebElement cartIconButton;
		
		@FindBy(xpath = "(//div[text()='Dessert'])[1]")
		private WebElement dessertMenu;
		
		@FindBy(xpath = "(//div[text()='Side'])[1]")
		private WebElement sideMenu;
		
		@FindBy(xpath = "(//div[text()='Entrée'])[1]")
		private WebElement entreeMenu;
		
		@FindBy(xpath = "(//div[text()='Soup'])[1]")
		private WebElement SoupMenu;
		
		@FindBy(xpath = "(//div[text()='Salad'])[1]")
		private WebElement saladMenu;
		
		@FindBy(xpath = "//div[@class='dining-menu-item displayFlex']")
		private List<WebElement> menuItemList;
		
		@FindBy(xpath = "//label[text()='Rare']")
		private WebElement rareOption;
		
		@FindBy(xpath = "//label[text()='Medium']")
		private WebElement mediumOption;
		
		@FindBy(xpath = "//textarea[@class='dining-item-popup-notes-input']")
		private WebElement notesOption;
		
		@FindBy(xpath = "//div[text()='Add to Cart']")
		private WebElement addCartButton;
		
		@FindBy(xpath = "//div[text()='Update Item']")
		private WebElement updateButton;
		
		@FindBy(xpath = "//div[@class='dining-item-popup-right']")
		private WebElement menuItemCancelIconButton;
		
		@FindBy(id = "popup-description")
		private WebElement chooseCustomizationToContinuePopup;
		
		@FindBy(id = "popup-container")
		private WebElement maximumSelectionExceedMessage;
		
		@FindBy(xpath = "//div[text()='Current Order']")
		private WebElement currentOrderSlider;
		
		@FindBy(xpath = "//div[text()='Preordered']")
		private WebElement preOrderSlider;
		
		@FindBy(xpath = "(//div[@class='dining-cart-item-container flexAlignCenterJustifySpaceBetween'])[1]")
		private WebElement deleteMenuItem;
		
		@FindBy(xpath = "//div[@class='check-out-button']")
		private WebElement checkOutButton;
		
		@FindBy(xpath = "//div[@class='clear-cart-button']")
		private WebElement clearCartButton;
		
		@FindBy(xpath = "(//div[@class='select-dropdown-item'])[1]")
		private WebElement selectAvailableTime;
		
		@FindBy(xpath = "//div[@class='checkbox-container flexAlignCenterJustifyCenter']")
		private WebElement locationCheckBox;

		@FindBy(xpath = "//div[text()='How do you want it ?']")
		private WebElement paymentOption;
		
		@FindBy(xpath = "//div[@class='place-order-button']")
		private WebElement placeOrderButton;
		
		@FindBy(id = "header-back-icon")
		private WebElement pageBackButton;
		
		@FindBy(xpath = "//div[@class='popup-description flexAlignCenterJustifyCenter']")
		private WebElement orderSuccessMessage;
		
	
		  
		//******************* Survey Center **********************
		
		@FindBy(xpath = "//a[text()='survey/']")
		private WebElement surveyMenuButton;
		
		@FindBy(xpath = "//div[@class='survey-title-container survey-read-title-container']")
		private WebElement NewSurveyToTakeTextMessage;
		
		@FindBy(xpath = "//div[text()='Take Survey']")
		private List<WebElement> takeSurveyButton;
		
		@FindBy(xpath = "//div[text()='Retake']")
		private WebElement retakeSurveyButton;
		
		@FindBy(xpath = "//div[@class='survey-title-container survey-unread-title-container']")
		private WebElement previousSurveyCompletedTextMessage;
		
		@FindBy(xpath = "//div[@class='radio-container flexAlignCenterJustifyCenter']")
		private List<WebElement> surveyOption;
		
		@FindBy(xpath = "//div[text()='Next']")
		private WebElement skipButton;
		
		@FindBy(id = "survey-question-prev")
		private WebElement previousButton;
		
		@FindBy(xpath = "//div[text()='Submit']")
		private WebElement surveySubmitButton;
		
		@FindBy(id = "survey-question-opentext-input")
		private WebElement openTextField;
		
		
		//******************* Bulletin Board **********************
		
		@FindBy(xpath = "//a[text()='bulletinBoard/']")
		private WebElement bulletinBaordMenuButton;
		
		@FindBy(id = "bulletin-board-list-refresh-action")
		private WebElement refreshButton;
		
		@FindBy(id = "select-label-container")
		private WebElement bulletinDropDownButton;
		
		@FindBy(xpath = "//label[text()='Select All']")
		private WebElement selectAllCheckBox;
		
		@FindBy(xpath = "//div[@class='select-dropdown-item']")
		private List<WebElement> dropDownOption;
		
		@FindBy(xpath = "//div[@class='bulletinboard-controls-pagination-prev-next next']")
		private WebElement nextPageButton;
		
		@FindBy(xpath = "//div[@class='bulletinboard-controls-pagination-prev-next prev']")
		private WebElement prevPageButton;
		
		@FindBy(id = "bulletin-board-message-delete-button")
		private WebElement deleteMessage;
		
		//******************* Personal Contacts **********************
		
		@FindBy(xpath = "//a[text()='personalContacts/']")
		private WebElement personalContactsMenuButton;
		
		@FindBy(xpath = "//a[text()='Contacts']")
		private WebElement ContactsMenuTabButton;
		
		@FindBy(xpath = "//div[text()='New Contact']")
		private WebElement createNewContactsButton;
		
		@FindBy(xpath = "(//input[@placeholder='First Name'])")
		private WebElement firstNameField;
		
		@FindBy(id = "lastName")
		private WebElement lastNameField;
		
		@FindBy(xpath = "//div[@data-testid='relationship-0']")
		private WebElement releationshipOption;
		
		@FindBy(xpath = "//div[@class='personal-directory-new-contact-relationship-input']")
		private WebElement releationshipButton;
		
		@FindBy(xpath = "//div[text()='Enter Custom Relationship']")
		private WebElement enterCustomReleationShipButton;
		
		@FindBy(xpath = "//div[text()='Done']")
		private WebElement doneButton;
		
		@FindBy(xpath = "//div[text()='Add to group']")
		private WebElement addToGroupButton;
		
		@FindBy(xpath = "//div[text()='Save Contact']")
		private WebElement saveToContactButton;
		
		@FindBy(xpath = "//textarea[@class='personal-directory-new-contact-textarea']")
		private WebElement zipCodeField;
		
		@FindBy(id = "personal-directory-new-contact-phone-number-input")
		private WebElement phoneNumberField;	
		@FindBy(xpath = "//input[@placeholder='Search']")
		private WebElement searchField;
		
		@FindBy(xpath = "//div[text()='No Groups Have Been Added']")
		private WebElement noGroupHaveAddedMessage;
		
		@FindBy(id = "personal-directory-contact-modal-delete-icon")
		private WebElement deleteIcon;
		
		@FindBy(id = "personal-directory-contact-modal-edit-icon")
		private WebElement editIcon;
		
		
		@FindBy(xpath = "//div[text()='Contact updated successfully']")
		private WebElement contactUpdatedSuccessMessage;
		@FindBy(id = "personal-directory-contact-modal-favorite-icon")
		private WebElement favoriteIcon;
		
		@FindBy(xpath = "//div[@class='personal-directory-contact-modal-close-icon']")
		private WebElement personalContactCloseIcon;
		
		
		@FindBy(xpath = "//div[text()='No Groups Available']")
		private WebElement noGroupAvailableTextMessage;
		
		@FindBy(xpath = "//div[@class='checkbox-container flexAlignCenterJustifyCenter']")
		private WebElement groupAvailable;
		
		@FindBy(xpath = "(//div[@class='personal-directory-list-item displayFlex'])[1]")
		private WebElement singleContact;
		
		@FindBy(xpath = "(//div[@class='personal-directory-list-contact-name'])[1]")
		private WebElement searchedContact;
		
		@FindBy(xpath = "//div[@class='personal-directory-list-item displayFlex']")
		private List<WebElement> personalContactList;
		
		@FindBy(id = "personal-directory-search-input")
		private WebElement personalsearchBox;
		
		@FindBy(xpath = "//div[@class='select-dropdown-item']")
		private List<WebElement> sortBy;
		@FindBy(id = "select-label-container")
		private WebElement sortByButton;
		
		@FindBy(id = "personal-directory-modal-name-container")
		private WebElement contactName;
		
		@FindBy(id = "personal-directory-modal-address-container")
		private WebElement cityStateTextName;
		
		@FindBy(xpath = "/html/body/div[7]/div/div[2]/div[1]/div/div/div/div[2]/div[2]/div[1]/div[2]/div[1]")
		private WebElement phoneNumber1TextName;
		
		@FindBy(xpath = "/html/body/div[7]/div/div[2]/div[1]/div/div/div/div[2]/div[2]/div[1]/div[2]/div[2]")
		private WebElement phoneNumber2TextName;
		
		
		@FindBy(xpath = "/html/body/div[7]/div/div[2]/div[1]/div/div/div/div[2]/div[2]/div[2]/div[2]/div[1]")
		private WebElement mobileNumber1TextName;
		
		@FindBy(xpath = "/html/body/div[7]/div/div[2]/div[1]/div/div/div/div[2]/div[2]/div[2]/div[2]/div[2]")
		private WebElement mobileNumber2TextName;
		
		@FindBy(xpath = "/html/body/div[7]/div/div[2]/div[1]/div/div/div/div[2]/div[2]/div[3]/div[2]/div[1]")
		private WebElement email1TextName;
		
		@FindBy(xpath = "/html/body/div[7]/div/div[2]/div[1]/div/div/div/div[2]/div[2]/div[3]/div[2]/div[2]")
		private WebElement email2TextName;
		
		@FindBy(xpath = "/html/body/div[7]/div/div[2]/div[1]/div/div/div/div[2]/div[2]/div[3]/div[2]/div[3]")
		private WebElement email3TextName;
		
		
		
				@FindBy(xpath = "(//div[@class='personal-directory-additional-info'])[2]")
				private WebElement jobTitleTextName;
				@FindBy(xpath = "(//div[@class='personal-directory-additional-info'])[3]")
				private WebElement departmentTextName;
		
		
		

		
		
		@FindBy(id = "personal-directory-contact-modal-close-icon")
		private WebElement contactViewCancelIcon;
		
		
		@FindBy(xpath = "//div[text()='Group Name']")
		private WebElement sortByGroupName;
		
		@FindBy(xpath = "//div[text()='First Name']")
		private WebElement sortByFristName;
		
		@FindBy(xpath = "//div[text()='Last Name']")
		private WebElement sortByLastName;
		
		@FindBy(xpath = "//div[text()='Address']")
		private WebElement sortByAddress;
		
		
		@FindBy(xpath = "//div[text()='Only 30 characters allowed']")
		private WebElement maximumCharacterReached;
		
		@FindBy(xpath = "//div[text()='Only 50 characters allowed']")
		private WebElement maximumCharacterFiftyReached;

		
		@FindBy(xpath = "//div[text()='Allowed alphanumeric only']")
		private WebElement alphaNumericErrorMessage;
		
		@FindBy(xpath = "//div[text()='Only numeric characters allowed']")
		private WebElement numericCharacterErrorMessage;
		
		@FindBy(xpath = "//div[text()='Invalid Primary Email-ID']")
		private WebElement invalidPrimaryEmailIDErrorMessage;
		
		@FindBy(xpath = "//div[text()='Invalid Secondary Email-ID']")
		private WebElement InvalidSecondaryEmailIDErrorMessage;
		
		@FindBy(xpath = "//div[text()='Invalid Third Email-ID']")
		private WebElement InvalidThirdEmailIDErrorMessage;
		
		@FindBy(xpath = "//div[text()='First letter cannot be space.']")
		private WebElement firstLetterCannotSpaceErrorMessage;
		
		@FindBy(xpath = "//div[text()='Field length 70 only allowed']")
		private WebElement fieldLengthSeventyErrorMessage;
		
		
		//Groups Section Start 
		
		//clicking on the groups
		@FindBy(xpath="//a[text()='Groups']")
		private WebElement clickGroupsMenu;
		
		//clicking on the new group button in the group section
		@FindBy(xpath="//div[text()='New Group']")
		private WebElement clickNewGroup;
		
		//Groups Section End 
		
		
		//Fields inside Create New Group Title
		
		//checking whether the title is displayed or not
		@FindBy(id="personal-directory-new-group-header-title")
		private WebElement verifyingtheCreateNewGroupTitle;
		
		
		//selecting any groups in the add contacts to group
		@FindBy(xpath ="(//label[text()='Srinivasan, Aravind'])[1]")
		private WebElement selectingavalueFromAddContactsToGroup;
		
		
		// clicking on save button in the create new group field page
		@FindBy(xpath="//div[text()='Save']")
		private WebElement clickOnSaveBtn;
		
		//Reading the error message since without entering the group name clicking on the save button
		@FindBy(id="popup-description")
		private WebElement enterGroupnameDisplayCheck;
		
		//closing the error message popup screen by clicking on ok button 
		@FindBy(id="popup-close-callback")
		private WebElement clickingonOkButton;
		
		
		
		
		
		// Group Sections Start 
		@FindBy(xpath="//div[text()='No Groups Have Been Added']")
		private WebElement verifyingGroupAvailableorNot; 
		
		
		//Group name field
		@FindBy(id="personal-directory-edit-group-name-textarea")
		private WebElement createNewGroupGroupNameField;
	 	
		//selecting the displayed groups inside the groups text area
		@FindBy(xpath="(//div[@class='checkbox-container flexAlignCenterJustifyCenter'])[1]")
		private WebElement Selectingcheckboxinsidegroupfield;
	
		//Selecting some random value in the list of groups 
		@FindBy(xpath="//div[@class='personal-directory-list-item displayFlex']")
		private List<WebElement> GroupList;
		
		@FindBy(xpath="//div[text()='Group name already exists']")
		private WebElement groupNameAlreadyExistMessage; 
		//edit functionality in the dynamic way
		
		@FindBy(xpath="//div[@class='personal-directory-new-group-group-name']")
		private WebElement editingTheValueDynamically; 
		
		//clicking edit icon in the groups section
		@FindBy(id="personal-directory-group-modal-edit-icon")
		private WebElement editIconGroupSection;
		
		//editing the text box in the group field
		@FindBy(id="personal-directory-edit-group-name-textarea")
		private WebElement editTextBoxGroupsField; 
		
		//clicking delete icon in the groups section
		@FindBy(id="personal-directory-group-modal-delete-icon")
		private WebElement deleteIconGroupSection;
		
		// clicking on delete button in the confirmation popup screen
		@FindBy(id="popup-success-callback")
		private WebElement clickingonDeleteButton;
		
		//dynamically getting the value of deleting the list of groups with the random chooser
		@FindBy(xpath="//div[@class='personal-directory-new-group-group-name']")
		private WebElement autoclickonDeleteValueintheGroupField; 
		
		@FindBy(xpath="//div[@class='personal-directory-group-add-contact-button-container']")
		private WebElement addUserbuttonOnGroup; 
		
		@FindBy(xpath="//div[@class='personal-directory-new-group-remove-contact']")
		private WebElement removeUser;
		
		@FindBy(xpath="//div[text()='Invalid Group Name']")
		private WebElement invalidGroupNamePopup;
		
		
		//Favorites sections start
		



		
		//Clicking on the favorites 
		@FindBy(xpath="//a[text()='Favorites']")
		private WebElement clickFavouritesMenu;
		
		//Clicking on new Contact button under the favorites section
		@FindBy(xpath="//div[text()='New Contact']")
		private WebElement clicknewcontact;
		
		//clicking cancel button inside the Create New Personal Contact page
		@FindBy(xpath="//div[text()='Cancel']")
		private WebElement createContactCancelBtn;
		
		//Favorites Sections end
		

		
		
		//fields inside Create New Personal Contact title
		
		
		//personal contact first name field
		@FindBy(id="personal-directory-new-contact-first-name-input")
		private WebElement createContactFirstnameField;
		
		//personal contact last name text box field
		@FindBy(id="lastName")
		private WebElement createContactLastnameField;
		
		//personal contact relationship
		@FindBy(xpath="//div[@data-testid='personal-directory-new-contact-relationship-input']")
		private WebElement createContactRelationshipsField;
		
		//selecting a dropdown form a personal contact relationship
		@FindBy(xpath="//div[text()='Brother']")
		private WebElement createContactRelationshipDropdownField;
		
		
		//personal contact phone number field
		@FindBy(id="personal-directory-new-contact-phone-number-input")
		private WebElement createContactPhonenumberField;
		
		//personal contact mobile number field
		@FindBy(id="personal-directory-new-contact-mobile-number-input")
		private WebElement createContactMobilenumberField;
		
		//personal contact email address field
		@FindBy(id="personal-directory-new-contact-email-input")
		private WebElement createContactEmailAddress;
		
		//personal contact address field
		@FindBy(id="personal-directory-new-contact-address-input")
		private WebElement createContactAddressField;
		
		//personal contact city state zip field
		@FindBy(xpath="//div[@class=\"personal-directory-new-contact-city-state-zip-input\"]/textarea[@class='personal-directory-new-contact-textarea'][@placeholder='City State Zip']")
		private WebElement createContactCityStateZipField;
		
		//personal contact 2nd phone field
		@FindBy(id="personal-directory-new-contact-2nd-phone")
		private WebElement createContactSecondphoneField;
		
		//personal contact 2nd Mobile field
		@FindBy(id="personal-directory-new-contact-2nd-mobile")
		private WebElement createContactSecondmobileField;
		
		//personal contact 2nd Email field 
		@FindBy(id="personal-directory-new-contact-2nd-email")
		private WebElement createContactSecondemailField;
		
		//personal contact 3rd email field
		@FindBy(id="personal-directory-new-contact-3rd-email")
		private WebElement createContactThirdemailField;
		
		//personal contact job title field
		@FindBy(id="personal-directory-new-contact-job-title")
		private WebElement createContactJobtitleField;
	
		//personal contact department field
		@FindBy(id="personal-directory-new-contact-department")
		private WebElement createContactDepartmentField;
		
		//personal contact save contact button
		@FindBy(xpath="//div[text()='Save Contact']")
		private WebElement createContactSaveContactbtn;
		
		//No Groups Available error message reading 
		@FindBy(xpath="//div[text()='No Groups Available']")
		private WebElement readingNoGroupsAvailable;
		
		//selecting the value in the favorites sections group field
		//@FindBy(xpath="//label[text()='AravindGroups']")
		@FindBy(id="13")
		private WebElement selectingValueFromGroupsField;
		
		//success message popup screen once the save contact button has been clicked
		@FindBy(id="popup-title")
		private WebElement createContactSuccessMessage;
		
		@FindBy(xpath="//div[@class='custom-relation-label personal-directory-add-contact-to-group-add-button flexAlignCenterJustifyCenter']")
		private WebElement addUserButton;
		
		
		@FindBy(xpath = "//div[@class='personal-directory-new-group-contact-name']")
		private WebElement addedUserListOnGroup;
		
		//*****************Event Calendar**************************
		
		
		@FindBy(xpath = "//div[@class='no-monthly-event-data flexAlignCenterJustifyCenter']")
		private WebElement noEventAvailableTextMessage;
		
		@FindBy(id = "select-label-container")
		private WebElement calendarAndViewTypeDropDown;
		
		@FindBy(id = "calendar-next-month")
		private WebElement nextMonth;
		
		
		
		
	//************************************************************************	

		
		


		

		public WebElement getCommunityDirectoryMenuButton() {
			return communityDirectoryMenuButton;
		}

		public List<WebElement> getResidentList() {
			return residentList;
		}

		public List<WebElement> getResidentListInGridMode() {
			return residentListInGridMode;
		}


		public WebElement getGridIconButton() {
			return gridIconButton;
		}

		public WebElement getListIconButton() {
			return listIconButton;
		}

		public WebElement getSortByDropDown() {
			return sortByDropDown;
		}

		public List<WebElement> getSortByOptionList() {
			return sortByOptionList;
		}

		public WebElement getSortByOption() {
			return sortByOption;
		}

		public WebElement getCancelIconButton() {
			return cancelIconButton;
		}

		public WebElement getAddToContactButton() {
			return addToContactButton;
		}

		public WebElement getAddToContactPopupMessage() {
			return addToContactPopupMessage;
		}

		public WebElement getCloseButton() {
			return closeButton;
		}

		public WebElement getTapToEnlarge() {
			return TapToEnlarge;
		}

		public List<WebElement> getResidentProfileViewOption() {
			return residentProfileViewOption;
		}
		
		

		public WebElement getDefaultImg() {
			return defaultImg;
		}


		public WebElement getAvailableImg() {
			return availableImg;
		}


		public WebElement getPersonalInterestEditOption() {
			return personalInterestEditOption;
		}


		public WebElement getAvailablePersonalInterest() {
			return availablePersonalInterest;
		}


		public WebElement getPersonalInterestUpdate() {
			return PersonalInterestUpdate;
		}


		public WebElement getCancelIconResidentList() {
			return cancelIconResidentList;
		}

		public WebElement getCloseEnlargeImg() {
			return closeEnlargeImg;
		}

		public WebElement getEnLargedImgDisplay() {
			return enLargedImgDisplay;
		}


		public List<WebElement> getResidentName() {
			return residentName;
		}

		public WebElement getSearchBox() {
			return searchBox;
		}

		public WebElement getDiningServiceMenuButton() {
			return diningServiceMenuButton;
		}

		public WebElement getDataUnavailableMessage() {
			return dataUnavailableMessage;
		}

		public WebElement getRestaurantDropDownButton() {
			return restaurantDropDownButton;
		}

		public WebElement getHospice() {
			return hospice;
		}

		public WebElement getMealTypeDropDownButton() {
			return mealTypeDropDownButton;
		}

		public WebElement getCartIconButton() {
			return cartIconButton;
		}

		public WebElement getDessertMenu() {
			return dessertMenu;
		}

		public WebElement getSideMenu() {
			return sideMenu;
		}

		public WebElement getEntreeMenu() {
			return entreeMenu;
		}

		public WebElement getSoupMenu() {
			return SoupMenu;
		}

		public WebElement getSaladMenu() {
			return saladMenu;
		}

		public List<WebElement> getMenuItemList() {
			return menuItemList;
		}

		public WebElement getRareOption() {
			return rareOption;
		}

		public WebElement getMediumOption() {
			return mediumOption;
		}

		public WebElement getNotesOption() {
			return notesOption;
		}

		public WebElement getAddCartButton() {
			return addCartButton;
		}

		public WebElement getUpdateButton() {
			return updateButton;
		}

		public WebElement getMenuItemCancelIconButton() {
			return menuItemCancelIconButton;
		}

		public WebElement getChooseCustomizationToContinuePopup() {
			return chooseCustomizationToContinuePopup;
		}

		public WebElement getMaximumSelectionExceedMessage() {
			return maximumSelectionExceedMessage;
		}

		public WebElement getCurrentOrderSlider() {
			return currentOrderSlider;
		}

		public WebElement getPreOrderSlider() {
			return preOrderSlider;
		}

		public WebElement getDeleteMenuItem() {
			return deleteMenuItem;
		}

		public WebElement getCheckOutButton() {
			return checkOutButton;
		}

		public WebElement getClearCartButton() {
			return clearCartButton;
		}

		public WebElement getSelectAvailableTime() {
			return selectAvailableTime;
		}

		public WebElement getLocationCheckBox() {
			return locationCheckBox;
		}

		public WebElement getPlaceOrderButton() {
			return placeOrderButton;
		}

		public WebElement getBackButton() {
			return pageBackButton;
		}

		public List<WebElement> getDiningActiveEvent() {
			return diningActiveEvent;
		}

		public WebElement getPaymentOption() {
			return paymentOption;
		}

		public WebElement getOrderSuccessMessage() {
			return orderSuccessMessage;
		}

		public WebElement getSurveyMenuButton() {
			return surveyMenuButton;
		}


		public WebElement getNewSurveyToTakeTextMessage() {
			return NewSurveyToTakeTextMessage;
		}


		public List<WebElement> getTakeSurveyButton() {
			return takeSurveyButton;
		}


		public WebElement getRetakeSurveyButton() {
			return retakeSurveyButton;
		}


		public WebElement getPreviousSurveyCompletedTextMessage() {
			return previousSurveyCompletedTextMessage;
		}


		public List<WebElement> getSurveyOption() {
			return surveyOption;
		}


		public WebElement getSkipButton() {
			return skipButton;
		}


		public WebElement getPreviousButton() {
			return previousButton;
		}


		public WebElement getSurveySubmitButton() {
			return surveySubmitButton;
		}


		public WebElement getOpenTextField() {
			return openTextField;
		}


		public WebElement getPageBackButton() {
			return pageBackButton;
		}


		public WebElement getBulletinBaordMenuButton() {
			return bulletinBaordMenuButton;
		}


		public WebElement getRefreshButton() {
			return refreshButton;
		}


		public WebElement getBulletinDropDownButton() {
			return bulletinDropDownButton;
		}


		public WebElement getSelectAllCheckBox() {
			return selectAllCheckBox;
		}


		public List<WebElement> getDropDownOption() {
			return dropDownOption;
		}


		public WebElement getNextPageButton() {
			return nextPageButton;
		}


		public WebElement getPrevPageButton() {
			return prevPageButton;
		}


		public WebElement getDeleteMessage() {
			return deleteMessage;
		}


		public WebElement getPersonalContactsMenuButton() {
			return personalContactsMenuButton;
		}


		public WebElement getCreateNewContactsButton() {
			return createNewContactsButton;
		}


		public WebElement getFirstNameField() {
			return firstNameField;
		}


		public WebElement getLastNameField() {
			return lastNameField;
		}


		public WebElement getReleationshipOption() {
			return releationshipOption;
		}


		public WebElement getReleationshipButton() {
			return releationshipButton;
		}


		public WebElement getEnterCustomReleationShipButton() {
			return enterCustomReleationShipButton;
		}


		public WebElement getDoneButton() {
			return doneButton;
		}


		public WebElement getAddToGroupButton() {
			return addToGroupButton;
		}


		public WebElement getSaveToContactButton() {
			return saveToContactButton;
		}


		public WebElement getZipCodeField() {
			return zipCodeField;
		}


		public WebElement getSearchField() {
			return searchField;
		}


		public WebElement getNoGroupHaveAddedMessage() {
			return noGroupHaveAddedMessage;
		}


		public WebElement getDeleteIcon() {
			return deleteIcon;
		}


		public WebElement getEditIcon() {
			return editIcon;
		}


		public WebElement getContactUpdatedSuccessMessage() {
			return contactUpdatedSuccessMessage;
		}


		public WebElement getContactsMenuTabButton() {
			return ContactsMenuTabButton;
		}


		public WebElement getContactName() {
			return contactName;
		}


		public WebElement getCityStateTextName() {
			return cityStateTextName;
		}


		public WebElement getPhoneNumber1TextName() {
			return phoneNumber1TextName;
		}


		public WebElement getPhoneNumber2TextName() {
			return phoneNumber2TextName;
		}


		public WebElement getMobileNumber1TextName() {
			return mobileNumber1TextName;
		}


		public WebElement getMobileNumber2TextName() {
			return mobileNumber2TextName;
		}


		public WebElement getEmail1TextName() {
			return email1TextName;
		}


		public WebElement getEmail2TextName() {
			return email2TextName;
		}


		public WebElement getEmail3TextName() {
			return email3TextName;
		}


		public WebElement getJobTitleTextName() {
			return jobTitleTextName;
		}


		public WebElement getDepartmentTextName() {
			return departmentTextName;
		}


		public List<WebElement> getSortBy() {
			return sortBy;
		}


		public WebElement getSearchedContact() {
			return searchedContact;
		}


		public WebElement getSortByGroupName() {
			return sortByGroupName;
		}


		public WebElement getSortByFristName() {
			return sortByFristName;
		}


		public WebElement getSortByLastName() {
			return sortByLastName;
		}


		public WebElement getSortByAddress() {
			return sortByAddress;
		}


		public WebElement getFavoriteIcon() {
			return favoriteIcon;
		}


		public WebElement getPersonalContactCloseIcon() {
			return personalContactCloseIcon;
		}

		public WebElement getNoGroupAvailableTextMessage() {
			return noGroupAvailableTextMessage;
		}


		public WebElement getGroupAvailable() {
			return groupAvailable;
		}


		public WebElement getPhoneNumberField() {
			return phoneNumberField;
		}
		
		
		public WebElement getClickFavouritesMenu() {
			return clickFavouritesMenu;
		}


		public WebElement getClicknewcontact() {
			return clicknewcontact;
		}


		public WebElement getSingleContact() {
			return singleContact;
		}


		public WebElement getSortByButton() {
			return sortByButton;
		}


		public WebElement getContactViewCancelIcon() {
			return contactViewCancelIcon;
		}


		public List<WebElement> getPersonalContactList() {
			return personalContactList;
		}


		public WebElement getCreateContactCancelBtn() {
			return createContactCancelBtn;
		}


		public WebElement getPersonalsearchBox() {
			return personalsearchBox;
		}


		public WebElement getAddedUserListOnGroup() {
			return addedUserListOnGroup;
		}


		public WebElement getMaximumCharacterReached() {
			return maximumCharacterReached;
		}


		public WebElement getMaximumCharacterFiftyReached() {
			return maximumCharacterFiftyReached;
		}


		public WebElement getInvalidPrimaryEmailIDErrorMessage() {
			return invalidPrimaryEmailIDErrorMessage;
		}


		public WebElement getInvalidSecondaryEmailIDErrorMessage() {
			return InvalidSecondaryEmailIDErrorMessage;
		}


		public WebElement getInvalidThirdEmailIDErrorMessage() {
			return InvalidThirdEmailIDErrorMessage;
		}


		public WebElement getFirstLetterCannotSpaceErrorMessage() {
			return firstLetterCannotSpaceErrorMessage;
		}


		public WebElement getAlphaNumericErrorMessage() {
			return alphaNumericErrorMessage;
		}


		public WebElement getFieldLengthSeventyErrorMessage() {
			return fieldLengthSeventyErrorMessage;
		}


		public WebElement getNumericCharacterErrorMessage() {
			return numericCharacterErrorMessage;
		}


		public WebElement getAddUserbuttonOnGroup() {
			return addUserbuttonOnGroup;
		}


		public WebElement getNoEventAvailableTextMessage() {
			return noEventAvailableTextMessage;
		}


		public WebElement getCalendarAndViewTypeDropDown() {
			return calendarAndViewTypeDropDown;
		}


		public WebElement getNextMonth() {
			return nextMonth;
		}


		public WebElement getCreateContactFirstnameField() {
			return createContactFirstnameField;
		}


		public WebElement getCreateContactLastnameField() {
			return createContactLastnameField;
		}


		public WebElement getCreateContactRelationshipsField() {
			return createContactRelationshipsField;
		}


		public WebElement getCreateContactRelationshipDropdownField() {
			return createContactRelationshipDropdownField;
		}


		public WebElement getCreateContactPhonenumberField() {
			return createContactPhonenumberField;
		}


		public WebElement getCreateContactEmailAddress() {
			return createContactEmailAddress;
		}


		public WebElement getCreateContactAddressField() {
			return createContactAddressField;
		}


		public WebElement getCreateContactCityStateZipField() {
			return createContactCityStateZipField;
		}


		public WebElement getCreateContactSecondphoneField() {
			return createContactSecondphoneField;
		}


		public WebElement getCreateContactJobtitleField() {
			return createContactJobtitleField;
		}


		public WebElement getCreateContactDepartmentField() {
			return createContactDepartmentField;
		}


		public WebElement getCreateContactSaveContactbtn() {
			return createContactSaveContactbtn;
		}
		

		public WebElement getCreateContactSuccessMessage() {
			return createContactSuccessMessage;
		}

		public WebElement getCreateContactMobilenumberField() {
			return createContactMobilenumberField;
		}


		public WebElement getCreateContactSecondmobileField() {
			return createContactSecondmobileField;
		}


		public WebElement getCreateContactSecondemailField() {
			return createContactSecondemailField;
		}


		public WebElement getCreateContactThirdemailField() {
			return createContactThirdemailField;
		}
		
		
		public WebElement getReadingNoGroupsAvailable() {
			return readingNoGroupsAvailable;
		}

		public WebElement getClickGroupsMenu() {
			return clickGroupsMenu;
		}


		public WebElement getClickNewGroup() {
			return clickNewGroup;
		}


		public WebElement getVerifyingtheCreateNewGroupTitle() {
			return verifyingtheCreateNewGroupTitle;
		}


		public WebElement getSelectingavalueFromAddContactsToGroup() {
			return selectingavalueFromAddContactsToGroup;
		}
		
		
		public WebElement getClickOnSaveBtn() {
			return clickOnSaveBtn;
		}


		public WebElement getEnterGroupnameDisplayCheck() {
			return enterGroupnameDisplayCheck;
		}


		public WebElement getInvalidGroupNamePopup() {
			return invalidGroupNamePopup;
		}


		public WebElement getOkButton() {
			return clickingonOkButton;
		}


		public WebElement getCreateNewGroupGroupNameField() {
			return createNewGroupGroupNameField;
		}
		
		public WebElement getGroupNameAlreadyExistMessage() {
			return groupNameAlreadyExistMessage;
		}


		public WebElement getSelectingValueFromGroupsField() {
			return selectingValueFromGroupsField;
		}
		
		public WebElement getClickingonOkButton() {
			return clickingonOkButton;
		}


		public WebElement getSelectingcheckboxinsidegroupfield() {
			return Selectingcheckboxinsidegroupfield;
		}
		
		public WebElement getVerifyingGroupAvailableorNot() {
			return verifyingGroupAvailableorNot;
		}
		
		public List<WebElement> getgroupList() {
			return GroupList;
		}
		
		public WebElement getEditingTheValueDynamically() {
			return editingTheValueDynamically;
		}
		
		public WebElement getEditIconGroupSection() {
			return editIconGroupSection;
		}

		public WebElement getRemoveUser() {
			return removeUser;
		}

		public WebElement getAddUserButton() {
			return addUserButton;
		}


		public WebElement getDeleteIconGroupSection() {
			return deleteIconGroupSection;
		}


		public WebElement getClickingonDeleteButton() {
			return clickingonDeleteButton;
		}


		public WebElement getEditTextBoxGroupsField() {
			return editTextBoxGroupsField;
		}
		
		public WebElement getAutoclickonDeleteValueintheGroupField() {
			return autoclickonDeleteValueintheGroupField;
		}
		
		
	}
	
	
