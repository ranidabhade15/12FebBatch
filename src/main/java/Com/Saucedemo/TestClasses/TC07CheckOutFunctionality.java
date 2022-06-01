package Com.Saucedemo.TestClasses;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import Com.Saucedemo.PomClasses.CartPage;
import Com.Saucedemo.PomClasses.HomePage;

public class TC07CheckOutFunctionality extends TestBaseClass
{
	@Test
	
	public void CheckOutFunctionality()
	{
		HomePage hp = new HomePage(driver);
		 hp.AddToCard1();
		 System.out.println("single product add");
		   
		 
		 hp.basket();
		 System.out.println("click on basket");
		 
		 
		 CartPage cp = new CartPage(driver);
		 
		 cp.CheckOut();
		System.out.println("click on checkout");
		
		
		//validation
		
		System.out.println("validating the test case");
		  
		String expectedURL = "https://www.saucedemo.com/checkout-step-one.html";
		String actualURL = driver.getCurrentUrl();
		
		if(expectedURL.equals(actualURL))
		{
			System.out.println("test case passed");
		}
		else
		{
			System.out.println("test case failed");
		}
		
		
		
		
		
		
	}

}
