package TestPackage;

import java.util.ArrayList;
import java.util.List;

public class ListOfIntToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> itemInt=new ArrayList<Integer>();
		itemInt.add(1);
		itemInt.add(2);
		itemInt.add(3);
		System.out.println(itemInt);
		
		Integer[] itemArray=new Integer[itemInt.size()];
		itemArray=itemInt.toArray(itemArray);
		
		for(Integer i:itemArray)
			System.out.println(i);

	}

}
