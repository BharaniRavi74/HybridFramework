package testSuite;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import base.seleniumBase;
import pages.SalesForce_Login_page;
import testDataProvider.AccountDataprovider;
import testHooks.TestNgHooks;
import util.ConfigReader;
import util.Reporter;

public class LoginSalesforce_TEXTNG extends TestNgHooks{
	
	@BeforeTest
	public void beforeTest() {
		testcaseName = "Edit Account";
		testDescription = "Verify Edit Account";
		authors = "Bharani R";
		category = "Reg";
		//excelFileName="Account";
	}
	
	
	@Test(dataProviderClass = AccountDataprovider.class, dataProvider = "AccAdd")
	public void LoginToSalesForce(String username, String pswd) throws IOException {	
    
		
		  new SalesForce_Login_page()
		  .enterUsername(username) 
		  .enterpassword(pswd)
		  .clicklogin();
		  
		  assertEquals("1234", pswd);
		 
		//System.out.println(username+"jsh"+pswd);

		/*WebElement Login = driver.findElement(By.xpath("//span[@class='uiImage']"));
		
		  WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		  wait.until(ExpectedConditions.visibilityOf(Login));
		 
		if (driver.getTitle().contains("Home | Salesforce")) {
			System.out.println("Logged in successfully");
			
		} else {
			System.out.println("Login in Failed");
			
		}

*/	}
//@Test
public void Create_Account() {
	
	
	
}
@Override
public byte[] takeSnap() {
	// TODO Auto-generated method stub
	return null;
}
	
	//@AfterMethod
/*
 * public void tearDown(ITestResult result) throws IOException { String location
 * = "/SalesForce/test-output/FailureScreenshot"; //location for images String
 * methodname = result.getName(); // fetching test method name
 * if(result.isSuccess()) try { File screenshots = ((TakesScreenshot) driver)
 * .getScreenshotAs(OutputType.FILE); FileUtils.copyFile( screenshots, new
 * File(location + methodname+ "_" + ".png")); } catch (Exception e) {
 * e.printStackTrace();
 */ /*
	 * } finally { driver.quit(); } }
	 */
}
