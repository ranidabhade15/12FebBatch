package Com.Saucedemo.PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BillingPage
{

	 private WebDriver driver;
	   
	   @FindBy(xpath="//button[@id='finish']")
	   private WebElement finish;
	   {
		   finish.click();
	   }
}
