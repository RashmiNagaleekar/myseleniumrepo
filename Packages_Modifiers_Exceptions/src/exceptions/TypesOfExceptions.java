package exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import testcases.A;

public class TypesOfExceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			FileInputStream fs = new FileInputStream("D:/info.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		A a = null;
		try {
		a.x = 10;
		}catch(Exception e) {
			System.out.println("Some exception");
			e.printStackTrace();
		}
		}
		
	}
