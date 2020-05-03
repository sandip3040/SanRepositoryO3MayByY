package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import resources.base;

public class ValidateNavgationBar extends base {
	
	public static Logger Log = LogManager.getLogger(ValidateTitle.class.getName());
	
		@Test
		public void NavigationBarValidation() throws IOException
		{
			driver = initializeDriver();
			
			driver.get("https://www.amazon.in");
			
			LandingPage lp1 = new LandingPage(driver);
			
			Assert.assertTrue(lp1.NavigationBarMethod().isEnabled());
			
			Log.info("Successfully check navigationBar is enabled or not");
			
			System.out.println("End of NavigationBarValidation");
			
		}
		

		
		@Test
		public void NavigationBarValidation1() throws IOException
		{
			System.out.println("I am in NavigationBarValidation1 method ");
			
			Log.info("I m in info of NavigationBarValidation1 method");
		}
		
	}


