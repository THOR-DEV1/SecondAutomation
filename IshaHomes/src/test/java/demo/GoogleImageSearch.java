package demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleImageSearch {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://google.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"gb\"]/div/div[1]/div/div[2]/a")).click();
		Thread.sleep(1000);
		System.out.println("1");
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[3]/div[3]/img")).click();
//		boolean s=driver.findElement(By.className("hXhhq")).isDisplayed();
//		if(s==true) {
//			System.out.println(s);
//		}else {
//			System.out.println("no popup");
//		}
		Thread.sleep(2000);
		WebElement s2=driver.findElement(By.name("encoded_image"));
		s2.sendKeys("C:\\Users\\MeesalaVineelSai\\OneDrive - ValueMomentum, Inc\\Pictures\\webdesign.png");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"yDmH0d\"]/div[3]/c-wiz/div/c-wiz/div/div[1]/div/div[1]/div[2]/span/div[1]/div/a")).click();
		Thread.sleep(2000);
		System.out.println("2");
		driver.findElement(By.xpath("//div[text()=\"Tools\"]")).click();
	}
}
