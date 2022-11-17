//package testng;
//
//import elements.elements;
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.DataProvider;
//import org.testng.annotations.Test;
//
//import java.util.concurrent.TimeUnit;
//
//public class Jira {
//	WebDriver driver;
//	elements ele;
//	screenshot screen=new screenshot();
//  @Test(dataProvider = "dp")
//  public void f(int i,String s,String d) throws InterruptedException {
//	  driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
//
//	  ele=new elements(driver);
//	  ele.usernameAndpassword(s,d);
//	  ele.login();
//
//	 String ss=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[1]/span/h6")).getText();
// 	 System.out.println(ss);
// 	 String dd="PIM";
//      if(ss.equals(dd)) {
//
//		 driver.findElement(By.xpath("(//*[contains(@id,'app')]//following::p)[1]")).click();
//		 driver.findElement(By.xpath("//*[contains(@class,'oxd-userdropdown')]//following::li[4]")).click();
//      }
//
//
//  }
//
//  @BeforeTest
//  public void beforeTest() {
//	    WebDriverManager.chromedriver().setup();
//		driver=new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
//		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//  }
//
//  @AfterTest
//  public void afterTest() throws InterruptedException {
//	  driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
//	  driver.close();
//  }
//  @DataProvider
//  public Object[][] dp() {
//    return new Object[][] {
//      new Object[] { 1, "admin" ,"admin123"},
//      new Object[] { 2, "ADMIN","FFf" },
//    };
//  }
//
//}
