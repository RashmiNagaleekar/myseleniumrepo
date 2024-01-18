package testcases;

import java.util.Date;

import application.util.AppUtil;

//public, private, default, protected
//public - can be accesses anywhere(within the package and outside the package)
//private - only accessible inside the class
//default - if access modifier is not mentioned next to variable or method, bydefault its "default".
//default is accessed within the package
//protected - can be accessed within the package + child classes in current or any other packages

public class AppTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AppUtil app = new AppUtil();
		System.out.println(app.filePath);
		app.print("This is from Print function");
		testUtil test = new testUtil();
		test.testname="AppTest";
		test.printName();
		test.increaseCount();
		
		Date d = new Date();
		System.out.println(d.toString());
	}


}
