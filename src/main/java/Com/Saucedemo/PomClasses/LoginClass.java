package Com.Saucedemo.PomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginClass 
{
         private WebDriver driver;
         
         
         // find element by @FindBy
           
         @FindBy(xpath="//input[@id='user-name']")
        private WebElement username;
	
         
         public void username()
	// action on  element by using method
         {
        	 username.sendKeys("standard_user");
         }
        
         @FindBy(xpath="//input[@id='password']")
         private WebElement password;
         
         public void password()
         {
        	 password.sendKeys("secret_sauce");
         }
         
         
         @FindBy(xpath="//input[@id='login-button']")
         private WebElement loginButton;
         
         
         public void login()
         
         {
        	 loginButton.click();
         }
         
         
         public LoginClass(WebDriver driver)
         
         {
        	 this.driver= driver;
        	 
        	 PageFactory.initElements(driver, this);
         }
         
         
}
