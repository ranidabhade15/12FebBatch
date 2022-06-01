package Practice;

import org.testng.annotations.Test;

public class TimeOutKeyWord 
{
    @Test 
     public void testA()
     
     {
    	System.out.println("TestA");
     }
    
    @Test(timeOut=2000)
     public void testB() throws InterruptedException
     {
  //  Thread.sleep(10000);
    	System.out.println("TestB");
     }
}
