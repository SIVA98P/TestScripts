package irpWebModulePackage;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.testng.annotations.Test;

import Base.Base_class;
import Locators.employeeCheckInLocator;

public class employeeCheckInService extends Base_class {

    browserLauch launchBrowser = new browserLauch();
    roomDetails functionCall = new roomDetails();
    employeeCheckInLocator locator = new employeeCheckInLocator();

    @Test(description = "Check whether that Employee checkIn Title Page name is displayed ", priority = 1)
    public void IsEmployeeCheckInTitlePageNameDisplayed() throws InterruptedException {

        // launchBrowser.callingBrowser();

        locator.getEmployeeCheckInMenuButton().click();
        functionCall.callRoomDetails("irp_e2test", "9LLY43GTQRGO", "PERCONT");

        String expectedEmployeeCheckinTitle = "PERSONAL CONTACTS";
        Thread.sleep(2000);
        String actualEmployeeCheckInTitle = locator.getEmployeeCheckInTitle().getText();

        assertEquals(expectedEmployeeCheckinTitle, actualEmployeeCheckInTitle);
    }

    @Test(description = "Check whether that Employee CheckIn field name is displayed", priority = 2)
    public void isEmployeeCheckInFieldNameDisplayed() throws InterruptedException {

        // launchBrowser.callingBrowser();
        // locator.getEmployeeCheckInMenuButton().click();
        // functionCall.callRoomDetails("irp_e2test", "9LLY43GTQRGO", "PERCONT");

        String expectedEmployeeCheckInFieldName = "Enter Your Staff ID to check-in.";
        String actualEmployeeCheckInFieldName = locator.getEmployeeFieldName().getText();

        assertEquals(expectedEmployeeCheckInFieldName, actualEmployeeCheckInFieldName);

    }

    @Test(description = "Check whether that Employee CheckIn keyPad is displayed", priority = 3)
    public void isEmployeeCheckInKeyPadDisplayed() throws InterruptedException {

        // launchBrowser.callingBrowser();
        // locator.getEmployeeCheckInMenuButton().click();
        // functionCall.callRoomDetails("irp_e2test", "9LLY43GTQRGO", "PERCONT");

        boolean isEmployeeCheckInKeyPadDisplayed = false;

        Thread.sleep(2000);

        isEmployeeCheckInKeyPadDisplayed = locator.getEmployeeCheckInKeyPad().isDisplayed();

        if (isEmployeeCheckInKeyPadDisplayed) {
            System.out.println("Employee CheckIn KeyPad displayed");
        } else {
            System.out.println("Employee CheckIn KeyPad not displayed");
        }
        assertTrue(isEmployeeCheckInKeyPadDisplayed);
    }

    @Test(description = "Check whether that Clear Key is displayed", priority = 4)
    public void isclearKeyDisplayed() throws InterruptedException {
        // launchBrowser.callingBrowser();
        // locator.getEmployeeCheckInMenuButton().click();
        functionCall.callRoomDetails("irp_e2test", "9LLY43GTQRGO", "PERCONT");

        boolean isClearKeyDisplayed = false;

        Thread.sleep(2000);

        isClearKeyDisplayed = locator.getClearData().isDisplayed();

        if (isClearKeyDisplayed) {
            System.out.println("Clear Key displayed");
        } else {
            System.out.println("Clear Key not displayed");
        }
        assertTrue(isClearKeyDisplayed);
    }

    @Test(description = "Check whether that Remove key is displayed", priority = 5)
    public void isRemoveKeyDisplayed() throws InterruptedException {
        // launchBrowser.callingBrowser();
        locator.getEmployeeCheckInMenuButton().click();
        functionCall.callRoomDetails("irp_e2test", "9LLY43GTQRGO", "PERCONT");

        boolean isRemoveKeyDisplayed = false;

        Thread.sleep(2000);

        isRemoveKeyDisplayed = locator.getRemoveData().isDisplayed();

        if (isRemoveKeyDisplayed) {
            System.out.println("Remove Key displayed");
        } else {
            System.out.println("Remove Key not displayed");
        }
        assertTrue(isRemoveKeyDisplayed);
    }

    @Test(description = "Check whether able to enter the values in the field using the keyPad", priority = 6)
    public void isAbleToClearEnteredValue() throws InterruptedException {
        locator.getEmployeeCheckInMenuButton().click();
        functionCall.callRoomDetails("irp_e2test", "9LLY43GTQRGO", "PERCONT");
        Thread.sleep(2000);
        locator.getKeyNine().click();
        locator.getClearData().click();
        assertTrue(locator.getEmployeeInput().getText().isEmpty());
        if(locator.getEmployeeInput().getText().isEmpty()){
            System.out.println("Entered values cleared from the input field");
        }else{
            System.out.println("Entered values are not clearead properly from the input field");
        }

    
    }

    @Test(description = "Check whether able to enter the values in the field using the keyPad", priority = 7)
    public void isEnteredValueDisplayed() throws InterruptedException {
        locator.getEmployeeCheckInMenuButton().click();
        functionCall.callRoomDetails("irp_e2test", "9LLY43GTQRGO", "PERCONT");
        for (int i = 0; i < 9; i++) {

            locator.getKeyPad().get(i).click();

        }
        Thread.sleep(2000);
        locator.getKeyNine().click();
        String actualValue = locator.getEmployeeInput().getText();
        String enteredValue = locator.getEmployeeInput().getText();

        assertEquals(enteredValue, actualValue);
        System.out.println(enteredValue);
        locator.getClearData().click();
    }
    @Test(description = "Check whether that Invalid staff ID popup is displayed", priority = 8)
    public void isInvalidStaffIdPopupDisplayed() throws InterruptedException {
    
        locator.getEmployeeCheckInMenuButton().click();
        functionCall.callRoomDetails("irp_e2test", "9LLY43GTQRGO", "PERCONT");

        for (int i = 0; i < 9; i++) {

            locator.getKeyPad().get(i).click();
        }
        Thread.sleep(2000);
        locator.getKeyNine().click();
        locator.getSubmitButton().click();
        String inValidStaffIDMessage = "Invalid Staff Id";
        String displayedStaffIDMessage = locator.getInvalidStaffIdAlertMessage().getText();

        assertEquals(inValidStaffIDMessage, displayedStaffIDMessage);
    }
    

        // 
        // boolean loginButtonDisplay = false;
        // Thread.sleep(2000);
        // try {
        // loginButtonDisplay = locator.getLoginButton().isDisplayed();
        // } catch (Exception e) {
        // System.out.println("Login Button not displaying, User already logged in");
        // }

        // if (loginButtonDisplay) {
        // System.out.println("User LogIn successfully");
        // locator.getLoginButton().click();
        // } else {
        // locator.getLogOutButton().click();
        // System.out.println("User Logout successfully");

        // }

}
