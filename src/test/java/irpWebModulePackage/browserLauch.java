package irpWebModulePackage;

import Base.Base_class;

public class browserLauch extends Base_class {
    browserLauch() {
        RequestedBrowserWillBelaunch("chrome");
        //driver.manage().window().maximize();
        RequestedUrlwillBeLaunch("https://e2testing.mycatie.com/ccrc_v2"); 
    }
    public void callingBrowser() {
     System.out.println("Hi bro");   
    }
}
