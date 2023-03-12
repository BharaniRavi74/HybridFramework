package base;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public interface ISeleniumBaseDesign {
	
	public WebDriver browser(String browserName);
	
	public void closeBrowser();

	public void quitBrowser();

	public void open(String aut);

	public WebElement getWebElement(String locator);

	public List<WebElement> getWebElements(String locator);

	public void type(WebElement ele, String data);

	public void click(WebElement ele);

	public String getText(WebElement ele);

	public void selectValueInDropdown(WebElement ele, String text);

	public void moveToParticularElement(WebElement ele); 

	public void switchToWindow(int index);

	public void switchToFrame(WebElement ele);
	
	public byte[] takeSnap();
	
	public void JSEClick(WebElement ele);

	//void switchToWindow(int index, WebElement element);

}