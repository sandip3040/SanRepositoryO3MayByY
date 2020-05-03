package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {

	
	
	
	public WebDriver driver;
	
	public LandingPage(WebDriver driver) {
		
		this.driver=driver;
			
	}

	
	
	By signin = By.xpath("//a[@id='nav-link-accountList']");

	By BestSellertitle = By.xpath("//a[@class='nav-a  ' and @tabindex=\"26\"]");
	
	By NavigationBar = By.xpath("//div[@id='nav-xshop-container']");
	
	
	
	

	public WebElement signinMethod()
	{
		return driver.findElement(signin);
	}
	
	
	public WebElement BestSellertitleMethod()
	{
		return driver.findElement(BestSellertitle);
	}
	
	public WebElement NavigationBarMethod()
	{
		return driver.findElement(NavigationBar);
	}
	
}
