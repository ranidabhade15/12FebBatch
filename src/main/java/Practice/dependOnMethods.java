package Practice;


import org.testng.Assert;
import org.testng.annotations.Test;

public class dependOnMethods 
{
    @Test(priority=2)
    public void loginTest()
    {
    	System.out.println("login test");
    	Assert.assertTrue(false);
    }
    @Test(dependsOnMethods= {"loginTest"},priority=1)
    public void logout()
    {
    	System.out.println("logout test");
    }
}
