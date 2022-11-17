package demojava;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class encapsulation {
    public static WebDriver name;
    public static WebDriver get(String s) {
    	WebDriverManager.chromedriver().setup();
    	name=new ChromeDriver();
    	System.out.println("Browser: "+s);
    	return name;
    	
    }
    public static WebDriver get() {
    	return get("Chrome");
    	
    }

}
