package Com.Saucedemo.PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage 
{
   private WebDriver driver;
   
   @FindBy(xpath="//button[@name='continue-shopping']")
   private WebElement continueShop;
   public void continueShop()
   {
	   continueShop.click();
   }
   
//   @FindBy(xpath="//button[@id='remove-sauce-labs-bike-light']")
//   private WebElement remove;
//   {
//	   remove.click();
//   }
   
   
   @FindBy(xpath="//button[@id='checkout']")
   private WebElement checkOut;
   public void CheckOut()
   {
	   checkOut.click();
   }
   
     // constructor
   
      public CartPage(WebDriver driver)
      {
    	  this.driver= driver;
    	  
    	  PageFactory.initElements(driver, this);
    	 
      }
}
