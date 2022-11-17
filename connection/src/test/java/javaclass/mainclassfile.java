package javaclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import hook.hookfile;

public class mainclassfile {
	static WebDriver driver;
	public static void main(String[] args) {
		hookfile loaddriver = new hookfile();
		WebDriver element = loaddriver.drivers(driver);
		element.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	}

}
