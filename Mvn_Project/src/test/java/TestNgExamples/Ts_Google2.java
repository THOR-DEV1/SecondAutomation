package TestNgExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ts_Google2 {
  @Test
  public void validatemsg() throws InterruptedException {
	  String msg;
	  WebDriverManager.chromedriver().setup();
	// Launch Browser
	WebDriver driver = new ChromeDriver();



	// maximize browser
	driver.manage().window().maximize();



	// Enter URL
	driver.get("http://only-testing-blog.blogspot.com/2014/01/textbox.html");

	driver.findElement(By.xpath("//*[@id=\'post-body-4292417847084983089\']/div[1]/button[1]")).click();
	Thread.sleep(2000);

	driver.switchTo().alert().accept(); //OK

	WebElement lblmsg = driver.findElement(By.id("demo"));
	msg=lblmsg.getText();//label(text)
	System.out.println(msg);

	Thread.sleep(2000);
	if(msg.equals("You pressed OK!")) {
	System.out.println("Clicked on OK button");
	}


	driver.findElement(By.xpath("//*[@id=\'post-body-4292417847084983089\']/div[1]/button[1]")).click();
	Thread.sleep(2000);

	driver.switchTo().alert().dismiss();
	msg=lblmsg.getText();//label(text)
	System.out.println(msg);

	Thread.sleep(2000);


	driver.close();
  }
}
