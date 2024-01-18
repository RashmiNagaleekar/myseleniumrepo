package TestCases.suiteA;

import org.testng.annotations.Test;

import dataprovider.TestDataProvider;

public class CreateUser {

	//step 2 - linking
	//@Test(dataProvider = "getData")//map the data provider
	@Test(dataProviderClass = TestDataProvider.class, dataProvider = "getData")
	public void createUser(String browser, String userType, int phone, String email, String country) {//step 3 - define number of parameters
			
		System.out.println("-------------");
			System.out.println("Browser : "+browser);
			System.out.println("User Type : "+userType);
			System.out.println("Phone : "+phone);
			System.out.println("Email Address : "+email);
			System.out.println("Country : "+country);
		
		
	}
	
	@Test(dataProviderClass = TestDataProvider.class, dataProvider = "getData")
	public void deleteUser(String browser, String userType, int phone, String email, String country) {//step 3 - define number of parameters
			
		System.out.println("-------------");
			System.out.println("Browser : "+browser);
			System.out.println("User Type : "+userType);
			System.out.println("Phone : "+phone);
			System.out.println("Email Address : "+email);
			System.out.println("Country : "+country);
		
		
	}
	
	
}
