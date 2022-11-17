package fefe;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.UnreachableBrowserException;

public class browserdriver {
	private static WebDriver driver;
public static WebDriver getcurrrentdriver(String browsertype) {
	if(driver==null) {
		try {
			driver=factory.startbrowser(browsertype);
		}
		catch(UnreachableBrowserException e){
			e.printStackTrace();
		}
	}
		
	
	return driver;
	
}
public static WebDriver getcurrentdriver() {
	return getcurrrentdriver("chrome");
	
}
}
