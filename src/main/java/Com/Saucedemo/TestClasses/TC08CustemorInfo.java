package Com.Saucedemo.TestClasses;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import Com.Saucedemo.PomClasses.CartPage;
import Com.Saucedemo.PomClasses.CustomerInfo;
import Com.Saucedemo.PomClasses.HomePage;

public class TC08CustemorInfo extends TestBaseClass
{
	@Test
	public void CustomerFunction()
	{
		HomePage hp = new HomePage(driver);
		hp.AddToCard1();
		System.out.println("single product add");
		
		hp.basket();
		System.out.println("click on basket");
		
         CartPage cp = new CartPage(driver);
		 
		 cp.CheckOut();
		System.out.println("click on checkout");
		
		CustomerInfo ci = new CustomerInfo(driver);
		 ci.Fname();
		ci.LName();
		ci.zipCode();
		ci.continue2();
		
		System.out.println("test case passed");
		
		// validation
		
		 System.out.println("validating test case");
    	 String expectedTitle ="Swag Labs";
          String actualTitle = driver.getTitle();
          
          
          if(expectedTitle.equals(actualTitle))
          
          {
        	  System.out.println("test case pass");
          }
          else
          {
        	  System.out.println("test case fail");
          }
        }
		
}
