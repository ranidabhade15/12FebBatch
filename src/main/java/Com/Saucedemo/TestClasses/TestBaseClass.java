package Com.Saucedemo.TestClasses;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import Com.Saucedemo.PomClasses.LoginClass;

public class TestBaseClass
{
	
   WebDriver driver;
   Logger log;
   
           // browser open
   
     @Parameters("browserName")
	 @BeforeMethod
     public void setUp(String browserName)
  {
	   
	   if(browserName.equals("chrome"))
	   {
  	  System.setProperty("webdriver.chrome.driver",
        		  "C:\\Users\\JMS\\Desktop\\salenium\\chromedriver_win32\\chromedriver.exe");
        	  driver = new ChromeDriver();
        	log  = Logger.getLogger("SauceDemoProjectV2");
            PropertyConfigurator.configure("log4j.properties");
            log.info("url is open");

	   }
	   else if (browserName.equals("firefox")) 
	   {
		   System.setProperty("webdriver.gecko.driver",
	        		  "C:\\Users\\JMS\\Desktop\\salenium\\chromedriver_win32\\geckodriver.exe\\");
	        	  driver = new FirefoxDriver();
	        	  log.info("Browser is open");
	     
	   }
	   else 
	   {
		   log.info("Throw error");
        
	   }
        	
             driver.get("https://www.saucedemo.com/");
        	 log.info("URL is open");
        	
            driver.manage().window().maximize();
            log.info("Browser is maximise");
        
        
    	// login
        
        LoginClass lp = new LoginClass(driver);
  	
  	 lp.username();
  	 log.info("user name entered");
  	 lp.password();
  	 log.info("password enterd");
  	 lp.login();
  	 log.info("login succesfully");
	   }
	  @AfterMethod
      public void tearDown()
      {
    //logout
    
    driver.quit();
    log.info("end of programm");
      
    
}
	 
	 
	 
	 
	 
}
