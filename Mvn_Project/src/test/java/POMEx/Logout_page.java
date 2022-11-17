package POMEx;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Logout_page {
 static WebElement ele=null;
 public static WebElement lnk_welcome(WebDriver driver) {
	 return ele=driver.findElement(By.id("welcome"));
 }
 public static WebElement lnk_logout(WebDriver driver) {
	 return ele=driver.findElement(By.id("Logout"));
 }

}
