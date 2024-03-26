package irpWebModulePackage;

import org.testng.annotations.Test;

import Base.Base_class;
import Locators.webModuleElementLocator;

public class Survey extends Base_class{
	@Test
	public void surveyWebModule() throws InterruptedException {

		RequestedBrowserWillBelaunch("chrome");
		driver.manage().window().maximize();
		RequestedUrlwillBeLaunch("https://e2testing.mycatie.com/ccrc_v2/");

		webModuleElementLocator locator = new webModuleElementLocator();
		roomDetails functionCall = new roomDetails();

		locator.getSurveyMenuButton().click();
		functionCall.callRoomDetailsForSurvey();
		boolean takeSurveyButtonDisplay = false;
		int i = 0, j = 0;
		Thread.sleep(2000);
		try {
			takeSurveyButtonDisplay = locator.getTakeSurveyButton().get(i).isDisplayed();
		} catch (Exception e) {
			System.out.println("New Survey locator not found here");
		}

		// *********Taking Survey for the newly received.*********
		if (takeSurveyButtonDisplay) {
			System.out.println("Take Survey Button available");

			while (i < locator.getTakeSurveyButton().size()) {
				System.out.println("Available survey Size" + locator.getTakeSurveyButton().size());
				Thread.sleep(5000);
				locator.getTakeSurveyButton().get(i).click();

				while (j < locator.getSurveyOption().size()) {

					//System.out.println("Available survey's option Size" + locator.getSurveyOption().size());
					
					locator.getSurveyOption().get(j).click();

					boolean openTextFieldDisplay = false;
					Thread.sleep(2000);

					try {
						openTextFieldDisplay = locator.getOpenTextField().isDisplayed();
					} catch (Exception e) {
						
						System.out.println("Open Text field locator not found");

					}
					if (openTextFieldDisplay) {

						System.out.println("Open text field available");
						locator.getOpenTextField().sendKeys("I need more options");
						// *********Checking next button is option is displaying*********

						boolean nextButtonDisplay = false;
						Thread.sleep(2000);
						try {
							nextButtonDisplay = locator.getSkipButton().isDisplayed();
						} catch (Exception e) {
							System.out.println("Skip button locator not found");
						}

						if (nextButtonDisplay) {
							System.out.println("Next Button display");
							Thread.sleep(2000);
							locator.getSkipButton().click();
							Thread.sleep(2000);
							locator.getSurveyOption().get(j).click();
						}
						else {
						System.out.println("Submit Button display");
						Thread.sleep(2000);
						locator.getSurveySubmitButton().click();
						Thread.sleep(2000);
						locator.getCloseButton().click();
					}
					boolean secondnextButtonDisplay = false;
					Thread.sleep(2000);
					try {
						secondnextButtonDisplay = locator.getSkipButton().isDisplayed();
					} catch (Exception e) {
						System.out.println("Skip button locator not found");
					}
					if (secondnextButtonDisplay) {

						System.out.println("Again Next Button display");
						Thread.sleep(2000);

						randomchooser(locator.getSurveyOption());
						Thread.sleep(2000);
						locator.getSurveySubmitButton().click();
						locator.getCloseButton().click();
					} 
					else {
						System.out.println("Submit Button display");
						Thread.sleep(2000);
						locator.getSurveySubmitButton().click();
						Thread.sleep(2000);
						locator.getCloseButton().click();
					}
					}else {
						System.out.println("Custom option not available here");
					}

					j++;
					 if(j == locator.getSurveyOption().size()) {
						 boolean nextButtonDisplay = false;
						 Thread.sleep(2000);
							try {
								nextButtonDisplay = locator.getSkipButton().isDisplayed();
							} catch (Exception e) {
								System.out.println("Skip button locator not found");
							}
//						Thread.sleep(2000);
//						randomchooser(locator.getSurveyOption());
						Thread.sleep(2000);
						if (nextButtonDisplay) {
							System.out.println("Next Button display");
							Thread.sleep(2000);
							locator.getSkipButton().click();
							Thread.sleep(2000);
						
						}
						else {
						System.out.println("Submit Button display");
						Thread.sleep(2000);
						locator.getSurveySubmitButton().click();
						Thread.sleep(2000);
						locator.getCloseButton().click();
						break;
					}
					 }
					 
					 
				}

				i++;

			}

		} else {
			// **********ReTaking the Survey....**************
			System.out.println("No New Survey not available here,So Retaking the Survey");
			boolean retakingSurveyButtonDisplay = false;
			Thread.sleep(2000);
			try {
				retakingSurveyButtonDisplay = locator.getRetakeSurveyButton().isDisplayed();
			} catch (Exception e) {
				System.out.println("Skip button locator not found");
			}
			if (retakingSurveyButtonDisplay) {
				Thread.sleep(2000);
				locator.getRetakeSurveyButton().click();
				Thread.sleep(2000);
				locator.getSkipButton().click();
				Thread.sleep(2000);
				locator.getCloseButton().click();
				//back();

			} 
			else {
				System.out.println("Previous Survey not available here,So Redirecting to the Menu Page");
				back();

			}

		}

	}

}
