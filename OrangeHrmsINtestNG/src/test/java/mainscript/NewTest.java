package mainscript;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import utilities.objectrepo;

public class NewTest extends objectrepo{
	WebDriver driver;
	
  @Test(dataProvider = "dp",priority=0)
  public void f(Integer n, String s,String d) throws InterruptedException {
	 driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
	 driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys(s);
	 driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys(d);
	 driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
	  
  }
  @AfterMethod()
  public void logout() throws InterruptedException {
	    String aurl="https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList";
		 String eurl=driver.getCurrentUrl();
		 if(aurl.equals(eurl)) {
		 driver.findElement(By.xpath("(//*[contains(@id,'app')]//following::p)[1]")).click();
		 driver.findElement(By.xpath("//*[contains(@class,'oxd-userdropdown')]//following::li[4]")).click();
		 }else {
			Assert.assertEquals(aurl, eurl);
		 }
  }
  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "admin" ,"admin123"},
      new Object[] { 2, "ADMIN","FFf" },
    };
  }
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	  System.out.println("started");
	  WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() throws InterruptedException {
	  
	  System.out.println("closed");
	  driver.close();
  }

}
