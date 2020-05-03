package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

		
	
	public WebDriver driver;
	

	public LoginPage(WebDriver driver) {
		
		this.driver=driver;
		
		
	}

	
	By email = By.xpath("//input[@id='ap_email']");

	By continueButton = By.xpath("//input[@id='continue']");
	
	By password = By.xpath("//input[@id='ap_password']");
	
	By loginButton = By.xpath("//input[@id='signInSubmit']");
	
	


	public WebElement emailMethod()
	{
		return driver.findElement(email);
	}
	
	public WebElement continueButtonMethod()
	{
		return driver.findElement(continueButton);
	}
	
	public WebElement passwordMethod()
	{
		return driver.findElement(password);
	}
	
	public WebElement loginButtonMethod()
	{
		return driver.findElement(loginButton);
	}
	
	
}
