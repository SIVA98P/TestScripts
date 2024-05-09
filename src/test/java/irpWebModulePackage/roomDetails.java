package irpWebModulePackage;

import org.openqa.selenium.JavascriptExecutor;

import Base.Base_class;
public class roomDetails extends Base_class {
	
	
	public void callRoomDetails( String roomNumber, String userId, String menuReference) {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("document.getElementById('roomNumber').innerHTML='"+roomNumber+"'");
		js.executeScript("document.getElementById('userId').innerHTML='"+userId+"'");
		js.executeScript("document.getElementById('menuReference').innerHTML='"+menuReference+"'");
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
