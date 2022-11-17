package Alert_Hooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import Config.BrowserDriver;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Alerthook {

	
	

	  @Before
	  public void startBrowser() {
		   BrowserDriver.getCurrentDriver("edge").get("http://cookbook.seleniumacademy.com/Alerts.html");
}
	  
	  @AfterStep
		public void addScreenshot(Scenario scenario){

			//validate if scenario has failed
			if(scenario.isFailed()) {
				final byte[] screenshot = ((TakesScreenshot) BrowserDriver.getCurrentDriver()).getScreenshotAs(OutputType.BYTES);
				scenario.attach(screenshot, "image/png", "image"); 
			}
	  
	  
	  }
	  
}
