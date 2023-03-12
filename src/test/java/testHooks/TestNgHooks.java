package testHooks;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import base.seleniumBase;
import util.ConfigReader;

public class TestNgHooks extends seleniumBase {


	
	@BeforeTest
	public void launch() {
		browser("CHROME");
		open(ConfigReader.load("TestEnv.properties", "Baseurl"));
	}

	@AfterTest
	public void closebrowser() {
		closeBrowser();

	}

	@AfterMethod
	public void afterMethod(ITestResult result) throws IOException {

		// result = Reporter.getCurrentTestResult();

		switch (result.getStatus()) {
		case ITestResult.SUCCESS:
			System.out.println("======PASS=====");

			break;

		case ITestResult.FAILURE:
			System.out.println("======FAIL=====");
			byte[] screenprint = takeSnap();

			File dest = new File("./failureimages/" + result.getName() + ".png");

			FileOutputStream src = new FileOutputStream(dest);
			src.write(screenprint);
			src.close();

			break;

		case ITestResult.SKIP:
			System.out.println("======SKIP BLOCKED=====");
			// my expected functionality here when passed
			break;

		default:
			throw new RuntimeException("Invalid status");
		}
	}

}
