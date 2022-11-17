package dropdown;

import java.io.IOException;
import java.sql.SQLException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import database.connection.loginentryconnection;
import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdown {
	public static void main(String[] args) {
			WebDriverManager.chromedriver().setup();
			WebDriver driver=new ChromeDriver(); 
			loginentryconnection ldf = new loginentryconnection();	
//			driver.get("http://demo.guru99.com/test/newtours/register.php");
//			driver.get("https://jsbin.com/osebed/2");
//			driver.get("https://demo.guru99.com/test/upload/");
//			driver.get("https://demo.guru99.com/test/newtours/");
			driver.get("https://demo.guru99.com/test/delete_customer.php");
			driver.manage().window().maximize();
//			Select s=new Select(driver.findElement(By.name("country")));
//			Select s=new Select(driver.findElement(By.id("fruits")));
//			driver.findElement(By.xpath("//input[@type='file']")).sendKeys("C:\\Users\\MeesalaVineelSai\\OneDrive - ValueMomentum, Inc\\Desktop\\demo.txt");;
			//s.selectByVisibleText("Banana");
//			Actions ss=new Actions(driver);
//			WebElement sss=driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[1]/td[2]/font/a"));
//			Action mouse=ss.moveToElement(sss).build();
//			ss.contextClick();
//			ss.perform();
//			mouse.perform();
			driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys("12345");
			driver.findElement(By.xpath("/html/body/form/table/tbody/tr[3]/td[2]/input[1]")).click();
			driver.switchTo().alert().accept();
			driver.switchTo().alert().accept();
	}

}
