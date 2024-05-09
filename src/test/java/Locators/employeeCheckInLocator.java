package Locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Base.Base_class;

public class employeeCheckInLocator extends Base_class {

public employeeCheckInLocator() {

			PageFactory.initElements(driver, this);
		}

    
    //********* Employee Check_In**********
	
		@FindBy(id = "header-title")
		private WebElement employeeCheckInTitle;

		@FindBy(xpath = "//div[@class='employee-checkin-title']")
		private WebElement employeeFieldName;

		@FindBy(xpath = "//div[@class='employee-checkin-keypad-container flexWrap']")
		private WebElement employeeCheckInKeyPad;
		
		@FindBy(xpath = "//a[text()='employeeCheckin/']")
		private WebElement employeeCheckInMenuButton;
		
		@FindBy(xpath = "//div[text()='Loading']")
		private WebElement loadingScreen;
		
		@FindBy(xpath = "//div[@class='employee-checkin-entry-input']")
		private WebElement employeeInput;
		
		@FindBy(xpath = "//div[@class='employee-checkin-keypad-item']")
		private List<WebElement> KeyPad;

		
		@FindBy(id = "1")
		private WebElement keyOne;
		
		@FindBy(id = "2")
		private WebElement keyTwo;
		
		@FindBy(id = "3")
		private WebElement keyThree;
		
		@FindBy(id = "4")
		private WebElement keyFour;
		
		@FindBy(id = "5")
		private WebElement keyFive;
		
		@FindBy(id = "6")
		private WebElement keySix;
		
		@FindBy(id = "7")
		private WebElement keySeven;
		
		@FindBy(id = "8")
		private WebElement keyEight;
		
		@FindBy(id = "9")
		private WebElement keyNine;
		
		@FindBy(id = "0")
		private WebElement keyZero;
		
		@FindBy(xpath = "//div[text()='C']")
		private WebElement clearData;
		
		@FindBy(xpath = "//div[@class='employee-checkin-backspace flexAlignCenterJustifyCenter']")
		private WebElement removeData;
		
		@FindBy(xpath = "//div[text()='Staff Id must be minimum 6 Digits']")
		private WebElement minimumSixDigitAlertMessage;
		
		@FindBy(xpath = "//div[text()='Staff Id Length Must Be 10 Digit']")
		private WebElement TenDigitAlertMessage;
		
		@FindBy(id = "popup-description")
		private WebElement invalidStaffIdAlertMessage;
		
		@FindBy(xpath = "//div[@class='employee-status-update-title']")
		private WebElement employeeUserName;
		
		@FindBy(xpath = "//button[text()='Login']")
		private WebElement loginButton;
		
		@FindBy(xpath = "//div[text()='Activity Logged']")
		private WebElement activityLoggedAlertMessage;
		
		@FindBy(xpath = "//button[text()='Log out']")
		private WebElement logOutButton;
		
		@FindBy(xpath = "//button[@data-testid='employee-checkIn-btn']")
		private WebElement submitButton;
    

		public WebElement getEmployeeCheckInMenuButton() {
			return employeeCheckInMenuButton;
		}
		
		public WebElement getEmployeeCheckInTitle() {
			return employeeCheckInTitle;
		}

		public WebElement getEmployeeFieldName() {
			return employeeFieldName;
		}

		public WebElement getEmployeeCheckInKeyPad() {
			return employeeCheckInKeyPad;
		}

		public WebElement getLoadingScreen() {
			return loadingScreen;
		}

		public WebElement getEmployeeInput() {
			return employeeInput;
		}

		public WebElement getKeyOne() {
			return keyOne;
		}

		public WebElement getKeyTwo() {
			return keyTwo;
		}

		public WebElement getKeyThree() {
			return keyThree;
		}

		public WebElement getKeyFour() {
			return keyFour;
		}

		public WebElement getKeyFive() {
			return keyFive;
		}

		public WebElement getKeySix() {
			return keySix;
		}

		public WebElement getKeySeven() {
			return keySeven;
		}

		public WebElement getKeyEight() {
			return keyEight;
		}

		public WebElement getKeyNine() {
			return keyNine;
		}

		public WebElement getKeyZero() {
			return keyZero;
		}

		public WebElement getClearData() {
			return clearData;
		}

		public WebElement getRemoveData() {
			return removeData;
		}

		public WebElement getMinimumSixDigitAlertMessage() {
			return minimumSixDigitAlertMessage;
		}

		public WebElement getTenDigitAlertMessage() {
			return TenDigitAlertMessage;
		}

		public WebElement getInvalidStaffIdAlertMessage() {
			return invalidStaffIdAlertMessage;
		}

		public WebElement getEmployeeUserName() {
			return employeeUserName;
		}

		public WebElement getLoginButton() {
			return loginButton;
		}

		public WebElement getActivityLoggedAlertMessage() {
			return activityLoggedAlertMessage;
		}

		public WebElement getLogOutButton() {
			return logOutButton;
		}

		public List<WebElement> getKeyPad() {
			return KeyPad;
		}

		public WebElement getSubmitButton() {
			return submitButton;
		}

		

		
}
