package TestNgExamples;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class TS_DataProvider {
  @Test(dataProvider = "dp")
  public void f(Integer rollno, String student) {
	  System.out.println("Roll No is"+rollno+"------"+"Name "+student);
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "anil" },
      new Object[] { 2, "boss" },
      new Object[] { 3, "cherry" },
    };
  }
}
  