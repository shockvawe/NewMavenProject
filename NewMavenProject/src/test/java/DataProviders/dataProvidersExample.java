package DataProviders;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProvidersExample {
	
	
	
	@DataProvider(name="Data provider")
	public Object[][] DataMethod() {
		
		return new Object[][] {{"input"} ,{"output"},{"status"}};
	}
	
	@Test(dataProvider = "Data provider")
	public void tesctcase(String status, String statu2,String status3) {
		
		System.out.println("Values for data provider " + status);
		System.out.println(statu2);
		System.out.println(status3);
	}
	
	
	
	
	
	
	

}
