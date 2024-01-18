package dataprovider;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class TestDataProvider {

	//step 1
		@DataProvider
		public static Object[][] getData(Method m){
			
			Object[][] data = null;
			System.out.println("Method / Test "+m.getName());
			
			if(m.getName().equals("createUser"))
			{
				
				data = new Object[3][5];//row and columns 
				//row 1
				data[0][0] = "Chrome";
				data[0][1] = "Admin";
				data[0][2] = 1234567890;
				data[0][3] = "Admin@gmail.com";
				data[0][4] = "India";
				
				//row 2
				data[1][0] = "Mozilla";
				data[1][1] = "SuperAdmin";
				data[1][2] = 897654321;
				data[1][3] = "SuperAdmin@gmail.com";
				data[1][4] = "UK";
				
				//row 3
				data[2][0] = "Edge";
				data[2][1] = "Read Only";
				data[2][2] = 987654321;
				data[2][3] = "readonly@gmail.com";
				data[2][4] = "US";
				
				
			}else if(m.getName().equals("deleteUser")){
				data = new Object[2][5];//row and columns 
				
				//row 1
				data[0][0] = "Mozilla";
				data[0][1] = "SuperAdmin";
				data[0][2] = 897654321;
				data[0][3] = "SuperAdmin@gmail.com";
				data[0][4] = "UK";
				
				//row 2
				data[1][0] = "Edge";
				data[1][1] = "Read Only";
				data[1][2] = 987654321;
				data[1][3] = "readonly@gmail.com";
				data[1][4] = "US";
				

				
			}
			return data;
		}
	
}
