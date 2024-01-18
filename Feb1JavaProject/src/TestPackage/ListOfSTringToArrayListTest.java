package TestPackage;

import java.util.ArrayList;
import java.util.List;

public class ListOfSTringToArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> itemArray=new ArrayList<String>();
		itemArray.add("item1");
		itemArray.add("item2");
		itemArray.add("item3");
		System.out.println("Item Array List");
			System.out.println(itemArray);
		
		String[] itemString=new String[itemArray.size()];
		itemString=itemArray.toArray(itemString);
		
		System.out.println("List of Strings are");
		for(String s:itemString)
			System.out.println(s);

	}

}
