package AppElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import Alerts_pro.Browserge;

public class AllElements {
	WebDriver driver=Browserge.getCurrentDriver();
//@FindBy(xpath = "//*[@id=\"header\"]/nav/div/div[2]/ul/li[4]/a")
//public WebElement Switchto;
@FindBy (xpath ="//*[@id=\"header\"]/nav/div/div[2]/ul/li[4]/ul/li[1]/a")
private WebElement Alert;
@FindBy(xpath = "//*[@id=\"OKTab\"]/button")
private WebElement Alertbtnbox;
@FindBy(xpath = "/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")
private WebElement Cofirmbox;
@FindBy(xpath = "//*[@id=\"CancelTab\"]/button")
private WebElement Cofirmbtn;
//@FindBy(xpath = "//*[@id=\"demo\"]")
//private WebElement Cofirmtext;
@FindBy(xpath = "/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")
private WebElement Alertwithtextbox;
@FindBy(xpath="//*[@id=\"Textbox\"]/button")
private WebElement Promptbox;

public AllElements Hover() throws InterruptedException {
	WebElement ele = driver.findElement(By.xpath("//*[@id=\"header\"]/nav/div/div[2]/ul/li[4]/a"));
	Thread.sleep(2000);
	Actions action = new Actions(driver);
	action.moveToElement(ele).perform();

	return this;
}
public AllElements alert() {
	Alert.click();
	return this;
}
public AllElements alertboxbtn() {
	Alertbtnbox.click();
	return this;
}
public AllElements Cofmbtn() {
	Cofirmbox.click();
	return this;
}
public AllElements confirmbox() {
	Cofirmbtn.click();
	return this;
}
public AllElements Alerttext() {
	Alertwithtextbox.click();
	return this;
}
public AllElements Promptbtn() {
	Promptbox.click();
	return this;
}








}