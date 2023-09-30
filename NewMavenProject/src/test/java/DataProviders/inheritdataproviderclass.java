package DataProviders;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class inheritdataproviderclass {

	@DataProvider(name="New test case")
	public Object[][]newtestmethod(){
		
		return new Object[][] {{"input"} ,{"output"},{"status"},{"execution"}};
		
	}
	
	
}