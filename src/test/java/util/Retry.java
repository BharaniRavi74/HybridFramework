package util;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Retry implements IRetryAnalyzer{

	  private int count = 0; 

	  private int maxCount = 2;

	  public boolean retry(ITestResult result) { 

	    if(count < maxCount) {  

	       count++;

	       return true;        

	    }        

	    return false; 
	

}
}