package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class amazon {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/Apple-iPhone-13-128GB-Starlight/dp/B09G9D8KRQ/ref=sr_1_1_sspa?crid=3EUYVT3JEQDGQ&keywords=iphone+13&qid=1663219727&sprefix=iphone+13%2Caps%2C227&sr=8-1-spons&psc=1&spLa=ZW5jcnlwdGVkUXVhbGlmaWVyPUExTERQWEIzQzNFVzNPJmVuY3J5cHRlZElkPUEwNTg4OTI1MUxXOTc0Q0xVNUJTSyZlbmNyeXB0ZWRBZElkPUEwMzMzNDIwMUxMVFRKWjlXSkhKUSZ3aWRnZXROYW1lPXNwX2F0ZiZhY3Rpb249Y2xpY2tSZWRpcmVjdCZkb05vdExvZ0NsaWNrPXRydWU=");
		driver.findElement(By.xpath("//*[@id=\"buy-now-button\"]")).click();
	}

}
