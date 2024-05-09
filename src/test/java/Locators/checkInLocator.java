package Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class checkInLocator {

	public checkInLocator(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
		
    	@FindBy(xpath = "//a[text()='checkIn/']")
		private WebElement checkInMenuButton;
		
        @FindBy(xpath = "//div[@class='popup-description flexAlignCenterJustifyCenter']")
        private WebElement checkInMessageSentPopup;
        
		@FindBy(xpath = "//div[text()='Ok']")
		private WebElement checkInOkButton;
		
		@FindBy(xpath = "//div[@class='checkIn-btn']")
		private WebElement checkInNowButton;
		
		@FindBy(id = "popup-description")
        private WebElement checkInAlreadySent;

        @FindBy(xpath = "//div[@class='checkIn-title']")
        private WebElement checkInPopupTitle;
        

        public WebElement getCheckInMenuButton() {
			return checkInMenuButton;
		}

		public WebElement getCheckInOkButton() {
			return checkInOkButton;
		}

		public WebElement getCheckInNowButton() {
			return checkInNowButton;
		}

		public WebElement getCheckInAlreadySent() {
			return checkInAlreadySent;
		}

        public WebElement getCheckInPopupTitle() {
            return checkInPopupTitle;
        }

        public WebElement getCheckInMessageSentPopup() {
            return checkInMessageSentPopup;
        }
        
}
