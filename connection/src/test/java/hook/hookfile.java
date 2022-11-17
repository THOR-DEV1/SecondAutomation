package hook;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class hookfile {
	public WebDriver drivers(WebDriver driver) {
		WebDriverManager.chromedriver().setup();
		return driver=new ChromeDriver();
		
	}

}
