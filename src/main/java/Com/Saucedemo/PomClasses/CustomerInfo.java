package Com.Saucedemo.PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerInfo 
{
	 private WebDriver driver;
	   
	   @FindBy(xpath="//input[@id='first-name']")
	   private WebElement firstName;
	   public void Fname()
	   {
		   firstName.sendKeys("aaaaaa");
	   }
	   
	   
	   @FindBy(xpath="//input[@id='last-name']")
	   private WebElement lastName;
	   public void LName()
	   {
		   lastName.sendKeys("bbbbb");
	   }
	   
	   
	   @FindBy(xpath="//input[@id='postal-code']")
	   private WebElement zipCode;
	   public void zipCode()
	   {
		   zipCode.sendKeys("1234");
	   }
	   
	   
	   @FindBy(xpath="//input[@id='continue']")
	   private WebElement continue2;
	   public void continue2()
	   {
		   continue2.click();
	   }
	   
	   
	   //constructor
	   
	   public CustomerInfo(WebDriver driver)
       {
    	   this.driver = driver;
    	   
    	   PageFactory.initElements(driver, this);
       }
	   
	   
	   
}
