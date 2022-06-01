package Practice;

import org.testng.annotations.Test;

public class PriorityKeyWords
{
    @Test(priority=-1)
    public void testA()
    
    {
    	System.out.println("test A");
    }
    
    
    @Test(priority=3)
    public void testB()
    
    {
    	System.out.println("test B");
    }
    
    
    @Test(priority=-4)
    public void testC()
    
    {
    	System.out.println("test C");
    }
    
    
    @Test(priority=2)
    public void testD()
    
    {
    	System.out.println("test D");
    }
}
