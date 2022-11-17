import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class main {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriver driver;
		elements ele;
		objectrepo object=new objectrepo();
		screenshot screen=new screenshot();
		//webdriver
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//elements initialize		
		ele=new elements(driver);
		ele.usernameAndpassword(object.obj().getProperty("username"), object.obj().getProperty("password"));
		ele.login();
		//PIM
		driver.findElement(By.xpath(object.obj().getProperty("pim"))).click();
		driver.findElement(By.xpath(object.obj().getProperty("pimAddbtn"))).click();
		driver.findElement(By.xpath(object.obj().getProperty("firstname"))).sendKeys("Maya");
		driver.findElement(By.xpath(object.obj().getProperty("secondname"))).sendKeys("kim");
		driver.findElement(By.xpath(object.obj().getProperty("lastname"))).sendKeys("biden");
		driver.findElement(By.xpath(object.obj().getProperty("pic"))).sendKeys("C:\\Users\\MeesalaVineelSai\\OneDrive - ValueMomentum, Inc\\Pictures\\testupload.png");
		Thread.sleep(2000);
		driver.findElement(By.xpath(object.obj().getProperty("savebtn"))).click();
		Thread.sleep(3000);
		screen.shot(driver);
//		driver.findElement(By.xpath(object.obj().getProperty("button"))).click();
//		driver.findElement(By.xpath("//*[contains(@id,'app')]//following::p")).click();
//		driver.findElement(By.xpath("//*[contains(@class,'oxd-userdropdown')]//following::li[4]")).click();
		
		//driver.close();

	}

}
