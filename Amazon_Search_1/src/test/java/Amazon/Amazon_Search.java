package Amazon;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon_Search {

	public static void main(String[] args) throws IOException, InterruptedException {
		WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
        driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("iphone13 pro max");
        driver.findElement(By.id("nav-search-submit-button")).click();

        WebElement logo = driver.findElement(By.xpath("/html/body/div[1]/div[2]/span/div/h1/div/div[1]/div/div/span[3]"));
        String s=logo.getText();
        System.out.println(s);
        File f = logo.getScreenshotAs(OutputType.FILE);
       Files.copy(f,new File("src\\test\\java\\Screenshot\\SS.png"));
       Thread.sleep(2000);
       driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[4]/div/div/div/div/div/div/div/div[2]/div/div/div[1]/h2")).click();
       Thread.sleep(2000);
       WebElement logo1 = driver.findElement(By.className("a-price-whole"));
       String gg=logo1.getText();
       System.out.println(gg);
       File f1 = logo1.getScreenshotAs(OutputType.FILE);
       Files.copy(f1,new File("src\\test\\java\\Screenshot\\ss1.png"));
      driver.close();
      Thread.sleep(2000);
     driver.close();
	}

}
