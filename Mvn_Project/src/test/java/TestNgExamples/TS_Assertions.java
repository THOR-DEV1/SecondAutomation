package TestNgExamples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TS_Assertions {
  @Test
  public void hardassest() {
	  String className="H_Assert";
	  Assert.assertTrue(true==true);
	  Assert.assertEquals("H_Assert","H_Assert");
	  Assert.assertEquals(className,"H_Assert");
	  System.out.println("Successfully Completed");
  }
}
