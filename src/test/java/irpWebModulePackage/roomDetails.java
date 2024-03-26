package irpWebModulePackage;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.html5.LocalStorage;
import org.testng.annotations.Test;

import Base.Base_class;
public class roomDetails extends Base_class {
	
	@Test
	public void callRoomDetails() {

	JavascriptExecutor js = (JavascriptExecutor)driver;
	js.executeScript("document.getElementById('roomNumber').innerHTML='irp_e2test'");
	js.executeScript("document.getElementById('userId').innerHTML='9LLY43GTQRGO'");
	js.executeScript("document.getElementById('menuReference').innerHTML='PERCONT'");
	js.executeScript("document.getElementById('residentName').innerHTML='allen'");
	js.executeScript("var aevent = new Event('initCCRC');document.dispatchEvent(aevent)");

	}
	public void callRoomDetailsForSurvey() {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.getElementById('roomNumber').innerHTML='irp_e2test'");
		js.executeScript("document.getElementById('userId').innerHTML='9LLY43GTQRGO'");
		js.executeScript("document.getElementById('menuReference').innerHTML='SUR'");
		js.executeScript("document.getElementById('residentName').innerHTML='allen'");
		js.executeScript("var aevent = new Event('initCCRC');document.dispatchEvent(aevent)");
		
	}
	public void callRoomDetailsForBulletinBoard() {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.getElementById('roomNumber').innerHTML='irp_e2test'");
		js.executeScript("document.getElementById('userId').innerHTML='9LLY43GTQRGO'");
		js.executeScript("document.getElementById('menuReference').innerHTML='TXTMSG'");
		js.executeScript("document.getElementById('residentName').innerHTML='allen'");
		js.executeScript("var aevent = new Event('initCCRC');document.dispatchEvent(aevent)");
		
	}

	
}
