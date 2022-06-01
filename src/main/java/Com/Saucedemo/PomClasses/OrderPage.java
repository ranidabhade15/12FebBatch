package Com.Saucedemo.PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderPage 
{
	 private WebDriver driver;
	   
	   @FindBy(xpath="//button[@id='back-to-products']")
	   private WebElement backhome;
	   {
		   backhome.click();
	   }
}
