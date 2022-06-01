package Practice;

import org.testng.annotations.Test;

public class enableKeyWord
{
     @Test(enabled = false)      //  if TC dont want
     public void method1()
     {
    	 System.out.println("method");  //  by default valu = true
     }
     
     @Test
     public void method2()
     {
    	 System.out.println("method1");
     }
}
