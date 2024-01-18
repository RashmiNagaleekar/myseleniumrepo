package TestPackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringToListOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] itemString= {"items1","items2","items3"};
		System.out.println("itemString list:");
		for(String s:itemString)
			System.out.println(s);
		
		List<String> listString=new ArrayList<String>(Arrays.asList(itemString));
		System.out.println("listString list:");
		for(String s: listString)
			System.out.println(s);
	}

}
