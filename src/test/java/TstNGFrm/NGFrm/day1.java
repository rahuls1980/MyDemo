package TstNGFrm.NGFrm;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day1 {
	
	@Test (groups= {"smoke"}, dependsOnMethods={"demo_day1B"})
	public void demo_day1()
	{ System.out.println("test demo day1"); }
	
	@Test (groups= {"smoke"})
	public void demo_day1B()
	{ System.out.println("test demo_day1B"); }
	
	@Test (enabled=false)
	public void demo_day1C()
	{ System.out.println("test demo_day1C"); }

	@Parameters({"URL","UserName"})
	@Test (groups= {"smoke"})
	public void demo_day1D(String url,String usernm)
	{ System.out.println("test demo_day1D URL= "+url+" UID:="+usernm); }
	
	@BeforeClass
	public void bClass()
	{ System.out.println("executed before day1 class");	}
	
	@AfterClass
	public void aClass()
	{ System.out.println("executed after day1 class");	}
}
