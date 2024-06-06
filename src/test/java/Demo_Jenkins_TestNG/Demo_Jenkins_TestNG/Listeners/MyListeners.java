package Demo_Jenkins_TestNG.Demo_Jenkins_TestNG.Listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestNGListener;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class MyListeners implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test started:::"+result.getTestName()+result.getMethod()+" "+result.getName());
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test <b>Passed</b>:::"+result.getTestName()+result.getMethod()+" "+result.getName());
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test <b>Failed</b>:::"+result.getTestName()+result.getMethod()+" "+result.getName());
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test <b>Skipped</b>:::"+result.getTestName()+result.getMethod()+" "+result.getName());
		
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("Suite <b>Started</b>:::");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Suite <b>Completed</b>:::");
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}
  
	

}
