package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import base.Test_Base;
public class MainScript extends Test_Base {
  @Test(priority=1)
  public void login_test() throws InterruptedException {
	  log.debug("Inside Login test....");
	  Thread.sleep(2000);
      driver.findElement(By.xpath(or.getProperty("txtun"))).sendKeys("Admin");

      driver.findElement(By.xpath(or.getProperty("txtpwd"))).sendKeys("admin123");

      driver.findElement(By.xpath(or.getProperty("btnlogin"))).click();

      Assert.assertTrue(isElementPresent(By.xpath(or.getProperty("verifywelcome"))), "Login successful...");

      log.debug("Login is done.....");
  }
  @Test(dataProvider = "getdata",priority = 2)
  public void adduser_test(String userrole,String empname,String un,String status,String pwd,String cpwd) throws InterruptedException {
	  log.debug("Add new user......");
      driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a/span")).click();
      Thread.sleep(2000);
      driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[1]/ul/li")).click();
      Thread.sleep(2000);
      driver.findElement(By.xpath(or.getProperty("btnadd"))).click();
      Thread.sleep(2000);
    //userrole
      WebElement usertype = driver.findElement(By.id(or.getProperty("usertype")));
      Select userrol = new Select(usertype);
      userrol.selectByValue("1");
      driver.findElement(By.id(or.getProperty("empname"))).sendKeys(empname);
      driver.findElement(By.id(or.getProperty("username"))).sendKeys(un);
      driver.findElement(By.id(or.getProperty("status"))).sendKeys(status);
      driver.findElement(By.id(or.getProperty("password"))).sendKeys(pwd);
      driver.findElement(By.id(or.getProperty("cpassword"))).sendKeys(cpwd);

      //click on Save
      driver.findElement(By.id(or.getProperty("btnsave"))).click();
      log.debug("user added successfully....");
  }
  @DataProvider
  public Object[][] getdata(){
      String sheetname = "createuser";
      int rowcount = excel.getRowCount(sheetname);
      System.out.println("Row Count"+rowcount);
      int colcount = excel.getColumnCount(sheetname);
      System.out.println("Col Count "+colcount);
      Object[][] data = new Object[rowcount-1][colcount];

      for(int rownum=2;rownum<=rowcount;rownum++) {
          for(int colnum=0;colnum<colcount;colnum++) {
              //data[0][0]
              data[rownum-2][colnum]=excel.getCellData(sheetname, colnum, rownum);
          }
      }
      return data;
  }
//Logout
  @Test(priority=3)
  public void logout_test() {
      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
      driver.findElement(By.id(or.getProperty("verifywelcome"))).click();
      driver.findElement(By.linkText(or.getProperty("logout"))).click();
      Assert.assertTrue(isElementNotPresent(By.id(or.getProperty("verifywelcome"))), "Logout is Done");
      log.debug("Logout is done....");
  }
}
