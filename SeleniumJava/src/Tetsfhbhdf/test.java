package Tetsfhbhdf;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test {
	public static void main(String[] args) {
		System.out.println("Hello World!!!");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
	}

}
