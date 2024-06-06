package Demo_Jenkins_TestNG.Demo_Jenkins_TestNG;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Demo_Jenkins_TestNG.Demo_Jenkins_TestNG.Listeners.TestParameters;

public class AdminTest extends BaseClass {
	
	
	
	@BeforeMethod
	public void setup() {
		System.out.println("Setup method started:: ");
		baseMethodBeforeSuite();
		
		
	}
	
  @Test(description = "This is to  verify f1 method")
  @TestParameters(testCaseID="1234")
  public void f1() {
	  
	  System.out.println("From Admin test - f1 test method"+Thread.currentThread().getId());
		System.out.println("Get property from jenkins"+System.getProperty("url")+ "opened");
  }
  
  @Test(description = "This is to  verify f2 method")
  @TestParameters(testCaseID="1235")
  public void f2() {
	  
	  System.out.println("From Admin test - f2 test method"+Thread.currentThread().getId());
		System.out.println("Get property from jenkins"+System.getProperty("username")+ "entered");
		System.out.println("Get property from jenkins"+System.getProperty("password")+ "entered");
  }
  
  @Test(description = "This is to  verify failed method")
  @TestParameters(testCaseID="1235")
  public void failed_case() {
	  
	  System.out.println("From Admin test - failed test method"+Thread.currentThread().getId());
//		System.out.println("Get property from jenkins"+System.getProperty("username")+ "entered");
//		System.out.println("Get property from jenkins"+System.getProperty("password")+ "entered");
		Assert.assertTrue(false);
  }
  
  @AfterMethod
  public void teardown() {
		System.out.println("Teardown method executing now:: ");
	  baseMethodAfterSuite();
  }
}
