package Alerts_pro;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.UnreachableBrowserException;

import Alerts_pro.Browserfactory;

public class Browserge {
private static WebDriver Driver;
	
	public static WebDriver getCurrentDriver(String browserType) {
	
		if(Driver==null) {
			
			try {
				
				Driver = Browserfactory.startBrowser(browserType);				
				
			}catch(UnreachableBrowserException e) {
				e.printStackTrace();
			}
		}
		
		return Driver;
		
	}
	
	
	public static WebDriver getCurrentDriver()  {
		
		return getCurrentDriver("chrome");
		
	}


	public static void evaluate_script(String string) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}


