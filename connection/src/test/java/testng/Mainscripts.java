//package testng;
//
//import org.testng.annotations.Test;
//
//import element.elements;
//import io.github.bonigarcia.wdm.WebDriverManager;
//import utilities.objectrepo;
//import utilities.screenshot;
//
//import org.testng.annotations.BeforeTest;
//
//import java.io.IOException;
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.AfterTest;
//
//public class Mainscripts {
//	 WebDriver driver;
//	elements ele;
//	objectrepo object=new objectrepo();
//	screenshot screen=new screenshot();
//  @Test
//  public void f() throws IOException, InterruptedException {
//	//elements initialize
//	    driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
//		ele=new elements(driver);
//		ele.usernameAndpassword(object.obj().getProperty("usernames"), object.obj().getProperty("password"));
//		ele.login();
//  }
//  @BeforeTest
//  public void beforeTest() {
//	  WebDriverManager.chromedriver().setup();
//		driver=new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
//		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//
//  }
////  Tell me and I forget, teach me and I remember, involve me and I learn.
//  @AfterTest
//  public void afterTest() {
//	  driver.close();
//  }
//
//}
