package Academy;


//I am Y and updated this file.
/*import static org.testng.Assert.assertEquals*/

import java.io.IOException;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.LandingPage;
import resources.base;



public class ValidateTitle extends base {


	public static Logger Log = LogManager.getLogger(ValidateTitle.class.getName());
	
	
	
	@Test
	public void TitleValidation() throws IOException
	{
		driver = initializeDriver();
		
		Log.info("I am in info of TitleValidation method and - Driver is initialized");
		
		driver.get("https://www.amazon.in");
		Log.info("url is taken successfully by driver.get() method");
				
		LandingPage l=new LandingPage(driver);
		
		String actual = l.BestSellertitleMethod().getText();
		
		String expected ="Best Sellers";
		
		
		Assert.assertEquals(actual, expected);		
		
	}
	
	
	@Test
	public void TitleValidation1() throws IOException
	{
		System.out.println("I am in TitleValidation1 method ");
		Log.debug("I am in debug log of  TitleValidation1 method ");
	}
	
	

}
