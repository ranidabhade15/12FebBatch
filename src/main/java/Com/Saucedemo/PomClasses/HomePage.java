package Com.Saucedemo.PomClasses;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage
{
	  private WebDriver driver;
 
     @FindBy(xpath="(//button[text()='Add to cart'])[1]")
     private WebElement AddToCard1;
     
     public void AddToCard1()
     {
    	 AddToCard1.click();
     }
	  
	  
	  
     @FindBy(xpath="(//button[text()='Add to cart'])[2]")
     private WebElement AddToCard2;
     public void AddToCard2()
     {
    	 AddToCard2.click();
     }
	  
	  
	  
     @FindBy(xpath="(//button[text()='Add to cart'])[3]")
     private WebElement AddToCard3;
     public void AddToCard3()
     {
    	 AddToCard3.click();
     }
	  
	  
	  
	  
     @FindBy(xpath="(//button[text()='Add to cart'])[4]")
     private WebElement AddToCard4;
     public void AddToCard4()
     {
    	 AddToCard4.click();
     }
     
     
     
     @FindBy(xpath="//select[@class='product_sort_container']")
     private WebElement filter;
     public void filter()
     {
    	 filter.click();
     }
     
     
     
     @FindBy(xpath="//option[text()='Name (Z to A)']")
     private WebElement option;
     public void option()
     {
    	 option.click();
     }
     
     
     
     @FindBy(xpath="//a[@class='shopping_cart_link']")
     private WebElement basket;
     public void basket()
     {
    	 basket.click();
    	 
     }
   
   
        
     @FindBy(xpath="//button[@id='react-burger-menu-btn']")
     private WebElement menucard;
     public void hamberger()
     {
    	 menucard.click();
     }
     
     
     
     @FindBy(xpath="//a[@id='inventory_sidebar_link']")
     private WebElement AllIteam;
     public void AllIteam()
     {
    	 AllIteam.click();
     }
     
     
     
     @FindBy(xpath="//a[@id='about_sidebar_link']")
     private WebElement About;
     public void About()
     {
    	 About.click();
     }
     
     
     
     @FindBy(xpath="//a[@id='logout_sidebar_link']")
     private WebElement LogOut;
     public void LogOut()
     {
    	 LogOut.click();
     }
     
     
     @FindBy(xpath="//a[@id='reset_sidebar_link']")
     private WebElement ResetAllApp;
     public void ResetAllApp()
     {
    	 ResetAllApp.click();
     }
  
           
  
  
         //mulitiple  product select
  
  
            @FindBy(xpath="//button[text()='Add to cart']")
          
              private List<WebElement>multipleAddToCart;
              
             public void AddAllProduct()
             {
            	 for(int i=0;i<=2;i++)
            	 {
            		 multipleAddToCart.get(i).click();
            	 }
            	 
             }
     
            	 
            	 // constructor
    
           public HomePage(WebDriver driver)
           {
        	   this.driver = driver;
        	   
        	   PageFactory.initElements(driver, this);
           }
            	 
            
            	 
             }
  
  
  
  
  

