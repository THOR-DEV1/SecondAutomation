package demojava;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class encapucalling {

	public static void main(String[] args) {
		encapsulation gg=new encapsulation();
		WebDriver driver = null;
		//gg.set(driver);
		gg.get().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		gg.get().findElement(By.xpath("//*[contains(text(),'Login')]"));	
		}

}
