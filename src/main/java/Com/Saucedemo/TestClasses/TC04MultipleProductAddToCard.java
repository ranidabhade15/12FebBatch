package Com.Saucedemo.TestClasses;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import Com.Saucedemo.PomClasses.HomePage;

public class TC04MultipleProductAddToCard extends TestBaseClass
{
   @Test
   
   public void multiproduct()
   {
	   HomePage hp = new HomePage(driver);
     hp.AddAllProduct();
     System.out.println("Multiple product added");
     
     // validation
     System.out.println("Validating Test case");
     
     String ExpectedTitle = "Swag Labs";
     String ActualTitle = driver.getTitle();
     
     
     if(ExpectedTitle.equals(ActualTitle))
     {
    	 System.out.println("Test Case Passed");
     }
     else
     {
    	 System.out.println("Test Case Failed");
     }
}
}