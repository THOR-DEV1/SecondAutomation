package Alert_Elements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class alertElements {
	@FindBy(id="simple")
	public WebElement ShowmeAlert;
	@FindBy(id="confirm")
	public WebElement  FirstTryit;
	@FindBy(id="prompt")
	public WebElement  SecondTryit;
	@FindBy(id="demo")
	public WebElement  DismissMsg;
	
	
	public alertElements Show_Me_Alert() {
		ShowmeAlert.click();
		return this;
	}
	
	public alertElements First_Tryit() {
		FirstTryit.click();
		return this;
	}
	
	public alertElements Second_Tryit() {
		SecondTryit.click();
		return this;
	}
	
	public alertElements Dismiss_Msg() {
		SecondTryit.getText();
		return this;
	}
	
}
//driver.switchTo().alert().accept();