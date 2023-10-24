package TstNGFrm.NGFrm;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {
	
	@Test
	public void demo2()
	{
	 System.out.println("test demo2()");	
	}
	
	@Test
	public void demo2method()
	{
	 System.out.println("test demo2method()");	
	}
	
	@BeforeTest
	public void cleandata()
	{
	 System.out.println("I will be execute at Start");	
	}
	
	@AfterTest
	public void closeallconnection()
	{
	 System.out.println("I will be execute at End");	
	}
	
	@BeforeSuite
	public void cleanalltempfileBeforeSuite()
	{
	 System.out.println("I am the Before Suite");	
	}
	
	@AfterSuite
	public void cleanalltempfileAfterSuite()
	{
	 System.out.println("I am the after Suite");	
	}

	@BeforeMethod
	public void bMthod()
	{
	 System.out.println("executed before all day2 methods class");	
	}
	
	@AfterMethod()
	public void aMethod()
	{
	 System.out.println("executed after all day2 methods class");	
	}

	
	
}
