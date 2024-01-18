package testcases;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

//Step 1: above the class mention the annotation
@RunWith(Parameterized.class)
public class LoginTest {

	//Step 2: declare the global variables
	String username;
	String password;
	String browser;
	
	//Step 3: Build a constructor
	public LoginTest(String username, String password, String browser) {
		
		this.password=password;
		this.username=username;
		this.browser=browser;
		
	}
	@Test
	public void loginTest() {
		
		System.out.println(username+"----"+password+"----"+browser);
		
	}
	
	//Step 4
	@Parameters
	public static Collection<Object[]> getData(){
		
		Object[][] data = new Object[4][3];//run test 4 time : 3 test parameters
		
		
		//1st row
		data[0][0]="U1";
		data[0][1]="P1";
		data[0][2]="Mozilla";
		//2nd row
		data[1][0]="U2";
		data[1][1]="P2";
		data[1][2]="Chrome";
		//3rd row
		data[2][0]="U3";
		data[2][1]="P3";
		data[2][2]="Edge";
		//4th row
		data[3][0]="U4";
		data[3][1]="P4";
		data[3][2]="Safari";
		
		return Arrays.asList(data);
	}
	
}
