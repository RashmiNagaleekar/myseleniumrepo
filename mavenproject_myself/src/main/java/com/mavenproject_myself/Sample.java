package com.mavenproject_myself;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Leaning Maven");
		Xls_Reader xls = new Xls_Reader("C:\\Users\\Lenovo\\eclipse-workspace\\mavenproject_myself\\Data.xlsx");
		System.out.println(xls.getRowCount("Login"));
		
	}

}