package TestNgExamples;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {
  @Test
  public void f() {
	  WebDriverManager.chromedriver().setup();
		// Launch Browser
	WebDriver driver = new ChromeDriver();



		// maximize browser
		driver.manage().window().maximize();
		driver.get("http://only-testing-blog.blogspot.com/2014/01/textbox.html");
		


  }
}
