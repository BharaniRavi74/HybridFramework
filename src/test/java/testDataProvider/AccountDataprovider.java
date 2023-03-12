package testDataProvider;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import util.ExcelRead;

public class AccountDataprovider {
	
	ExcelRead Read = new ExcelRead();
	
	@DataProvider(name="AccAdd")
	public Object[][] loginData() throws IOException {
		Object[][] arrayObject = Read.getExcelData("src/main/resources/Account.xlsx","Add_Acc");
		return arrayObject;
	}
	

}
