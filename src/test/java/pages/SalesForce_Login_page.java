package pages;
import testHooks.TestNgHooks;
import util.ConfigReader;
public class SalesForce_Login_page extends TestNgHooks{
	
	
	public SalesForce_Login_page enterUsername(String Username) {
		
		type(getWebElement(ConfigReader.load("SalesForce_login_page.properties", "login.page.username.txt")),Username);
		return this;
	}
	
	public SalesForce_Login_page enterpassword(String password) {
	
		type(getWebElement(ConfigReader.load("SalesForce_login_page.properties", "login.page.password.txt")),password);
		return this;
	}
	
	public SalesForce_Home_page clicklogin() {

		click(getWebElement(ConfigReader.load("SalesForce_login_page.properties", "login.page.login.txt")));
		return new SalesForce_Home_page();
	}	

}
