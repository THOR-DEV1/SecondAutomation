import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class elements {
WebDriver driver;
public elements(WebDriver driver) {
	this.driver=driver;
}
public void usernameAndpassword(String s,String p) {
	driver.findElement(By.xpath("//input[@name='username']")).sendKeys(s);
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys(p);
}
public void login() {
	driver.findElement(By.xpath("//*[@type='submit']")).click();
}
}
