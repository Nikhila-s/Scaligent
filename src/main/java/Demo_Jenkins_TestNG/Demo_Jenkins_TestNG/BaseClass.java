package Demo_Jenkins_TestNG.Demo_Jenkins_TestNG;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class BaseClass {

	
	@BeforeSuite
	public static void baseMethodBeforeSuite() {
		
		System.out.println("Base method- Before suite"+Thread.currentThread().getId());
		
		System.out.println("Get property from jenkins"+System.getProperty("browser")+ "invoked");
	}
	
	@AfterSuite
	public static void baseMethodAfterSuite() {
		
		System.out.println("Base method- After suite"+Thread.currentThread().getId());
	}
	
	
	
	
}
