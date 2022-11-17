package TestNgExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioBtn {
  @Test
  public void f() throws InterruptedException {
	  WebDriverManager.chromedriver().setup();
		// Launch Browser
		WebDriver driver = new ChromeDriver();
		// maximize browser
		driver.get("http://only-testing-blog.blogspot.com/2014/01/textbox.html");
		driver.manage().window().maximize();
		driver.findElement(By.id("check1")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("check2")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("check3")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("radio1")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("radio2")).click();
		Thread.sleep(1000);
  }
}
