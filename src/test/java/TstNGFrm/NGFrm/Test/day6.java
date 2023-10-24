package TstNGFrm.NGFrm.Test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class day6 {
	
	@Test (dataProvider="getData")
	public void Siebeltest(String uid,String pwd)
	{
	 System.out.println("UID:="+uid + "-PWD:="+pwd );	
	}
	
	@DataProvider
	
	public Object[][] getData()
	{
		Object[][] data=new Object[3][2];
		
		data[0][0]="1stUserName";
		data[0][1]="1stPWD";
		
		data[1][0]="2ndUserName";
		data[1][1]="2ndPWD";
		
		data[2][0]="3rdUserName";
		data[2][1]="3rdPWD";
		
		return data;
	}

}
