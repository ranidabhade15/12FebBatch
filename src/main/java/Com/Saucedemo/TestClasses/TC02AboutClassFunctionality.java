package Com.Saucedemo.TestClasses;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import Com.Saucedemo.PomClasses.HomePage;

public class TC02AboutClassFunctionality extends TestBaseClass
{
	@Test
	 public void HomePageFunctionality()
	 {
		HomePage hp = new HomePage(driver);
		
		hp.hamberger();
	   System.out.println("click on hamberger");
		hp.About();
		System.out.println("click on About");
		
		String expectedTitle ="Cross Browser Testing, Selenium Testing, Mobile Testing | Sauce Labs";
		String actualTitle = driver.getTitle();
		
		System.out.println("verify the test case");
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