package Com.Saucedemo.TestClasses;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import Com.Saucedemo.PomClasses.HomePage;

public class TC05LogOutFunctionality extends TestBaseClass
{
     @Test
     
     public void LogoutFunctionality()
     {
    	 HomePage hp = new HomePage(driver);
    	   hp.hamberger();
    	   System.out.println("click on hamberger");
    	   hp.LogOut();
    	   
    	   System.out.println("validating test case");
    	   
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
