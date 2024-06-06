package Demo_Jenkins_TestNG.Demo_Jenkins_TestNG.Listeners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.annotations.Test;

public class RetryListener implements IRetryAnalyzer {

	@Override
	public boolean retry(ITestResult result) {
	
		int counter = 0;
		int retryLimit = 3;
		

		if(counter < retryLimit)
		{
			counter++;
			return true;
		}
		
		return false;
	}
 
}
