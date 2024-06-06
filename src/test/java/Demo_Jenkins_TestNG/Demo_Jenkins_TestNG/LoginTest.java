package Demo_Jenkins_TestNG.Demo_Jenkins_TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Demo_Jenkins_TestNG.Demo_Jenkins_TestNG.Listeners.TestParameters;

public class LoginTest extends BaseClass {
	
	
	
	@BeforeMethod
	public void setup() {
		System.out.println("Setup method started in Login Test :: ");
		baseMethodBeforeSuite();
		
		
	}
	
  @Test(description = "This is to  verify f3 method")
  @TestParameters(testCaseID="123")
  public void f3() {
	  
	  System.out.println("From Login test - f3 test method"+Thread.currentThread().getId());
		System.out.println("Get property from jenkins"+System.getProperty("url")+ "opened");
  }
  
  @Test(description = "This is to  verify f4 method")
  @TestParameters(testCaseID="124")
  public void f4() {
	  
	  System.out.println("From Admin test - f4 test method"+Thread.currentThread().getId());
		System.out.println("Get property from jenkins"+System.getProperty("username")+ "entered");
		System.out.println("Get property from jenkins"+System.getProperty("password")+ "entered");
  }
  
  
  @AfterMethod
  public void teardown() {
		System.out.println("Teardown method executing now after Login test:: ");
	  baseMethodAfterSuite();
  }
}
