package TestNgExamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TS_MultipleBrowser {
	WebDriver driver;
	@BeforeClass
	@Parameters({ "browser" })
	public void setup(String browser1) throws InterruptedException {
		if (browser1.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();// interface
		} else if (browser1.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		} else if (browser1.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
	}
	
	
	@Test
	public void verifyTitle() {
		String title = driver.getTitle();
		if (title.equalsIgnoreCase("google")) {
			System.out.println("Passs");
		} else {
			System.out.println("Fail");
		}
	}
	
	@AfterClass
	public void closeBrowser() {
		driver.quit();//closes all instances(browsers)
		//close() - closes main / parent browser / Single instance
	}
	
}
