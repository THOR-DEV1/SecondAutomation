package elements1;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Config.BrowserDriver;
import junit.framework.Assert;

public class elements {
	WebDriver driver=BrowserDriver.getCurrentDriver();
	@FindBy(xpath="//*[@id=\"twotabsearchtextbox\"]") WebElement searchbox;
	@FindBy(xpath="//*[@id=\"nav-flyout-searchAjax\"]/div[2]/div[4]/div/div") WebElement searchbox1;
	@FindBy(xpath="//*[@id=\"search\"]/span/div/h1/div/div[1]/div/div/span[3]") WebElement title;
	@FindBy(xpath="//*[@id=\"p_36/1318505031\"]/span/a/span") WebElement price;
	@FindBy(xpath="//*[@id=\"p_n_operating_system_browse-bin/1485077031\"]/span/a/span") WebElement version;
	@FindBy(xpath="//*[@id=\"a-autoid-0-announce\"]") WebElement feature;
	@FindBy(xpath="//*[@id=\"s-result-sort-select_4\"]") WebElement first;
	public elements Searchbox() {
		searchbox.sendKeys("mobiles");
		return this;	
}
	public elements AutoSearch() {
		searchbox1.click();
		return this;	
}
	public elements verify() {
		 String s=title.getText();
		 String s1='"'+"mobiles under 15,000"+'"';
		 //String s1="\"mobiles under 12,000\"";
		System.out.println("Page opend: "+s1.equals(s));
		return this;
		
	}
	public elements price() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)");
		Thread.sleep(2000);
		price.click();
		return this;
		
	}
	public elements version() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,900)");
		Thread.sleep(2000);
		version.click();
		return this;
		
	}
	public elements feature() {
		feature.click();
		return this;
		
	}
	public elements first() {
		first.click();
		return this;
		
	}
	public elements fiveproduct() {
		 List<String>list=new ArrayList<String>();
		    list.add("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span");
		    list.add("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[3]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span");
		    list.add("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[4]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span");
		    list.add("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[6]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span");
		    list.add("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[7]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span");
		    for(String names:list)
		        
		        System.out.println(driver.findElement(By.xpath(names)).getText());
		return this;
		
	}
	public elements Listofprices() {
	    List<String>list=new ArrayList<String>();
	    list.add("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[3]/div[1]/div/div[1]/div/a/span[2]/span[2]/span[2]");
	    list.add("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[3]/div/div/div/div/div/div[2]/div/div/div[3]/div[1]/div/div[1]/div/a/span[2]/span[2]/span[2]");
	    list.add("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[4]/div/div/div/div/div/div[2]/div/div/div[3]/div[1]/div/div[1]/div/a/span[2]/span[2]/span[2]");
	    list.add("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[6]/div/div/div/div/div/div[2]/div/div/div[3]/div[1]/div/div[1]/div/a/span[2]/span[2]/span[2]");
	    list.add("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[7]/div/div/div/div/div/div[2]/div/div/div[3]/div[1]/div/div[1]/div/a/span[2]/span[2]/span[2]");
	    for(String prices:list)
	    
	        System.out.println(driver.findElement(By.xpath(prices)).getText());



	   return this;
	}
	public elements check(){
		String oneprice=driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[3]/div[1]/div/div[1]/div/a/span[2]/span[2]/span[2]")).getText();
		String ik=oneprice.replace(",","");
		System.out.println("price of 1st product: "+ik);
		int i=Integer.parseInt(ik);
		int k=30000;
		if(i<k) {
			System.out.println("Price less than 30000");
		}
		else {
			System.out.println("Price Greaterthan 30000");
		}
		return this;
		
	}
}
