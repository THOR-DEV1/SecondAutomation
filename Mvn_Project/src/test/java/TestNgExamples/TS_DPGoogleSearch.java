package TestNgExamples;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class TS_DPGoogleSearch {
	WebDriver driver;
	public void openBrowser() {
		 WebDriverManager.chromedriver().setup();
			// Launch Browser
			driver = new ChromeDriver();
		
	}
  @Test(dataProvider = "dp")
  public void f(String s) {
	   
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));



		// maximize browser
		driver.manage().window().maximize();



		// Enter URL
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys(s);
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] {"ST" },
      new Object[] {"Testing" },
      new Object[] {"Testing" },
      new Object[] {"Testing" },
    };
  }
}
