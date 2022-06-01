package Com.Saucedemo.TestClasses;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Com.Saucedemo.PomClasses.LoginClass;

public class TC01LoginFunctionality extends TestBaseClass
{
	 
    	    @Test
        public void loginFunctionalityTest()
        {
    	    	
    	 System.out.println("validating test case");
    	 String expectedTitle ="Swag Labs";
          String actualTitle = driver.getTitle();
          
          
//          if(expectedTitle.equals(actualTitle))
//          
//          {
//        	  System.out.println("test case pass");
//          }
//          else
//          {
//        	  System.out.println("test case fail");
//          }
          
          Assert.assertEquals(actualTitle, expectedTitle);
        }
         
}
