package dataProvider;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class TestDataProvider {

	@DataProvider 
	public static  Object[][] dataSuiteA(Method m) {
		System.out.println(m.getName());
		
		Object data[][] = null;
		if(m.getName().toUpperCase().equals("TESTA")) {
			data = new Object[2][3];
			//row 1
			data[0][0]="Mozilla";
			data[0][1] = "TestA U1";
			data[0][2] = "TestA P1";
			//row 2
			data[1][0]="Chrome";
			data[1][0] = "TestA U2";
			data[1][1] = "TestA P2";
		}else if(m.getName().toUpperCase().equals("TESTAA")) {
			data = new Object[2][2];
			//row 1
			data[0][0] = "TestAA U1";
			data[0][1] = "TestAA P1";
			//row 2
			data[1][0] = "TestAA U2";
			data[1][1] = "TestAA P2";
		}
		return data;
	}
	
	@DataProvider 
	public static Object[][] dataSuiteB(Method m) {
		System.out.println(m.getName());
		Object data[][] = null;
		data = new Object[2][2];
		//row 1
		data[0][0] = "SuiteB U1";
		data[0][1] = "SuiteB P1";
		//row 2
		data[1][0] = "SuiteB U2";
		data[1][1] = "SuiteB P2";
		return data;
	}
	
	@DataProvider 
	public static Object[][] dataSuiteC(Method m) {
		System.out.println(m.getName());
		Object data[][] = null;
		data = new Object[2][2];
		//row 1
		data[0][0] = "SuiteC U1";
		data[0][1] = "SuiteC P1";
		//row 2
		data[1][0] = "SuiteC U2";
		data[1][1] = "SuiteC P2";
		return data;
	}
	
}
