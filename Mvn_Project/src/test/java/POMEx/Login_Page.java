package POMEx;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//static method
public class Login_Page {
	static WebElement ele=null;
	//username
	public static WebElement txt_username(WebDriver driver){
		return ele=driver.findElement(By.name("txtUsername"));
	}
	//password
	public static WebElement txt_password(WebDriver driver){
		return ele=driver.findElement(By.name("txtPassword"));

	}
	//login
	public static WebElement btn_login(WebDriver driver){
		return ele=driver.findElement(By.name("Submit"));
	}

}
