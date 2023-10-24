package TstNGFrm.NGFrm.Test;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class day5 {
	
	@Parameters({"URL"})
	@Test (groups= {"smoke"})
	public void bankingtest(String url)
	{
	 System.out.println("banking test = "+ url);	
	}

}
