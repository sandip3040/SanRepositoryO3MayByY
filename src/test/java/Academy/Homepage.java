package Academy;
//I am Y and updated this file.
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginPage;
import resources.base;

public class Homepage extends base {

	
	public static Logger Log = LogManager.getLogger(ValidateTitle.class.getName());
	
	@Test(dataProvider="getdata")

	public void basePageNavigation(String email,String password) throws IOException 
	{
		System.out.println("Hi I m in Hp12 method");
		driver=initializeDriver();
		/*
		String Urlactual = prop.getProperty("url");
		System.out.println(Urlactual);
		*/
		
		driver.get("https://www.amazon.in");
		
		LandingPage l= new LandingPage(driver);
		l.signinMethod().click();
		Log.info("Successfully clicked on signin button on homepage");
		
		LoginPage lp = new LoginPage(driver);
		
		lp.emailMethod().sendKeys(email);
		lp.continueButtonMethod().click();
		lp.passwordMethod().sendKeys(password);
		lp.loginButtonMethod().click();
		
	}

 @DataProvider
 public Object[][] getdata()
 {
	 Object[][] data = new Object[2][2];
	 data[0][0]="9890983639";
	 data[0][1]="abcd@3040";
	 
	 data[1][0]="9912345639";
	 data[1][1]="xyz@3747";
	 
	 return data;
	 
 }



}



