package database.connection;

import java.io.File;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class codeweb {
	
	public static void main(String[] args) throws InterruptedException, ClassNotFoundException, SQLException, IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		loginentryconnection ldf = new loginentryconnection();	
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		dbdateread db=new dbdateread();
		ResultSet database=db.data("","");
		do {
			String username = database.getString(1);
			String password = database.getString(2);
					Thread.sleep(2000);
					driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).clear();
					driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys(username);
					driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).clear();
					driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys(password);
				    driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
				    
				    int j = driver.findElements(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/p")).size();
				    if(j==0) { 
			    		int i=driver.findElements(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/p")).size();
			    		if(i==1) {
			    			Date time=new Date();
			    			ldf.connect(username);
			    			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/p")).click();
			    			driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a")).click();
			    			ldf.logout(time.toString());
			    		}
			    		else {
			    			TakesScreenshot shot=(TakesScreenshot) driver;
			    			File files=shot.getScreenshotAs(OutputType.FILE);
			    			FileUtils.copyFile(files, new File("./Screen/shot.png"));
			    			System.out.println("Invalid Credentials");
			    		}
				    	
				    }
		}
		while(database.next()); 
		
		
		driver.close();
		
	
	}
	
}
