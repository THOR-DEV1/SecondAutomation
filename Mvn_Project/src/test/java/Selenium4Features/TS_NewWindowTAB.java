package Selenium4Features;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TS_NewWindowTAB {
	WebDriver driver;
  @Test
  public void features() {
	  WebDriverManager.chromedriver().setup();
		// Launch Browser
		WebDriver driver = new ChromeDriver();
		// maximize browser
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		//driver.switchTo().newWindow(WindowType.WINDOW);
        driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().to("http://only-testing-blog.blogspot.com/2014/01/textbox.html");
  }
}
