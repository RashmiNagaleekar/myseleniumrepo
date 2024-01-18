package TestPackage;

import java.util.ArrayList;
import java.util.List;

public class ListOfStringtoArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> itemList=new ArrayList<String>();
		itemList.add("item1");
		itemList.add("item2");
		itemList.add("item3");
		
		String[] itemArray=new String[itemList.size()];
		itemArray=itemList.toArray(itemArray);
		
		for(String s:itemArray)
			System.out.println(s);
		

	}

}
