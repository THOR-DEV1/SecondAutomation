package jjjjj;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import fedup.defpu;
import io.github.bonigarcia.wdm.WebDriverManager;

public class classkamalclass {
	public static WebDriver ff() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		return driver;
		
	}
	public static void main(String[] args) {
		WebDriver driver=ff();
		defpu f=new defpu();
		f.login(driver);
		}
}
