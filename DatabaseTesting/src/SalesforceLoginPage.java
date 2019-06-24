import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SalesforceLoginPage {
	public WebDriver driver;
	public SalesforceLoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By userName=By.xpath("//input[@id='username']");
	By pwd=By.id("password");
	By login=By.id("Login");
	
	public WebElement getUserName()
	{
		return driver.findElement(userName);
	}
	public WebElement getPwd()
	{
		return driver.findElement(pwd);
	}
	public WebElement getLogin()
	{
		return driver.findElement(login);
	}

}
