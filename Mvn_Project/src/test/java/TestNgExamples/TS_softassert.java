package TestNgExamples;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TS_softassert {
  @Test
  public void softAssert() {
	  SoftAssert osoftAssert=new SoftAssert();
	  String className="S_Assert";
	  osoftAssert.assertTrue(true==true);
	  osoftAssert.assertEquals("S_Assert","S_Assertion");
	  osoftAssert.assertEquals(className,"S_Assert");
	  System.out.println("Last statement gets executed");
	  osoftAssert.assertAll();
  }
}
