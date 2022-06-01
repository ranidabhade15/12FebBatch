package Com.Saucedemo.TestClasses;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import Com.Saucedemo.PomClasses.HomePage;

public class TC06FilterFunctionality extends TestBaseClass
{
   @ Test
     public void filterFunction()
     {
	   HomePage hp = new HomePage(driver);
	 hp.filter();
	 System.out.println("click on filter");
	 
	 hp.option();
	 System.out.println("options selected");
     }
   
}
