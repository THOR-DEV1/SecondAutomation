package demo;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Isha {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ishahomes.com/");
		Thread.sleep(7000);
		///valid
		boolean r=driver.findElement(By.xpath("//*[@id=\"livprop_popup1\"]")).isDisplayed();
		System.out.println(r+"\n");
		if(r==true) {
			System.out.println("Clicked on close"+"\n");
			driver.findElement(By.xpath("//*[@id=\"livchat_close\"]")).click();
			}else {
				System.out.println("popup not found"+"\n");
			}
		///valid
		boolean z=driver.findElement(By.xpath("//*[@id=\"carouselExampleInterval\"]/div/div/a[1]/img")).isDisplayed();
		System.out.println(z+"\n");
		if(z==true) {
			System.out.println("Clicked on close"+"\n");
			driver.findElement(By.xpath("//*[@id=\"carouselExampleInterval\"]/div/div/a[1]/img")).click();
			}else {
				System.out.println("popup not found"+"\n");
			}
		driver.findElement(By.xpath("//*[@id=\"navbarNavDropdown\"]/div[2]/ul/li[4]/a")).click();
		
		int x = driver.findElements(By.className("dz-card")).size();
		System.out.println("Total Completed projects: "+x+"\n");
		
		driver.findElement(By.xpath("//*[@id=\"bg\"]/header/div/div/div/div[6]/div[2]")).click();
		Thread.sleep(1000);
		
		boolean s2=driver.findElement(By.xpath("//*[@id=\"bg\"]/div[2]/div/div/div[2]/div[1]/h4")).isDisplayed();
		System.out.println("CONTACT INFO displayed: "+s2+"\n");
		
		System.out.println(driver.findElement(By.xpath("//*[@id=\"bg\"]/div[2]/div/div/div[2]/div[3]/div[2]/p/a")).getText()+"\n");
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(source, new File("./Screenshots/Screen.png"));
		System.out.println("The Screenshot is taken"+"\n");
		driver.close();

	}

}
