package TestNgExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TS_DragDrop {
  @Test
  public void f() throws InterruptedException {
	   WebDriverManager.chromedriver().setup();
		// Launch Browser
		WebDriver driver = new ChromeDriver();
		// maximize browser
		driver.manage().window().maximize();
		// Enter URL
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		WebElement dragobj = driver.findElement(By.xpath("//*[@id=\"draggable\"]/p"));
		WebElement dropobj = driver.findElement(By.xpath("//*[@id=\"droppable\"]/p"));
		Actions obj=new Actions(driver);
		//obj.dragAndDrop(dragobj, dropobj).build().perform(); [OR]
		obj.clickAndHold(dragobj).moveToElement(dropobj).release().build().perform();
		Thread.sleep(2000);
		driver.close();
  }
}
