package Hooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import Mini_project_all_in_one.BrowserDriver;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class BrowserLauncher {
	@Before
	   public void startBrowser() {
		   //BrowserDriver.getCurrentDriver("chrome").get("https://www.stqatools.com/demo/Alerts.php");
		BrowserDriver.getCurrentDriver("chrome").get("https://www.eduvidya.com/");
	   }
	@AfterStep
	public void addScreenshot(Scenario scenario){

		//validate if scenario has failed
		if(scenario.isFailed()) {
			final byte[] screenshot = ((TakesScreenshot) BrowserDriver.getCurrentDriver()).getScreenshotAs(OutputType.BYTES);
			scenario.attach(screenshot, "image/png", "image"); 
		}
	}
	@After
	public void closebrowser() throws InterruptedException {
		Thread.sleep(2000);
		BrowserDriver.getCurrentDriver().close();
	}
}
