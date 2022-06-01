package Com.Saucedemo.TestClasses;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import Com.Saucedemo.PomClasses.HomePage;

public class TC03SingleProductFunctionality extends TestBaseClass
{
	
	@Test
   public void SingleProductFunctionallity()
   {
		HomePage hp = new HomePage(driver);
		 hp.AddToCard1();
		System.out.println("product add to card");
		
		String expectedTitle = "Swag Labs";
		String actualTitle = driver.getTitle();
		
		if(expectedTitle.equals(actualTitle))
		{
			System.out.println("test case passed");
		}
		else
		{
			System.out.println("test case failed");
		}
   }
  
}
