package Practice;

import org.testng.annotations.Test;

public class InvocationCountKeyWord 
{
	 @Test(invocationCount=2)
	    public void testA()
	    
	    {
	    	System.out.println("test A");
	    }
	    
	    
	    @Test(invocationCount=3)
	    public void testB()
	    
	    {
	    	System.out.println("test B");
	    }
	    
	    
	    @Test(invocationCount=-4)
	    public void testC()
	    
	    {
	    	System.out.println("test C");
	    }
	    
	    
	    @Test(invocationCount=2)
	    public void testD()
	    
	    {
	    	System.out.println("test D");
	    }
	
}
