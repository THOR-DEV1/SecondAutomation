import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class script {
	static WebDriver driver;
	static objectrepo ORobj=new objectrepo();
	public static void main(String[] args) throws IOException, InterruptedException {
		webdriver();
		Thread.sleep(5000);
		String username=driver.findElement(By.xpath(ORobj.obj().getProperty("userinput"))).getAttribute("value");
		System.out.println(username+" :user");
		Thread.sleep(5000);
		String password=driver.findElement(By.xpath(ORobj.obj().getProperty("passinput"))).getAttribute("value");
		System.out.println(password+" :pass");
	}
	public static void webdriver() throws IOException {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get(ORobj.obj().getProperty("url"));
		
	}

}
