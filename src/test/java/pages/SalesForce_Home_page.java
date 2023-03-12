package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import testHooks.TestNgHooks;



public class SalesForce_Home_page extends TestNgHooks{


	WebDriverWait wait;




	/*
	 * @FindBy(xpath = "//Button[text()='View All']") WebElement ViewAll;
	 * 
	 * @FindBy(xpath = "//p[text()='Sales']") WebElement Sales_option;
	 * 
	 * @FindBy(xpath = "//span[text()='Accounts']/parent::*") WebElement
	 * Accounts_link;
	 */

	/*
	 * @FindBy(xpath= "//span[@class='uiImage']") WebElement Login_img;
	 */
	public SalesForce_Home_page() {
		// TODO Auto-generated constructor stub
	}

	public SalesForce_Home_page AppLauncher() {

		click(getWebElement("xpath=//div[@class='slds-icon-waffle']"));
		
		return this;

	}

	public SalesForce_Home_page ViewAll() {

		click(getWebElement("xpath=//Button[text()='View All']"));
		return this;
	}

	public SalesForce_Home_page salesoption() {

		click(getWebElement("xpath=//p[text()='Sales']"));
		return this;
	}

	public SalesForce_Home_page Accounts_link() {
    JSEClick(getWebElement("xpath=//span[text()='Accounts']/parent::*"));
	return this;

	}
	
	public SalesForce_Home_page login_img_verify() {
	wait = new WebDriverWait(driver, Duration.ofSeconds(40));
	wait.until(ExpectedConditions.visibilityOf(Login_img));

	if (driver.getCurrentUrl().contains("/lightning/setup/SetupOneHome/home")) {
		System.out.println("Logged in successfully");
		// assertEquals("True", "false");
	} else {
		System.out.println("Login in Failed");

	}
	return this;
	}
}
