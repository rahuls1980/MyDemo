package TstNGFrm.NGFrm;

import org.testng.annotations.Test;

public class day4 {

	@Test (invocationCount=3)
	public void webloginhomeloan()
	{
	 System.out.println("webloginhomeloan");	
	}
	
	@Test (enabled = true)
	public void mobileloginhomeloan()
	{
	 System.out.println("mobileloginhomeloan");	
	}
	
	@Test (priority = 0)
	public void mobileloginhomeloan2()
	{
	 System.out.println("mobileloginhomeloan2");	
	}
	
	@Test (priority = -1)
	public void apiloginhomeloan()
	{
	 System.out.println("apiloginhomeloan---");	
	}
	
	@Test(timeOut=5000) // time in milliseconds
	public void timeOutExample()
	{
	System.out.println("Timeout test"); 
	}
	
	@Test(expectedExceptions=ArithmeticException.class)
	public void dividedByZeroEx(){
	int e=1/0;
	}
	



}
